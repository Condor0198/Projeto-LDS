package br.edu.ifce.hopebox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.hopebox.Repositories.UsuarioRepository;
import br.edu.ifce.hopebox.model.Usuario;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository UsuarioRepository;

    @GetMapping
    public List<Usuario> listar(){
        return UsuarioRepository.findAll();
    }

    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario){
        return UsuarioRepository.save(usuario);
    }

} 

