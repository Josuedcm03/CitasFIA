package com.example.citasfia.respository;

import com.example.citasfia.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoCarrera extends JpaRepository<Carrera, Integer> {
}
