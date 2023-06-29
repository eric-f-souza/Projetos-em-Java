package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosParaAgendamento;
import med.vol.api.domain.exepition.ValidacaoException;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta{

    public void validar(DadosParaAgendamento dados){
        var data = dados.dataHora();

        var domingo = data.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesHorarioDaClinica = data.getHour() < 7;
        var depoisHoraDaClinica = data.getHour() > 18;

        if(domingo || antesHorarioDaClinica || depoisHoraDaClinica){
            throw new ValidacaoException("Escolha um horario entre segunda a sabado das 7:00 as 19:00");
        }
    }
}
