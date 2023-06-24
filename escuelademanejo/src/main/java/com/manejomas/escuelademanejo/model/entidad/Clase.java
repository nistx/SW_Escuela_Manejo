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
@Table(name = "clase")
public class Clase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cla_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "inst_id")
    Instructor instructor;

    @ManyToOne
    @JoinColumn(name = "matri_id")
    Matricula matricula;

    @ManyToOne
    @JoinColumn(name = "veh_id")
    Vehiculo vehiculo;

    @Column(name = "cla_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;

    @ManyToOne
    @JoinColumn(name = "hor_id")
    Horario horario;

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

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
