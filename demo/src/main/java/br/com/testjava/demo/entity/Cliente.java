package br.com.testjava.demo.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NomeCli", nullable = false)
    private String nome;

    @Column(name = "DataCli", nullable = false)
    private String data;

    @ManyToOne
    @JoinColumn
    private Endereco endereco;



}
