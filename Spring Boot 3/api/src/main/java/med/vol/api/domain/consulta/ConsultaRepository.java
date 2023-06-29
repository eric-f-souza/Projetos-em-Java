package med.vol.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsByMedicoIdAndDataHora(Long aLong, LocalDateTime localDateTime);


    boolean existsByPacienteIdAndDataHoraBetween(Long aLong, LocalDateTime localDateTime, LocalDateTime localDateTime1);
}
