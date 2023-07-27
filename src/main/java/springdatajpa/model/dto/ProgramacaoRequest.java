package springdatajpa.model.dto;

import lombok.Data;
import springdatajpa.model.entity.Endereco;
import springdatajpa.model.enums.ProgramacaoTipo;

import java.util.Date;

@Data
public class ProgramacaoRequest {

    private String nome;
    private Date data;

    private Endereco endereco;

    private ProgramacaoTipo tipo;

    private Double valorParticipacao;

    private Double valorArrecadado;

}
