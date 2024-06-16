package com.example.citasfia.respository;

import com.example.citasfia.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoSolicitud extends JpaRepository<Solicitud, Integer> {
}
