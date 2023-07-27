package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.dto.CongregacaoRequest;
import springdatajpa.dto.ProgramacaoRequest;
import springdatajpa.model.Congregacao;
import springdatajpa.model.Programacao;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.ProgramacaoRepository;

//não esquecer estas anotações
//nas novas classes deste pacote
@Service
public class CongregacaoService {
    @Autowired
    private CongregacaoRepository repository;

    public void incluir(CongregacaoRequest request) {
        Congregacao entity = new Congregacao();
        BeanUtils.copyProperties(request, entity);
        repository.save(entity);
    }
}
