package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.CongregacaoRequest;
import springdatajpa.model.dto.MembroRequest;
import springdatajpa.model.entity.CongregacaoEntity;
import springdatajpa.model.entity.MembroEntity;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.MembroRepository;

@Service
public class MembroService {
    @Autowired
    private MembroRepository repository;

    public void incluir(MembroRequest request) {
        gravar(null, request);
    }
    public void alterar(Integer id, MembroRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, MembroRequest request){
        MembroEntity entity = null;
        if(id==null)
            entity = new MembroEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
}