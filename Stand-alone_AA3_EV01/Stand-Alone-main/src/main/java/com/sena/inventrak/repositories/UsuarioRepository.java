package com.sena.inventrak.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.inventrak.models.*;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,String> {

}
