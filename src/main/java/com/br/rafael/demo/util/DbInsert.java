package com.br.rafael.demo.util;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.br.rafael.demo.modelo.Genero;
import com.br.rafael.demo.modelo.Obra;
import com.br.rafael.demo.modelo.Usuario;
import com.br.rafael.demo.modelo.enums.TipoObra;
import com.br.rafael.demo.repository.GeneroRepository;
import com.br.rafael.demo.repository.ObraRepository;
import com.br.rafael.demo.repository.UsuarioRepository;

public class DbInsert implements CommandLineRunner{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    GeneroRepository generoRepository;

    @Autowired
    ObraRepository obraRepository;

    @Override
    public void run(String... args) throws Exception {

        //Inserindo Usuário
        Usuario usuario1 = new Usuario(null, 
        "Guilherme", 
        "guidvillaca@gmail.com",
        "123", 
        LocalDateTime.now());
        usuarioRepository.save(usuario1);

        //Inserindo Genero
        Genero genero1 = new Genero(null, "Ação");
        generoRepository.save(genero1);
        Genero genero2 = new Genero(null, "Comédia");
        generoRepository.save(genero2);
        Genero genero3 = new Genero(null, "Drama");
        generoRepository.save(genero3);

        //Inserindo com List
        Genero genero4 = new Genero(null, "Suspense");
        Genero genero5 = new Genero(null, "Terror");
        Genero genero6 = new Genero(null, "Animação");
        List<Genero> generos = Arrays.asList(genero4, genero5, genero6);
        generoRepository.saveAll(generos);


        //Inserindo Obra
        Obra obra1 = new Obra(null, "Duro de Matar",
        "Estrelado por Bruce Willis",
        1988,
        "https://br.web.img2.acsta.net/medias/nmedia/18/92/25/88/20188922.jpg",
        TipoObra.FILME,
        genero1);
        obraRepository.save(obra1);


        
    }

}
