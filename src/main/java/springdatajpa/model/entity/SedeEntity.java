package springdatajpa.model.entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tab_sedes")
@Data
public class SedeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private String cnpj;
    private String pastorLider;
    private Date dataInicio;
    private String email;
    private Long telefone;
    @Embedded
    private Endereco endereco;
    @Column(name="id_congregacao")
    private Integer congregacao;


}
