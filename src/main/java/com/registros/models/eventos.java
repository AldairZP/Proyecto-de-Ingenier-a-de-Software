package com.registros.models;

import jakarta.persistence.*;


@Entity
public class eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_evento", nullable = false)
    private String tipoEvento;

    @Column(nullable = false)
    private String albergue;

    @Column(nullable = false)
    private Double presupuesto;

    @Column(nullable = false)
    private Integer asistentesHombres;

    @Column(nullable = false)
    private Integer asistentesMujeres;

    @Column(nullable = false)
    private Integer asistentesJovenesHombres;

    @Column(nullable = false)
    private Integer asistentesJovenesMujeres;

    @Column(nullable = false)
    private Integer asistentesNinos;

    @Column(nullable = false)
    private Integer asistentesNinas;

    @Column(nullable = false)
    private String fecha;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    // Getters y setters
    public void setAlbergue(String albergue) {
        this.albergue = albergue;
    }

    public void setAsistentesHombres(Integer asistentesHombres) {
        this.asistentesHombres = asistentesHombres;
    }

    public void setAsistentesJovenesHombres(Integer asistentesJovenesHombres) {
        this.asistentesJovenesHombres = asistentesJovenesHombres;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    public void setAsistentesJovenesMujeres(Integer asistentesJovenesMujeres) {
        this.asistentesJovenesMujeres = asistentesJovenesMujeres;
    }

    public void setAsistentesMujeres(Integer asistentesMujeres) {
        this.asistentesMujeres = asistentesMujeres;
    }

    public void setAsistentesNinas(Integer asistentesNinas) {
        this.asistentesNinas = asistentesNinas;
    }

    public void setAsistentesNinos(Integer asistentesNinos) {
        this.asistentesNinos = asistentesNinos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}