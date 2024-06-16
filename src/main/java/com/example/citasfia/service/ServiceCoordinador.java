package com.example.citasfia.service;

import com.example.citasfia.model.Coordinador;
import com.example.citasfia.respository.IRepoCoordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCoordinador implements IServiceCoordinador{
    @Autowired
    private IRepoCoordinador repoCoordinador;

    @Override
    public List<Coordinador> getAll(){
        return repoCoordinador.findAll();
    }

    @Override
    public void create(Coordinador coordinador) {
        repoCoordinador.save(coordinador);
    }

    @Override
    public void delete(Integer id) {
        repoCoordinador.deleteById(id);
    }
}
