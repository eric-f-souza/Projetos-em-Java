package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosParaAgendamento;
import med.vol.api.domain.exepition.ValidacaoException;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements  ValidadorAgendamentoDeConsulta{

    public void validar(DadosParaAgendamento dados){
        var data = dados.dataHora();

        var diferencaEmMinutos = Duration.between(LocalDateTime.now(), data).toMinutes();

        if(diferencaEmMinutos < 30){
            throw new ValidacaoException("Consulta deve ser agendada com pelomenos 30 minutos de antecedencia");
        }
    }
}
