package springdatajpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdatajpa.dto.ProgramacaoRequest;
import springdatajpa.dto.SedeRequest;
import springdatajpa.model.Sede;
import springdatajpa.repository.SedeRepository;
import springdatajpa.service.ProgramacaoService;
import springdatajpa.service.SedeService;

import java.util.List;

@RestController
@RequestMapping("/sedes")

public class SedeController {
    @Autowired
    private SedeService service;
    @PostMapping
    public void salvar(@RequestBody SedeRequest request){
        service.incluir(request);
    }

}