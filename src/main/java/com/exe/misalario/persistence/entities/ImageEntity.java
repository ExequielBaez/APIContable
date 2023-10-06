package com.exe.misalario.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImage;
    //private String mime;
    //private String nombre;

    //@Lob
    //@Basic(fetch = FetchType.LAZY)
    @Column(name = "contenido", columnDefinition = "LONGBLOB")
    private byte[] contenido;

    @OneToOne
    protected DeveloperEntity developer;
}
