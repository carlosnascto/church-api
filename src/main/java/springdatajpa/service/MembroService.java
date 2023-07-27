package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.dto.MembroRequest;
import springdatajpa.dto.ProgramacaoRequest;
import springdatajpa.model.Membro;
import springdatajpa.model.Programacao;
import springdatajpa.repository.MembroRepository;
import springdatajpa.repository.ProgramacaoRepository;

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