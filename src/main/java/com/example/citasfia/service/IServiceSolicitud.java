package com.example.citasfia.service;

import com.example.citasfia.model.Solicitud;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceSolicitud {
    public List<Solicitud> getAll();

    public void create(Solicitud solicitud);

    public void delete(Integer id);

}
