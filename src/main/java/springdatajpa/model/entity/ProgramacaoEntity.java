package springdatajpa.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import springdatajpa.model.enums.ProgramacaoTipo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity // indica que esta classe é uma entidade que será mapeada como uma tabela de um banco.
@Table(name = "tab_programacao" ) // indica a tabela que os dados serão persistidas.
@Data
public class ProgramacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private Date data;
    @Embedded
    private EnderecoEntity endereco;
    @Enumerated(EnumType.STRING)
    private ProgramacaoTipo tipo;
    @Column(name="vl_participado")
    private Double valorParticipacao;
    @Column(name="vl_arrecadado")
    private Double valorArrecadado;
    //@Column(name = "programacao_id")
    //private List<ProgramacaoMembro> membros;

}
