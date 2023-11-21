package com.examen2.examen2.Services;

import java.util.List;

import com.examen2.examen2.models.Vehiculo;

public interface VehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodosVehiculos();

}
