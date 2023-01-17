package br.com.testjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testjava.demo.entity.Endereco;

public interface EndReposi extends JpaRepository<Endereco, Long> {
    
}
