package springdatajpa.webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.CongregacaoRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.MinisterioResponse;
import springdatajpa.service.CongregacaoService;

import java.util.List;

@RestController
@RequestMapping("/congregacoes")

public class CongregacaoController {
    @Autowired
    private CongregacaoService service;
    @PostMapping
    public void salvar(@RequestBody CongregacaoRequest request){
        service.incluir(request);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody CongregacaoRequest request){
        service.alterar(id, request);
    }

    @GetMapping
    public List<CongregacaoResponse> listar(){
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }
}

