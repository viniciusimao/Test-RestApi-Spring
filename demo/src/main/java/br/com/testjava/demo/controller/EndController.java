package br.com.testjava.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.testjava.demo.entity.Endereco;
import br.com.testjava.demo.services.EndService;

@RestController
@RequestMapping("/Endereco")
public class EndController {
    
    @Autowired
    private EndService service;


    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco){
        return service.salvar(endereco);
    }

    @GetMapping
    public List<Endereco> listagem(){
        return service.listagem();
    }

}
