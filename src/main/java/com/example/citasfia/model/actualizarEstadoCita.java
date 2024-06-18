package com.example.citasfia.model;

import com.example.citasfia.respository.IRepoSolicitud;

public class actualizarEstadoCita(Integer solicitudId, EstadoCita nuevoEstado) {

    Solicitud solicitud = IRepoSolicitud.fin


    Solicitud solicitud = IRepoSolicitud.findById(solicitudId).orElseThrow(()
            -> new RuntimeException("Solicitud no encontrada"));
    solicitud.setEstadoCita(nuevoEstado);
    solicitudRepository.save(solicitud);
}
