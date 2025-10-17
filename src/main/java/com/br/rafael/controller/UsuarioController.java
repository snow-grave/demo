package com.br.rafael.controller;

import java.util.List;
import com.br.rafael.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.rafael.modelo.Usuario;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping(value = "listar", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> listar(){
        return ResponseEntity.ok((List<Usuario>) usuarioRepository.findAll());
    }

    @RequestMapping(value = "novo", method = RequestMethod.POST)
    public ResponseEntity<Usuario> novo(@RequestBody Usuario usuario){
        return new ResponseEntity<Usuario>(usuarioRepository.save(usuario), HttpStatus.OK);
    }

}
