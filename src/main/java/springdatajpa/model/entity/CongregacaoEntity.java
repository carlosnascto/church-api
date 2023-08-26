package springdatajpa.model.entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tab_congregacao")
@Data
public class CongregacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    private Boolean sede;
    private String nome;
    private String cnpj;
    private String pastorLider;
    private Date dataInicio;
    private String email;
    private Long telefone;
    @Embedded
    private EnderecoEntity endereco;
    @Column(name="id_ministerio")
    private Integer ministerio;
    private List<DepartamentoEntity> departamentos;
}
