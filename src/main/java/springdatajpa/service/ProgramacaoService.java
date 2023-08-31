package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.ProgramacaoRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.ProgramacaoResponse;
import springdatajpa.model.entity.CongregacaoEntity;
import springdatajpa.model.entity.ProgramacaoEntity;
import springdatajpa.repository.ProgramacaoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramacaoService {
    @Autowired
    private ProgramacaoRepository repository;

    public void incluir(ProgramacaoRequest request) {
        gravar(null, request);
    }
    public void alterar(Integer id, ProgramacaoRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, ProgramacaoRequest request){
        ProgramacaoEntity entity = null;
        if(id==null)
            entity = new ProgramacaoEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
    public List<ProgramacaoResponse> listar(){
        List<ProgramacaoEntity> entities = repository.findAll();
        //meio mais basico
        List<ProgramacaoResponse> lista = new ArrayList<>();
        for(ProgramacaoEntity entity:entities){
            ProgramacaoResponse response = new ProgramacaoResponse();
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
