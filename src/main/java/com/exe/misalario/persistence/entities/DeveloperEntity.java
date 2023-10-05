package com.exe.misalario.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "developer")
public class DeveloperEntity extends UserEntity{

    protected Double salario;
    protected String seniority;
    protected String especialidad;
    protected String descripcion;
}
