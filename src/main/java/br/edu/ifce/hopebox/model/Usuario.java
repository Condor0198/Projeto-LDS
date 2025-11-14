package br.edu.ifce.hopebox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_usuario;
    
    private String nome;
    private String email;
    private String cpf;
    private int telefone;
    private int eh_doador;
}
