package springdatajpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.model.Sede;
import springdatajpa.repository.SedeRepository;

import java.util.List;

@RestController
@RequestMapping("/sedes")

public class SedeController {
    @Autowired
    private SedeRepository repository;
    @PostMapping
    public void salvar(@RequestBody Sede sede){
        repository.save(sede);
    }

    @PutMapping
    public void alterar(@RequestBody Sede sede){
        repository.save(sede);
    }

    @GetMapping(path = "/{id}")
    public Sede buscar(@PathVariable("id") Integer id){
        return repository.findById(id).get();
    }
    @GetMapping
    public List<Sede> listar(){
        return repository.findAll();
    }
}