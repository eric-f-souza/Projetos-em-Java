package med.vol.api.domain.consulta;

import jakarta.validation.ValidationException;
import med.vol.api.domain.consulta.validacoes.ValidadorAgendamentoDeConsulta;
import med.vol.api.domain.exepition.ValidacaoException;
import med.vol.api.domain.medico.Medico;
import med.vol.api.domain.medico.MedicoRepository;
import med.vol.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaDeConsultas {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private List<ValidadorAgendamentoDeConsulta> validadores;

    public DadosDetalhamentoConsulta agendar(DadosParaAgendamento dados){
        if(!pacienteRepository.existsById(dados.idPaciente())){
            throw new ValidacaoException("ID paciente informado não existe!");
        }
        if(dados.idMedico() != null && !medicoRepository.existsById(dados.idMedico())){
            throw new ValidacaoException("ID medico informado não existe!");
        }

        validadores.forEach(v -> v.validar(dados));

        var medico = escolherMedico(dados);
        if(medico == null){
            throw new ValidacaoException("Sem medicos disponiveis para esta data");
        }
        var paciente = pacienteRepository.getReferenceById(dados.idPaciente());
        var consulta = new Consulta(null, medico, paciente, dados.dataHora());
        consultaRepository.save(consulta);

        return new DadosDetalhamentoConsulta(consulta);
    }

    private Medico escolherMedico(DadosParaAgendamento dados) {
        if(dados.idMedico() != null){
            return medicoRepository.getReferenceById(dados.idMedico());
        }
        if(dados.especialidade() == null){
            throw new ValidacaoException("Especialidade é obrigatoria quando não tem um medico selecionado");
        }

        return medicoRepository.escolherMedicoLivre(dados.especialidade(), dados.dataHora());

    }
}
