package com.registros.models;

import jakarta.persistence.*;

@Entity
@Table
public class visitasExternas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_visitante", nullable = false)
    private String nombreVisitante;

    @Column(name = "tipo_visita", nullable = false)
    private String tipoVisita;

    @Column(nullable = false)
    private String albergue;

    @Column(nullable = false)
    private String fechaVisita;

    @Column(nullable = false)
    private Double presupuesto;

    @Column(nullable = false, length = 1000)
    private String motivo;

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

    public void setAlbergue(String albergue) {
        this.albergue = albergue;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}