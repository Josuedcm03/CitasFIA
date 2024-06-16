package com.example.citasfia.service;

import com.example.citasfia.model.Estudiante;
import com.example.citasfia.respository.IRepoEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEstudiante implements IServiceEstudiante{
    @Autowired
    private IRepoEstudiante repo;

    @Override
    public List<Estudiante> getAll(){
        return repo.findAll();
    }

    @Override
    public void create(Estudiante estudiante) {
        repo.save(estudiante);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
