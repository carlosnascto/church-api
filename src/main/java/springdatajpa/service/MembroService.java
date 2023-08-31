package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.MembroRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.MembroResponse;
import springdatajpa.model.entity.CongregacaoEntity;
import springdatajpa.model.entity.MembroEntity;
import springdatajpa.repository.MembroRepository;

import java.util.ArrayList;
import java.util.List;

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
    public List<MembroResponse> listar(){
        List<MembroEntity> entities = repository.findAll();
        //meio mais basico
        List<MembroResponse> lista = new ArrayList<>();
        for(MembroEntity entity:entities){
            MembroResponse response = new MembroResponse();
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