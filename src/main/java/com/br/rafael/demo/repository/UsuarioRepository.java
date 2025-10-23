package com.br.rafael.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.rafael.demo.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
