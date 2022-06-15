package com.crudGroup.Modelo;

import javax.persistence.*;

 


@Entity 
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	private String nombre;

    
    private String password;

    
    private String email;

    public Usuario() {
        super();
    }

    public Usuario(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password=password;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
	
