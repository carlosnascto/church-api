package springdatajpa.model.dto.response;

import lombok.Data;
import springdatajpa.model.entity.DepartamentoEntity;
import springdatajpa.model.entity.EnderecoEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;
@Data
public class CongregacaoResponse {
    private Integer id;
    private Boolean sede;
    private String nome;
    private String cnpj;
    private String pastorLider;
    private Date dataInicio;
    private String email;
    private Long telefone;
    private EnderecoEntity endereco;
    private Integer ministerio;
    private List<DepartamentoEntity> departamentos;
}
