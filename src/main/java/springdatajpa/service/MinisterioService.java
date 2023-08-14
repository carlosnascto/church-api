package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.MinisterioRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.entity.MinisterioEntity;
import springdatajpa.repository.MinisterioRepository;

import java.util.ArrayList;
import java.util.List;

//não esquecer estas anotações
//nas novas classes deste pacote
@Service
public class MinisterioService {
    @Autowired
    private MinisterioRepository repository;

    public void incluir(MinisterioRequest request) {
       gravar(null, request);
    }
    public void alterar(Integer id, MinisterioRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, MinisterioRequest request){
        MinisterioEntity entity = null;
        if(id==null)
            entity = new MinisterioEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
    public List<CongregacaoResponse> listar(){
        List<MinisterioEntity> entities = repository.findAll();
        //meio mais basico
        List<CongregacaoResponse> lista = new ArrayList<>();
        for(MinisterioEntity entity:entities){
            CongregacaoResponse response = new CongregacaoResponse();
            BeanUtils.copyProperties(entity, response);
            lista.add(response);
        }
        return lista;
    }
}
