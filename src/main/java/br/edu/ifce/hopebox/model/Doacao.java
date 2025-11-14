package br.edu.ifce.hopebox.model;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Doacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddoacao;

    private LocalDateTime data_hora;

    @ManyToOne
    @JoinColumn(name = "usuario_cod_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "produto_cod_produto")
    private Produto produto;
}
