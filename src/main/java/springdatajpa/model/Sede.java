package springdatajpa.model;
import javax.persistence.*;
import java.util.Date;
import springdatajpa.model.Endereco;

@Entity
@Table(name = "tab_sedes")

public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String cnpj;
    private String pastorLider;
    private Date dataInicio;
    private String email;
    private Long telefone;
    @Embedded
    private Endereco endereco;
    @Column(name="id_congregacao")
    private Integer congregacao;


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getCongregcao() {
        return congregacao;
    }

    public void setCongregcao(Integer congregcao) {
        this.congregacao = congregcao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPastorLider() {
        return pastorLider;
    }

    public void setPastorLider(String pastorLider) {
        this.pastorLider = pastorLider;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
