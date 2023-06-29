package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosParaAgendamento;
import med.vol.api.domain.exepition.ValidacaoException;
import med.vol.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private MedicoRepository repository;
    public void validar(DadosParaAgendamento dados){
        if(dados.idMedico() == null){
            return;
        }

        var medico = repository.findAtivoById(dados.idMedico());
        if(!medico){
            throw new ValidacaoException("Não e possivel agendar consulta com medicos inativos");
        }
    }
}
