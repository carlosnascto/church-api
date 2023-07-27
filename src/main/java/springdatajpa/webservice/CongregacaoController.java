package springdatajpa.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.dto.CongregacaoRequest;
import springdatajpa.service.CongregacaoService;

@RestController
@RequestMapping("/congregacoes")

public class CongregacaoController {
    @Autowired
    private CongregacaoService service;
    @PostMapping
    public void salvar(@RequestBody CongregacaoRequest request){
        service.incluir(request);
    }

}
