package com.example.citasfia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Coordinador {
    @Id
    private Integer id;

    private String nombreCoordinador;
    private String apellidoCoordinador;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carrera_id", referencedColumnName = "id")
    private Carrera carrera;

}
