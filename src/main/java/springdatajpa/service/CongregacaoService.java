package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.CongregacaoRequest;
import springdatajpa.model.entity.CongregacaoEntity;
import springdatajpa.repository.CongregacaoRepository;

//não esquecer estas anotações
//nas novas classes deste pacote
@Service
public class CongregacaoService {
    @Autowired
    private CongregacaoRepository repository;

    public void incluir(CongregacaoRequest request) {
        CongregacaoEntity entity = new CongregacaoEntity();
        BeanUtils.copyProperties(request, entity);
        repository.save(entity);
    }
}
