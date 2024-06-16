package com.example.citasfia.respository;


import com.example.citasfia.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoEstudiante extends JpaRepository<Estudiante, Integer> {
}
