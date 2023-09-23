package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.DepartamentoRequest;
import springdatajpa.model.dto.request.OrganizacaoRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.OrganizacaoResponse;
import springdatajpa.service.DepartamentoService;
import springdatajpa.service.OrganizacaoService;

import java.util.List;

@RestController
@RequestMapping("/organizacoes")
public class OrganizacaoController {
    @Autowired
    private OrganizacaoService service;
    @PostMapping
    public void salvar(@RequestBody OrganizacaoRequest request){
        service.incluir(request);
    }

    @PatchMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody OrganizacaoRequest request){
        service.alterar(id, request);
    }
    @GetMapping
    public List<OrganizacaoResponse> listar(){
        return service.listar();
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }
}
