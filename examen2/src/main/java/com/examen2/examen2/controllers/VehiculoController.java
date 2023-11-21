package com.examen2.examen2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen2.examen2.Services.Impl.VehiculoServiceImpl;
import com.examen2.examen2.models.Vehiculo;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/obtenervehiculos")
    public List<Vehiculo> obtenervehiculos() {
        return this.vehiculoServiceImpl.obtenerTodosVehiculos();
    }

}
