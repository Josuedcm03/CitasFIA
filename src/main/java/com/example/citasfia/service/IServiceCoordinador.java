package com.example.citasfia.service;

import com.example.citasfia.model.Coordinador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCoordinador {
    public List<Coordinador> getAll();

    public void create(Coordinador coordinador);

    public void delete(Integer id);
}
