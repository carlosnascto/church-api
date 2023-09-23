package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.CongregacaoRequest;
import springdatajpa.model.dto.request.DepartamentoRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.DepartamentoResponse;
import springdatajpa.service.CongregacaoService;
import springdatajpa.service.DepartamentoService;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoService service;
    @PostMapping
    public void salvar(@RequestBody DepartamentoRequest request){
        service.incluir(request);
    }

    @PatchMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody DepartamentoRequest request){
        service.alterar(id, request);
    }
    @GetMapping
    public List<DepartamentoResponse> listar(){
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }
}
