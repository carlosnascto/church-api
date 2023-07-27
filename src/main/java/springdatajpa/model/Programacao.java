package springdatajpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity // indica que esta classe é uma entidade que será mapeada como uma tabela de um banco.
@Table(name = "tab_programacao" ) // indica a tabela que os dados serão persistidas.
public class Programacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Date data;
    @Embedded
    private Endereco endereco;
    @Enumerated(EnumType.STRING)
    private ProgramacaoTipo tipo;
    @Column(name="vl_participado")
    private Double valorParticipacao;
    @Column(name="vl_arrecadado")
    private Double valorArrecadado;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "programacao_id")
    private List<ProgramacaoMembro> membros;

    public ProgramacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ProgramacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Double getValorParticipacao() {
        return valorParticipacao;
    }

    public void setValorParticipacao(Double valorParticipacao) {
        this.valorParticipacao = valorParticipacao;
    }

    public Double getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(Double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<ProgramacaoMembro> getMembros() {
        return membros;
    }

    public void setMembros(List<ProgramacaoMembro> membros) {
        this.membros = membros;
    }
}
