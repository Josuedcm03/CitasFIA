package com.example.citasfia.service;


import com.example.citasfia.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceEstudiante {
    public List<Estudiante> getAll();

    public void create(Estudiante estudiante);

    public void delete(Integer id);
}