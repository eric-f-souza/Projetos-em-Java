package med.vol.api.domain.consulta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCancelamento(
        @NotNull
        Long idConsulta,
        @NotBlank
        String motivoCancelamento) {
}
