package springdatajpa.model.dto.response;

import lombok.Data;
import springdatajpa.model.entity.EnderecoEntity;
import springdatajpa.model.enums.ProgramacaoTipo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data
public class ProgramacaoResponse {
    private Integer id;
    private String nome;
    private Date data;
    private EnderecoEntity endereco;
    private ProgramacaoTipo tipo;
    private Double valorParticipacao;
    private Double valorArrecadado;
}
