package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.SedeRequest;
import springdatajpa.model.entity.SedeEntity;
import springdatajpa.repository.SedeRepository;
@Service
public class SedeService {
    @Autowired
    private SedeRepository repository;

    public void incluir(SedeRequest request) {
        gravar(null, request);
    }
    public void alterar(Integer id, SedeRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, SedeRequest request){
        SedeEntity entity = null;
        if(id==null)
            entity = new SedeEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
}
