package springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.dto.CongregacaoRequest;
import springdatajpa.model.Congregacao;
import springdatajpa.repository.CongregacaoRepository;
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

}
