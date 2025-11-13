package br.edu.ifce.hopebox.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String foto_produto;
    private String nome_produto;
    
    @ManyToOne
    @JoinColumn(name = "usuario_cod_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "usuario_cod_usuario1")
    private Produto produto;

}
