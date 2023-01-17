package br.com.testjava.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testjava.demo.entity.Endereco;
import br.com.testjava.demo.repository.EndReposi;

@Service
public class EndService {
    @Autowired
    private EndReposi repositorio;

    public Endereco salvar(Endereco endereco){
        return repositorio.save(endereco);
    }

    public List<Endereco> listagem(){
        return repositorio.findAll();
    }
}
