package com.viveiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.viveiro.viveiro.Usuario;
import com.viveiro.viveiro.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*") // permite acesso do frontend
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Endpoint de login (autenticação)
    @PostMapping("/auth")
    public ResponseEntity<Usuario> autenticar(@RequestBody Usuario login) {
        Usuario usuario = usuarioRepository.findByEmail(login.getEmail());

        if (usuario != null && usuario.getSenha().equals(login.getSenha())) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); // falha no login
        }
    }

    // Endpoint de cadastro
    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario novoUsuario) {
        Usuario existente = usuarioRepository.findByEmail(novoUsuario.getEmail());

        if (existente != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build(); // email já existe
        }

        Usuario salvo = usuarioRepository.save(novoUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}

