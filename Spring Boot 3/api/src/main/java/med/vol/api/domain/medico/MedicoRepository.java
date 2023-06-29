package med.vol.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
   Page<Medico> findAllByAtivoTrue(Pageable pageable);

   @Query("""
            select m from Medico m
            where 
            m.ativo = true
            and 
            m.especialidade = :especialidade
            and
            m.id not in(
                select c.medico.id from Consultas c
                where 
                c.dataHora = :dataHora
            )
            order by random()
            limit 1
            """)
    Medico escolherMedicoLivre(Especialidade especialidade, LocalDateTime dataHora);

    @Query("""
            select m.ativo
            from Medico m
            where 
            m.id = :idMedico
            """)
    Boolean findAtivoById(Long idMedico);
}
