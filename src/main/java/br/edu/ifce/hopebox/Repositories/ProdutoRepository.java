package br.edu.ifce.hopebox.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.hopebox.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}