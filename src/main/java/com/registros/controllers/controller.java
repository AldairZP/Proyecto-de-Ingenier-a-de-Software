package com.registros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registros.models.eventos;
import com.registros.models.visitasExternas;
import com.registros.models.visitasInternas;
import com.registros.repositories.eventoRepository;
import com.registros.repositories.visitasExternasRespository;
import com.registros.repositories.visitasInternasRepository;

@Controller
public class controller {

    @Autowired
    private eventoRepository  eventoRepository;
    
    @Autowired
    private visitasInternasRepository visitasInternasRepository;
    
    @Autowired
    private visitasExternasRespository visitasExternasRespository;
    
    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    
    @RequestMapping("/eventos")
    public String eventos(){
        return "eventos";
    }

    @PostMapping("/postEventos")
    public ResponseEntity<String> Evento(@RequestBody eventos evento) {
        try {
            // Guardar la visita interna en la base de datos
            eventoRepository.save(evento);
            return new ResponseEntity<>("Visita interna guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la visita interna", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postVisitaInterna")
    public ResponseEntity<String> VisitaInterna(@RequestBody visitasInternas visitaInterna) {
        try {
            // Guardar la visita interna en la base de datos
            visitasInternasRepository.save(visitaInterna);
            return new ResponseEntity<>("Visita interna guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la visita interna", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/postVisitaExterna")
    public ResponseEntity<String> VisitaExterna(@RequestBody visitasExternas visitaExterna) {
        try {
            // Guardar la visita interna en la base de datos
            visitasExternasRespository.save(visitaExterna);
            return new ResponseEntity<>("Visita interna guardada correctamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al guardar la visita interna", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
