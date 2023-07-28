package springdatajpa.model.dto.request;

import lombok.Data;
import springdatajpa.model.entity.Endereco;
import springdatajpa.model.enums.MembroTipo;
import springdatajpa.model.enums.Sexo;

@Data
public class MembroRequest {
    private String nome;
    private Long telefone;
    private MembroTipo tipo;
    private Sexo sexo;
    private Endereco endereco;
    private Integer sede;
}
