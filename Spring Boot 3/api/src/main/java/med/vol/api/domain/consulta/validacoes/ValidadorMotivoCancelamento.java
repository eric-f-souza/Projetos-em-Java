package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosCancelamento;
import med.vol.api.domain.exepition.ValidacaoException;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMotivoCancelamento implements ValidadorCancelamentoDeConsulta {

    public void validar(DadosCancelamento dadosCancelamento){
        switch (dadosCancelamento.motivoCancelamento().toUpperCase()){
            case "PACIENTE DESISTIU":
                break;
            case "MÉDICO CANCELOU":
                break;
            case "OUTROS":
                break;
            default:
                throw new ValidacaoException("Motivo do cancelamento e invalido, escalha um entre as opções: paciente desistiu, médico cancelou ou outros");
        }
    }
}
