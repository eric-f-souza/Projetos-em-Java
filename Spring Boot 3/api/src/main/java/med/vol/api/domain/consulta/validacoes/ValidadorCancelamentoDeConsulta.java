package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosCancelamento;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamento dadosCancelamento);
}
