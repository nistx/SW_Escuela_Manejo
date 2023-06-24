package com.manejomas.escuelademanejo.model.entidad;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "matricula")
public class Matricula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matri_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estu_id")
    Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "cur_id")
    Curso curso;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    Tipo tipo;

    @Column(name = "matri_es_recogido")
    private String esRecogido;

    @Column(name = "matri_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;

    @PrePersist
    @PreUpdate
    public void asignarFecha() {
        fecha_registro = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getEsRecogido() {
        return esRecogido;
    }

    public void setEsRecogido(String esRecogido) {
        this.esRecogido = esRecogido;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
