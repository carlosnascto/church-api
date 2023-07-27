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
       gravar(null, request);
    }
    public void alterar(Integer id, CongregacaoRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, CongregacaoRequest request){
        CongregacaoEntity entity = null;
        if(id==null)
            entity = new CongregacaoEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
}
