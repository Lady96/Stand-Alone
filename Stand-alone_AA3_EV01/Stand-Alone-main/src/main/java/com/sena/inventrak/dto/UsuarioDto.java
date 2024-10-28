package com.sena.inventrak.dto;

public class UsuarioDto {

    private String nombre;
    private String correo;
    private String telefono;
    private String password;

    public String getNombre(){
        return this.nombre;
    
    }

    public String getCorreo(){
        return this.correo;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getPassword(){
        return this.password;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCorreo(String correo){
        this.correo=correo;
        
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setPassword(String password){
        this.password=password;
    }



}

