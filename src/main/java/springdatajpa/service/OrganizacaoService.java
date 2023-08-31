package springdatajpa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.model.dto.request.MinisterioRequest;
import springdatajpa.model.dto.request.OrganizacaoRequest;
import springdatajpa.model.dto.response.MinisterioResponse;
import springdatajpa.model.dto.response.OrganizacaoResponse;
import springdatajpa.model.entity.MinisterioEntity;
import springdatajpa.model.entity.OrganizacaoEntity;
import springdatajpa.repository.MinisterioRepository;
import springdatajpa.repository.OrganizacaoRepository;

import java.util.ArrayList;
import java.util.List;

//não esquecer estas anotações
//nas novas classes deste pacote
@Service
public class OrganizacaoService {
    @Autowired
    private OrganizacaoRepository repository;

    public void incluir(OrganizacaoRequest request) {
        gravar(null, request);
    }
    public void alterar(Integer id, OrganizacaoRequest request){
        gravar(id, request);
    }
    private void gravar(Integer id, OrganizacaoRequest request){
        OrganizacaoEntity entity = null;
        if(id==null)
            entity = new OrganizacaoEntity();
        else
            entity = repository.findById(id).orElse(null);

        BeanUtils.copyProperties(request, entity);
        repository.save(entity);

    }
    public List<OrganizacaoResponse> listar(){
        List<OrganizacaoEntity> entities = repository.findAll();
        //meio mais basico
        List<OrganizacaoResponse> lista = new ArrayList<>();
        for(OrganizacaoEntity entity:entities){
            OrganizacaoResponse response = new OrganizacaoResponse();
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
