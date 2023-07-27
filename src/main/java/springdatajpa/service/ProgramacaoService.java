package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.CongregacaoRequest;
import springdatajpa.model.dto.ProgramacaoRequest;
import springdatajpa.model.entity.CongregacaoEntity;
import springdatajpa.model.entity.ProgramacaoEntity;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.ProgramacaoRepository;

@Service
public class ProgramacaoService {
    @Autowired
    private ProgramacaoRepository repository;

    public void incluir(ProgramacaoRequest request) {
        gravar(null, request);
    }
    public void alterar(Integer id, ProgramacaoRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, ProgramacaoRequest request){
        ProgramacaoEntity entity = null;
        if(id==null)
            entity = new ProgramacaoEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
}
