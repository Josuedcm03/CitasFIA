package com.example.citasfia.service;


import com.example.citasfia.model.Carrera;
import com.example.citasfia.respository.IRepoCarrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCarrera implements IServiceCarrera{
    @Autowired
    private IRepoCarrera repoCarrera;

    @Override
    public List<Carrera> getAll() {
        return repoCarrera.findAll();
    }

    @Override
    public void create(Carrera carrera) {
        repoCarrera.save(carrera);
    }

    @Override
    public void delete(Integer id) {
        repoCarrera.deleteById(id);
    }
}
