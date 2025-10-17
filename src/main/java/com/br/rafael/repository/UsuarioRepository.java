package com.br.rafael.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.rafael.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
