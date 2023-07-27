package springdatajpa.dto;

import lombok.Data;
import springdatajpa.model.Endereco;

import javax.persistence.Column;
import javax.persistence.Embedded;
import java.util.Date;
@Data
public class SedeRequest {
    private String nome;
    private String cnpj;
    private String pastorLider;
    private Date dataInicio;
    private String email;
    private Long telefone;
    private Endereco endereco;
    private Integer congregcao;
}
