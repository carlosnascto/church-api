package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.DepartamentoRequest;
import springdatajpa.model.dto.request.MinisterioRequest;
import springdatajpa.model.dto.response.DepartamentoResponse;
import springdatajpa.model.dto.response.MinisterioResponse;
import springdatajpa.model.entity.DepartamentoEntity;
import springdatajpa.model.entity.MinisterioEntity;
import springdatajpa.repository.DepartamentoRepository;
import springdatajpa.repository.MinisterioRepository;

import java.util.ArrayList;
import java.util.List;

//não esquecer estas anotações
//nas novas classes deste pacote
@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository repository;

    public void incluir(DepartamentoRequest request) {
        gravar(null, request);
    }
    public void alterar(Integer id, DepartamentoRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, DepartamentoRequest request){
        DepartamentoEntity entity = null;
        if(id==null)
            entity = new DepartamentoEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
    public List<DepartamentoResponse> listar(){
        List<DepartamentoEntity> entities = repository.findAll();
        //meio mais basico
        List<DepartamentoResponse> lista = new ArrayList<>();
        for(DepartamentoEntity entity:entities){
            DepartamentoResponse response = new DepartamentoResponse();
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
