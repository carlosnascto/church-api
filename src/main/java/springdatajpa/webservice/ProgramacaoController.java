package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.ProgramacaoRequest;
import springdatajpa.model.dto.response.OrganizacaoResponse;
import springdatajpa.model.dto.response.ProgramacaoResponse;
import springdatajpa.service.ProgramacaoService;

import java.util.List;

@RestController
@RequestMapping("/programacoes")
public class ProgramacaoController {
    @Autowired
    private ProgramacaoService service;
    @PostMapping
    public void salvar(@RequestBody ProgramacaoRequest request){
        service.incluir(request);
    }
    @PatchMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody ProgramacaoRequest request){
        service.alterar(id, request);
    }
    @GetMapping
    public List<ProgramacaoResponse> listar(){
        return service.listar();
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }
}
