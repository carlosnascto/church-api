package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.DepartamentoRequest;
import springdatajpa.model.dto.request.OrganizacaoRequest;
import springdatajpa.service.DepartamentoService;
import springdatajpa.service.OrganizacaoService;

@RestController
@RequestMapping("/organizacoes")
public class OrganizacaoController {
    @Autowired
    private OrganizacaoService service;
    @PostMapping
    public void salvar(@RequestBody OrganizacaoRequest request){
        service.incluir(request);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody OrganizacaoRequest request){
        service.alterar(id, request);
    }
}
