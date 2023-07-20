package springdatajpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.Membro;
import springdatajpa.repository.MembroRepository;

import java.util.List;

@RestController
@RequestMapping("/membros")

public class MembroController {
    @Autowired
    private MembroRepository repository;
    @PostMapping
    public void salvar(@RequestBody Membro membro){
        repository.save(membro);
    }

    @PutMapping
    public void alterar(@RequestBody Membro membro){
        repository.save(membro);
    }

    @GetMapping(path = "/{id}")
    public Membro buscar(@PathVariable("id") Integer id){
        return repository.findById(id).get();
    }
    @GetMapping
    public List<Membro> listar(){
        return repository.findAll();
    }
}
