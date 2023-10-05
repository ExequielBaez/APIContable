package com.exe.misalario.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
//@Entity(name = "user")
@MappedSuperclass
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idUser;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String genero;
    protected String nacionalidad;
    protected String password;
    protected Boolean status;
    protected String telefono;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
    protected Date fechaNacimiento;
}
