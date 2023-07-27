package springdatajpa.dto;

import lombok.Data;
import springdatajpa.model.Endereco;
import springdatajpa.model.ProgramacaoTipo;

import javax.persistence.*;
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
