package com.sena.inventrak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.inventrak.dto.UsuarioDto;
import com.sena.inventrak.models.Usuario;
import com.sena.inventrak.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {


    private final UsuarioService iUsuarioService;

    @Autowired
    public UsuarioController(UsuarioService iUsuarioService){
        this.iUsuarioService=iUsuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody UsuarioDto dto){
        return ResponseEntity.ok(this.iUsuarioService.save(dto));
    }
}
