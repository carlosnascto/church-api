package springdatajpa.webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.CongregacaoRequest;
import springdatajpa.model.dto.SedeRequest;
import springdatajpa.service.SedeService;

@RestController
@RequestMapping("/sedes")

public class SedeController {
    @Autowired
    private SedeService service;
    @PostMapping
    public void salvar(@RequestBody SedeRequest request){
        service.incluir(request);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable("id") Integer id, @RequestBody SedeRequest request){
        service.alterar(id, request);
    }

}