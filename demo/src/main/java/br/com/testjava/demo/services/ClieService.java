package br.com.testjava.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testjava.demo.entity.Cliente;
import br.com.testjava.demo.repository.CliReposi;

@Service
public class ClieService {
    @Autowired
    private CliReposi repositorio;

    public Cliente salvar(Cliente clinete){
        return repositorio.save(clinete);
    }

    public List<Cliente> listagem(){
        return repositorio.findAll();
    }

    public Cliente bucarId(Long id){
        return repositorio.findById(id).get();
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }

    public Cliente atualizar(Cliente cliente){
        return repositorio.save(cliente);
    }

}
