package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IVehiculoDAO;
import com.manejomas.escuelademanejo.model.entidad.Vehiculo;

@Service
public class VehiculoServiceImp implements IVehiculoService {
    @Autowired
    private IVehiculoDAO vehiculoDAO;

    @Override
    public void guardarVehiculo(Vehiculo vehiculo) {
        if (vehiculo.getCarroEstu() == null) {
            vehiculo.setCarroEstu("0");
        }
        vehiculoDAO.save(vehiculo);
    }

    @Override
    public List<Vehiculo> listarVehiculo(String matriId) {
        return (List<Vehiculo>) vehiculoDAO.listarVehiculo(matriId);
    }

    @Override
    public List<Vehiculo> mostrarVehiculo() {
        return (List<Vehiculo>) vehiculoDAO.findAll();
    }

}
