package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.ConsultaRepository;
import med.vol.api.domain.consulta.DadosParaAgendamento;
import med.vol.api.domain.exepition.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosParaAgendamento dados) {
        if (repository.existsByMedicoIdAndDataHora(dados.idMedico(), dados.dataHora())) {
            throw new ValidacaoException("Médico ja possui uma consulta agendada para este horário");
        }
    }
}
