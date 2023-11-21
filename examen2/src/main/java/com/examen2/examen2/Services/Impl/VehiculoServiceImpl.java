package com.examen2.examen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen2.examen2.Services.VehiculoService;
import com.examen2.examen2.models.Vehiculo;
import com.examen2.examen2.repositories.VehiculoRepository;

public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodosVehiculos() {
        return this.vehiculoRepository.findAll();
    }

}
