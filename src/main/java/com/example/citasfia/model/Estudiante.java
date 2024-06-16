package com.example.citasfia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Estudiante {
    @Id
    private Integer id;

    private String nombre;
    private String apellido;
    private Integer cif;
    private String email;
}
