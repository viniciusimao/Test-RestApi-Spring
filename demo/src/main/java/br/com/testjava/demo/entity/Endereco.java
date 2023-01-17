package br.com.testjava.demo.entity;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Endereco")
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EndCli", nullable = false)
    private String endereco;

    @Column(name = "LograCli", nullable = false)
    private String logradouro;

    @Column(name = "CepCli", nullable = false)
    private String cep;

    @Column(name = "NunCli", nullable = false)
    private int numero;

    @Column(name = "CityCli", nullable = false)
    private String cidade;
}
