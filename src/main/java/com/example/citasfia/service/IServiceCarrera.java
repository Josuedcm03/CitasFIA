package com.example.citasfia.service;

import com.example.citasfia.model.Carrera;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCarrera {
    public List<Carrera> getAll();

    public void create(Carrera carrera);

    public void delete(Integer id);
}
