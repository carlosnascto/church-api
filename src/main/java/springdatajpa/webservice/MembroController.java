package springdatajpa.webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.CongregacaoRequest;
import springdatajpa.model.dto.MembroRequest;
import springdatajpa.service.CongregacaoService;
import springdatajpa.service.MembroService;

@RestController
@RequestMapping("/membros")

public class MembroController {
    @Autowired
    private MembroService service;
    @PostMapping
    public void salvar(@RequestBody MembroRequest request){
        service.incluir(request);
    }
    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody MembroRequest request){
        service.alterar(id, request);
    }
}
