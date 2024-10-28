package com.sena.inventrak.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.inventrak.dto.UsuarioDto;
import com.sena.inventrak.models.Usuario;
import com.sena.inventrak.repositories.UsuarioRepository;
import com.sena.inventrak.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository iUsuarioRepository;

    @Autowired
    public UsuarioServiceImpl(
        UsuarioRepository iUsuarioRepository
    ){
        this.iUsuarioRepository=iUsuarioRepository;
    }

    @Override
    public Usuario save(UsuarioDto dto) {
    return this.iUsuarioRepository.save(new Usuario(dto.getNombre(), dto.getCorreo(), dto.getTelefono(), dto.getPassword()));
    }

}
