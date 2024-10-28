package com.sena.inventrak.models;

import javax.persistence.*;

import lombok.Getter;

@Getter
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "password")
    private String password;

    public Usuario(){
        
    }

    public Usuario(String nombre, String correo, String telefono, String password){
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
        this.password=password;
    }

}
