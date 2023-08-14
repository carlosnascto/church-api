package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.MinisterioRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.service.MinisterioService;

import java.util.List;

@RestController
@RequestMapping("/ministerios")

public class MinisterioController {
    @Autowired
    private MinisterioService service;

    @PostMapping
    public void salvar(@RequestBody MinisterioRequest request){
        service.incluir(request);
    }
    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody MinisterioRequest request){
        service.alterar(id, request);
    }
    @GetMapping
    public List<CongregacaoResponse> listar(){
        return service.listar();
    }
}
