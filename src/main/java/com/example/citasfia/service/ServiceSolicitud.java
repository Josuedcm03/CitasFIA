package com.example.citasfia.service;

import com.example.citasfia.model.EstadoCita;
import com.example.citasfia.model.Solicitud;
import com.example.citasfia.respository.IRepoSolicitud;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Transactional
    public void actualizarEstadoCita(Integer solicitudId, EstadoCita nuevoEstado) {
        Optional<Solicitud> solicitudOpt = repoSolicitud.findById(solicitudId);
        if (solicitudOpt.isPresent()) {
            Solicitud solicitud = solicitudOpt.get();
            solicitud.setEstadoCita(nuevoEstado);
            repoSolicitud.save(solicitud);
        } else {
            throw new RuntimeException("Solicitud no encontrada");
        }
    }
}
