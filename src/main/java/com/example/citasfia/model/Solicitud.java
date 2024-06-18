package com.example.citasfia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data

public class Solicitud {
    @Id
    private Integer solicitudId;

    private LocalDateTime fecha_hora;
    private String motivo;
    private String descripcion;

    private EstadoCita estadoCita;

}
