package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.CongregacaoRequest;
import springdatajpa.model.dto.request.DepartamentoRequest;
import springdatajpa.service.CongregacaoService;
import springdatajpa.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoService service;
    @PostMapping
    public void salvar(@RequestBody DepartamentoRequest request){
        service.incluir(request);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody DepartamentoRequest request){
        service.alterar(id, request);
    }
}
