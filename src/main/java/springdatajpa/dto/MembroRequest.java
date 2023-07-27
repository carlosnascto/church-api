package springdatajpa.dto;

import lombok.Data;
import springdatajpa.model.Endereco;
import springdatajpa.model.MembroTipo;
import springdatajpa.model.Sexo;

import javax.persistence.*;
@Data
public class MembroRequest {
    private String nome;
    private Long telefone;
    private MembroTipo tipo;
    private Sexo sexo;
    private Endereco endereco;
    private Integer sede;
}
