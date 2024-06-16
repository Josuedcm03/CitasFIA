package com.example.citasfia.service;

import com.example.citasfia.model.Solicitud;
import com.example.citasfia.respository.IRepoSolicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSolicitud  implements IServiceSolicitud{

    @Autowired
    private IRepoSolicitud repoSolicitud;

    @Override
    public List<Solicitud> getAll() {
        return repoSolicitud.findAll();
    }

    @Override
    public void create(Solicitud solicitud) {
        repoSolicitud.save(solicitud);
    }

    @Override
    public void delete(Integer id) {
        repoSolicitud.deleteById(id);
    }
}
