package com.registros.models;

import jakarta.persistence.*;

@Entity
@Table
public class visitasInternas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_visitante", nullable = false)
    private String nombreVisitante;

    @Column(name = "tipo_visita", nullable = false)
    private String tipoVisita;

    @Column(nullable = false)
    private String fechaVisita;

    @Column(nullable = false)
    private String albergue;

    @Column(nullable = false)
    private String personaVisitada;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    // Getters y setters

    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreVisitante(String nombreVisitante) {
        this.nombreVisitante = nombreVisitante;
    }

    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public void setAlbergue(String albergue) {
        this.albergue = albergue;
    }

    public void setPersonaVisitada(String personaVisitada) {
        this.personaVisitada = personaVisitada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}