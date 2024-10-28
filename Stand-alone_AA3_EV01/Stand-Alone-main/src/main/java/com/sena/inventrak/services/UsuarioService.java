package com.sena.inventrak.services;

import com.sena.inventrak.dto.UsuarioDto;
import com.sena.inventrak.models.Usuario;

public interface UsuarioService {

    Usuario save(UsuarioDto dto);

    
} 