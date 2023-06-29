package med.vol.api.domain.medico;

import med.vol.api.domain.consulta.Consulta;
import med.vol.api.domain.endereco.DadosEndereco;
import med.vol.api.domain.paciente.DadosCadastroPaciente;
import med.vol.api.domain.paciente.Paciente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class MedicoRepositoryTest {

    @Autowired
    private MedicoRepository repository;

    @Autowired
    private TestEntityManager em;

    @Test
    @DisplayName("deveria devolver null quando o unico medico cadastrado não esta disponivel")
    void escolherMedicoLivreCenario1() {
        var proximaSegundaAs10 = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .atTime(10,0);

        var medico = cadastrarMedico("Medico", "medico@vollmed.med", "123456", Especialidade.CARDIOLOGIA);
        var paciente = cadastrarPaciente("Paciente", "paciente@voll.med", "0000000000");
        cadastrarConsulta(medico, paciente, proximaSegundaAs10);

        var medicoLivre = repository.escolherMedicoLivre(Especialidade.CARDIOLOGIA, proximaSegundaAs10);
        assertThat(medicoLivre).isNull();
    }

    @Test
    @DisplayName("deveria devolver medico quando o unico medicoativo estiver disponivel")
    void escolherMedicoLivreCenario2() {
        var proximaSegundaAs10 = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .atTime(10,0);

        var medico = cadastrarMedico("Medico", "medico@vollmed.med", "123456", Especialidade.CARDIOLOGIA);

        var medicoLivre = repository.escolherMedicoLivre(Especialidade.CARDIOLOGIA, proximaSegundaAs10);
        assertThat(medicoLivre).isEqualTo(medico);
    }

    @Test
    @DisplayName("deveria devolver true quando medico estiver ativo")
    void encontrarMedicoAtivoPeloIDCenario1() {

        var medicoCadastro = cadastrarMedico("Medico", "medico@vollmed.med", "123456", Especialidade.CARDIOLOGIA);
        var medico = repository.findAtivoById(medicoCadastro.getId());


        assertThat(true).isEqualTo(medico);
    }

    @Test
    @DisplayName("deveria devolver false quando medico não estiver ativo")
    void encontrarMedicoAtivoPeloIDCenario2() {

        var medicoCadastro = cadastrarMedicoInativo("Medico", "medico@vollmed.med", "123456", Especialidade.CARDIOLOGIA);
        var medico = repository.findAtivoById(medicoCadastro.getId());



        assertThat(false).isEqualTo(medico);
    }

    private void cadastrarConsulta(Medico medico, Paciente paciente, LocalDateTime data) {
        em.persist(new Consulta(null, medico, paciente, data));
    }

    private Medico cadastrarMedico(String nome, String email, String crm, Especialidade especialidade) {
        var medico = new Medico(dadosMedico(nome, email, crm, especialidade));
        em.persist(medico);
        return medico;
    }

    private Medico cadastrarMedicoInativo(String nome, String email, String crm, Especialidade especialidade) {
        var medico = new Medico(dadosMedico(nome, email, crm, especialidade));
        medico.excluir();
        em.persist(medico);
        return medico;
    }

    private Paciente cadastrarPaciente(String nome, String email, String cpf) {
        var paciente = new Paciente(dadosPaciente(nome, email, cpf));
        em.persist(paciente);
        return paciente;
    }

    private DadosCadastroMedico dadosMedico(String nome, String email, String crm, Especialidade especialidade) {
        return new DadosCadastroMedico(
                nome,
                email,
                "61999999999",
                crm,
                especialidade,
                dadosEndereco()
        );
    }

    private DadosCadastroPaciente dadosPaciente(String nome, String email, String cpf) {
        return new DadosCadastroPaciente(
                nome,
                email,
                "61999999999",
                cpf,
                dadosEndereco()
        );
    }

    private DadosEndereco dadosEndereco() {
        return new DadosEndereco(
                "rua xpto",
                "bairro",
                "00000000",
                "Brasilia",
                "DF",
                "DF",
                "99999999"
        );
    }
}