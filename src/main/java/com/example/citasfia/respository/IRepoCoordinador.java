package com.example.citasfia.respository;

import com.example.citasfia.model.Coordinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoCoordinador extends JpaRepository<Coordinador, Integer> {
}
