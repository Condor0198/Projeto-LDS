package br.edu.ifce.hopebox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifce.hopebox.Repositories.DoacaoRepository;
import br.edu.ifce.hopebox.model.Doacao;

public class DoacaoController {
    @Autowired
    private DoacaoRepository doacaoRepository;

    @GetMapping
    public List<Doacao> listar(){
        return doacaoRepository.findAll();
    }

    @PostMapping
    public Doacao adicionar(@RequestBody Doacao doacao){
        return doacaoRepository.save(doacao);
    }

}

