package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.ConsultaRepository;
import med.vol.api.domain.consulta.DadosParaAgendamento;
import med.vol.api.domain.exepition.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarPacienteComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository repository;
    public void validar(DadosParaAgendamento dados) {
        if(repository.existsByPacienteIdAndDataHoraBetween(dados.idPaciente(), dados.dataHora().withHour(7), dados.dataHora().withHour(18))) {
            throw new ValidacaoException("Paciente ja possui uma consulta agendada para este dia");
        }
    }
}
