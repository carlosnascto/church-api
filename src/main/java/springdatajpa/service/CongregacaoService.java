package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.CongregacaoRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.MinisterioResponse;
import springdatajpa.model.entity.CongregacaoEntity;
import springdatajpa.model.entity.MinisterioEntity;
import springdatajpa.repository.CongregacaoRepository;

import java.util.ArrayList;
import java.util.List;

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
    public List<CongregacaoResponse> listar(){
        List<CongregacaoEntity> entities = repository.findAll();
        //meio mais basico
        List<CongregacaoResponse> lista = new ArrayList<>();
        for(CongregacaoEntity entity:entities){
            CongregacaoResponse response = new CongregacaoResponse();
            BeanUtils.copyProperties(entity, response);
            lista.add(response);
        }
        return lista;
    }
    public void deletar(Integer id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }
}
