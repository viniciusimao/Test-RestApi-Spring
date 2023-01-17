package br.com.testjava.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.testjava.demo.entity.Cliente;
import br.com.testjava.demo.services.ClieService;


@RestController
@RequestMapping("/cliente")
public class CliController {
    
    @Autowired
    private ClieService servico;



    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return servico.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> listagem(){
        return servico.listagem();
    }

    @GetMapping("/{id}")
    public Cliente bucar(@PathVariable("id") Long id){
        return servico.bucarId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id){
        servico.deletar(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") Long id, @ModelAttribute("clientes") Cliente cliente, Model model ){
        Cliente cli = servico.bucarId(id);

        cli.setEndereco(cli.getEndereco());
        
        servico.atualizar(cli);

    }
    



}
