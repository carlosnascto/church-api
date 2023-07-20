package springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.Congregacao;
import springdatajpa.repository.CongregacaoRepository;

import java.util.List;

@RestController
@RequestMapping("/congregacoes")

public class CongregacaoController {
    @Autowired
    private CongregacaoRepository repository;
    @PostMapping
    public void salvar(@RequestBody Congregacao congregacao){
        repository.save(congregacao);
    }

    @PutMapping
    public void alterar(@RequestBody Congregacao congregacao){
        repository.save(congregacao);
    }

    @GetMapping(path = "/{id}")
    public Congregacao buscar(@PathVariable("id") Integer id){
        return repository.findById(id).get();
    }
    @GetMapping
    public List<Congregacao> listar(){
        return repository.findAll();
    }
}
