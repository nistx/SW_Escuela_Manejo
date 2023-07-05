package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Vehiculo;

public interface IVehiculoService {
    public void guardarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> listarVehiculo(String matriId);

    public List<Vehiculo> mostrarVehiculo();
}
