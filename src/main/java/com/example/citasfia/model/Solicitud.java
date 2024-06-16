package com.example.citasfia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data

public class Solicitud {
    @Id
    private Integer id;

    private LocalDateTime fecha_hora;
    private String motivo;
    private String descripcion;

}
