package springdatajpa.model.dto.response;

import lombok.Data;
import springdatajpa.model.entity.EnderecoEntity;
import springdatajpa.model.enums.MembroTipo;
import springdatajpa.model.enums.Sexo;

import javax.persistence.Column;
import javax.persistence.Embedded;

@Data
public class MembroResponse {
    private Integer id;
    private String nome;
    private Long telefone;
    private MembroTipo tipo;
    private Sexo sexo;
    private EnderecoEntity endereco;
    private Integer congregacao;
}
