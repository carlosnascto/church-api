package springdatajpa.model.dto.request;

import lombok.Data;
import springdatajpa.model.entity.EnderecoEntity;
import springdatajpa.model.enums.ProgramacaoTipo;

import java.util.Date;

@Data
public class ProgramacaoRequest {

    private String nome;
    private Date data;

    private EnderecoEntity endereco;

    private ProgramacaoTipo tipo;

    private Double valorParticipacao;

    private Double valorArrecadado;

}
