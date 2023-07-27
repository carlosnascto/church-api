package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.dto.ProgramacaoRequest;
import springdatajpa.model.Endereco;
import springdatajpa.model.Programacao;
import springdatajpa.model.ProgramacaoMembro;
import springdatajpa.model.ProgramacaoTipo;
import springdatajpa.repository.ProgramacaoRepository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Service
public class ProgramacaoService {
    @Autowired
    private ProgramacaoRepository repository;

    public void incluir(ProgramacaoRequest request){
        Programacao entity = new Programacao();
        BeanUtils.copyProperties(request, entity);
        repository.save(entity);
    }

}
