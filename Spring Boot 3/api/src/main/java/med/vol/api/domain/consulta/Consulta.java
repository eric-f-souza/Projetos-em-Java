package med.vol.api.domain.consulta;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.vol.api.domain.medico.Medico;
import med.vol.api.domain.paciente.Paciente;

import javax.lang.model.element.Name;
import java.time.LocalDateTime;

@Table(name = "Consultas")
@Entity(name = "Consultas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Consulta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    private LocalDateTime dataHora;

}
