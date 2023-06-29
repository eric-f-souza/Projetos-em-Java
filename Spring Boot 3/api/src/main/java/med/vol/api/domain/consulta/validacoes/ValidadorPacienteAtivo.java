package med.vol.api.domain.consulta.validacoes;

import med.vol.api.domain.consulta.DadosParaAgendamento;
import med.vol.api.domain.exepition.ValidacaoException;
import med.vol.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private PacienteRepository repository;

    public void validar(DadosParaAgendamento dados){

        var pacienteAtivo = repository.findAtivoById(dados.idPaciente());

        if(!pacienteAtivo){
            throw new ValidacaoException("Paciente não esta ativo");
        }

    }
}
