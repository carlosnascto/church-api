package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.SedeRequest;
import springdatajpa.model.entity.Sede;
import springdatajpa.repository.SedeRepository;
@Service
public class SedeService {
    @Autowired
    private SedeRepository repository;

    public void incluir(SedeRequest request){
        Sede entity = new Sede();
        BeanUtils.copyProperties(request, entity);
        repository.save(entity);
    }
}
