package springdatajpa.model.dto.request;

import lombok.Data;
import springdatajpa.model.entity.EnderecoEntity;

import java.util.Date;
@Data
public class CongregacaoRequest {
    private String nome;
    private Boolean sede;
    private String cnpj;
    private String pastorLider;
    private Date dataInicio;
    private String email;
    private Long telefone;
    private EnderecoEntity endereco;
    private Integer congregacao;
}
