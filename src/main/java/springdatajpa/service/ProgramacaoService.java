package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.ProgramacaoRequest;
import springdatajpa.model.entity.Programacao;
import springdatajpa.repository.ProgramacaoRepository;

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
