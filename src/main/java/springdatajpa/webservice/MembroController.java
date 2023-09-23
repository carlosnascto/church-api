package springdatajpa.webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.request.MembroRequest;
import springdatajpa.model.dto.response.CongregacaoResponse;
import springdatajpa.model.dto.response.MembroResponse;
import springdatajpa.service.MembroService;

import java.util.List;

@RestController
@RequestMapping("/membros")

public class MembroController {
    @Autowired
    private MembroService service;
    @PostMapping
    public void salvar(@RequestBody MembroRequest request){
        service.incluir(request);
    }
    @PatchMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody MembroRequest request){
        service.alterar(id, request);
    }
    @GetMapping
    public List<MembroResponse> listar(){
        return service.listar();
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id){
        service.deletar(id);
    }
}
