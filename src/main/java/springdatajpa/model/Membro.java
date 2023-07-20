package springdatajpa.model;
import javax.persistence.*;

@Entity // indica que esta classe é uma entidade que será mapeada como uma tabela de um banco.
@Table(name = "tab_membros") // indica a tabela que os dados serão persistidas.

public class Membro {
    @Id // indica que o atributo é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o atributo será gerado automaticamente no banco.

    private Integer id;
    private String nome;
    private Long telefone;

    private MembroTipo tipo;
    private Sexo sexo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public MembroTipo getTipo() {
        return tipo;
    }

    public void setTipo(MembroTipo tipo) {
        this.tipo = tipo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}