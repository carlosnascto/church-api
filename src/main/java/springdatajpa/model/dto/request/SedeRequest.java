package springdatajpa.model.dto.request;

import lombok.Data;
import springdatajpa.model.entity.Endereco;

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
