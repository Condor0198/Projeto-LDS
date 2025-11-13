package br.edu.ifce.hopebox.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.hopebox.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
