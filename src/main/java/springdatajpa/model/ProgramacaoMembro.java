package springdatajpa.model;

import javax.persistence.*;
import java.util.Date;
@Entity // indica que esta classe é uma entidade que será mapeada como uma tabela de um banco.
@Table(name = "tab_programacao_membro" ) // indica a tabela que os dados serão persistidas.
public class ProgramacaoMembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="id_membro")
    private Integer membro;
    @Column(name="vl_pago")
    private Double valorPago;


    public Integer getMembro() {
        return membro;
    }

    public void setMembro(Integer membro) {
        this.membro = membro;
    }
}
