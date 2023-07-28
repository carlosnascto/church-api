package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.ProgramacaoRequest;
import springdatajpa.service.ProgramacaoService;

@RestController
@RequestMapping("/programacoes")
public class ProgramacaoController {
    @Autowired
    private ProgramacaoService service;
    @PostMapping
    public void salvar(@RequestBody ProgramacaoRequest request){
        service.incluir(request);
    }
    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody ProgramacaoRequest request){
        service.alterar(id, request);
    }

}
