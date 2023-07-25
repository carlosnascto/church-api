package springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.Congregacao;
import springdatajpa.model.Programacao;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.ProgramacaoRepository;

import java.util.List;

@RestController
@RequestMapping("/programacao")
public class ProgramacaoController {
    @Autowired
    private ProgramacaoRepository repository;
    @PostMapping
    public void salvar(@RequestBody Programacao programacao){
        repository.save(programacao);
    }

    @PutMapping
    public void alterar(@RequestBody Programacao programacao){
        repository.save(programacao);
    }

    @GetMapping(path = "/{id}")
    public Programacao buscar(@PathVariable("id") Integer id){
        return repository.findById(id).get();
    }
    @GetMapping
    public List<Programacao> listar(){
        return repository.findAll();
    }
}
