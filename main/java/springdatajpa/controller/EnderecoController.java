package springdatajpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.Endereco;
import springdatajpa.repository.EnderecoRepository;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoRepository repository;
    @PostMapping
    public void salvar(@RequestBody Endereco endereco){
        repository.save(endereco);
    }

    @PutMapping
    public void alterar(@RequestBody Endereco endereco){
        repository.save(endereco);
    }

    @GetMapping(path = "/{id}")
    public Endereco buscar(@PathVariable("id") Integer id){
        return repository.findById(id).get();
    }
    @GetMapping
    public List<Endereco> listar(){
        return repository.findAll();
    }
}
