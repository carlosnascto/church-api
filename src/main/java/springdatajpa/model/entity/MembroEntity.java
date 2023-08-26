package springdatajpa.model.entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import springdatajpa.model.enums.MembroTipo;
import springdatajpa.model.enums.Sexo;

import javax.persistence.*;

@Entity // indica que esta classe é uma entidade que será mapeada como uma tabela de um banco.
@Table(name = "tab_membro") // indica a tabela que os dados serão persistidas.

@Data
public class MembroEntity {
    @Id // indica que o atributo é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o atributo será gerado automaticamente no banco.
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private Long telefone;

    private MembroTipo tipo;
    private Sexo sexo;
    @Embedded
    private EnderecoEntity endereco;
    @Column(name="id_congregacao")
    private Integer congregacao;

}
