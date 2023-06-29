package med.vol.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.vol.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosParaAgendamento(
        @NotNull
        Long idMedico,

        @NotNull
        Long idPaciente,
        @NotNull
        @Future
        LocalDateTime dataHora,
        Especialidade especialidade) {

}
