package springdatajpa.model.dto.request;

import lombok.Data;
import springdatajpa.model.entity.EnderecoEntity;
import springdatajpa.model.enums.MembroTipo;
import springdatajpa.model.enums.Sexo;

@Data
public class MembroRequest {
    private String nome;
    private Long telefone;
    private MembroTipo tipo;
    private Sexo sexo;
    private EnderecoEntity endereco;
    private Integer sede;
}
