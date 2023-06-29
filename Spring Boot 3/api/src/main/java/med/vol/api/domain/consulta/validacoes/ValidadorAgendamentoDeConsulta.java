package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosParaAgendamento;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosParaAgendamento dados);
}
