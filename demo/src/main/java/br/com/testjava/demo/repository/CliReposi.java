package br.com.testjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testjava.demo.entity.Cliente;


public interface CliReposi extends JpaRepository<Cliente, Long> {
    
}
