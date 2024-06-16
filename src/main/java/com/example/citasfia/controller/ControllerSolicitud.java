package com.example.citasfia.controller;

import com.example.citasfia.model.Estudiante;
import com.example.citasfia.model.Solicitud;
import com.example.citasfia.service.IServiceSolicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class ControllerSolicitud {
    @Autowired
    private IServiceSolicitud serviceSolicitud;

    @GetMapping("/all")
    public List<Solicitud> getAll(){
        return serviceSolicitud.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> create (@RequestBody Solicitud solicitud){
        serviceSolicitud.create(solicitud);
        return ResponseEntity.ok("Solicitud realizada");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Solicitud solicitud){
        if (solicitud.getId() == null){
            return ResponseEntity.badRequest().body("Id de solicitud no existe.");
        }
        serviceSolicitud.create(solicitud);
        return ResponseEntity.ok("Solicitud Actualizado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if (id == null) {
            return ResponseEntity.badRequest().body("Id solicitud no existente");
        }
        serviceSolicitud.delete(id);
        return ResponseEntity.ok("Solicitud borrado");
    }


}
