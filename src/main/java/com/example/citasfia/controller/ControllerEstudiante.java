package com.example.citasfia.controller;

import com.example.citasfia.model.Estudiante;
import com.example.citasfia.service.IServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.EmptyStackException;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class ControllerEstudiante {
    @Autowired
    private IServiceEstudiante serviceEstudiante;

    @GetMapping("/all")
    public String welcome(){
        return "welcome security";
    }
    /*
    public List<Estudiante> getAll(){
        return serviceEstudiante.getAll();
    }
    */

    @PostMapping("/create")
    public ResponseEntity<String> create (@RequestBody Estudiante estudiante){
        serviceEstudiante.create(estudiante);
        return ResponseEntity.ok("Estudiante añadido correctamente");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Estudiante estudiante){
        if (estudiante.getId() == null){
            return ResponseEntity.badRequest().body("Id no existe.");
        }
        serviceEstudiante.create(estudiante);
        return ResponseEntity.ok("Estudiante Actualizado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if (id == null) {
            return ResponseEntity.badRequest().body("Id no existente");
        }
        serviceEstudiante.delete(id);
        return ResponseEntity.ok("Estudiante borrado");
    }

}
