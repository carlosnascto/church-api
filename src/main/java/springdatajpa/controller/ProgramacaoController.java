package springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.dto.ProgramacaoRequest;
import springdatajpa.model.Congregacao;
import springdatajpa.model.Programacao;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.ProgramacaoRepository;
import springdatajpa.service.ProgramacaoService;

import java.util.List;

@RestController
@RequestMapping("/programacoes")
public class ProgramacaoController {
    @Autowired
    private ProgramacaoService service;
    @PostMapping
    public void salvar(@RequestBody ProgramacaoRequest request){
        service.incluir(request);
    }

}
