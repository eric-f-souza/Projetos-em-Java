package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.ConsultaRepository;
import med.vol.api.domain.consulta.DadosCancelamento;
import med.vol.api.domain.exepition.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;

@Component
public class ValidadorCacelamentoConsultaAntecedencia implements ValidadorCancelamentoDeConsulta {

    @Autowired
    private ConsultaRepository repository;
    public void validar(DadosCancelamento dadosCancelamento){
        if(dadosCancelamento.idConsulta() == null){
            return;
        }

        var consulta = repository.getReferenceById(dadosCancelamento.idConsulta());

        if(consulta == null){
            throw new ValidacaoException("Erro ao buscar consulta");
        }
        var data = LocalDate.now().atStartOfDay().withSecond(0);
        var dataConsulta = consulta.getDataHora();
        var diferenca = Duration.between(data, dataConsulta).toHours();

        if( diferenca <= 24){
            throw new ValidacaoException("Consulta deve ser cancelada com pelomenos 24h de antecedencia");
        }

    }
}
