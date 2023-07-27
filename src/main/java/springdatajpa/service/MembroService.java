package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.MembroRequest;
import springdatajpa.model.entity.Membro;
import springdatajpa.repository.MembroRepository;

@Service
public class MembroService {
    @Autowired
    private MembroRepository repository;

    public void incluir(MembroRequest request) {
        Membro entity = new Membro();
        BeanUtils.copyProperties(request, entity);
        repository.save(entity);
    }
}