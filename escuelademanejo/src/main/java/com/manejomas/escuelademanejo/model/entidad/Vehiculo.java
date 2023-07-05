package com.manejomas.escuelademanejo.model.entidad;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veh_id")
    private Long id;

    @Column(name = "veh_placa")
    private String placa;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    Tipo tipo;

    @Column(name = "veh_marca")
    private String marca;

    @Column(name = "veh_modelo")
    private String modelo;

    @Column(name = "veh_transmision")
    private String transmision;

    @Column(name = "veh_carro_estu")
    private String carroEstu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCarroEstu() {
        return carroEstu;
    }

    public void setCarroEstu(String carroEstu) {
        this.carroEstu = carroEstu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
