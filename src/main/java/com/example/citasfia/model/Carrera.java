package com.example.citasfia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Carrera {
    @Id
    private Integer id;

    private String nombreCarrera;

    @OneToOne(mappedBy = "carrera", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Coordinador coordinador;

}
