package springdatajpa.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tab_departamento_membro")
@Data
public class DepartamentoMembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    @Column(name="id_departamento")
    private Integer departamento;
    @Column(name="id_membro")
    private Integer membro;
}
