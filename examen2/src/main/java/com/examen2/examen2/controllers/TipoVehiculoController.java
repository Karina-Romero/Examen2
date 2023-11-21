package com.examen2.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Services.Impl.TipoVehiculoServiceImpl;
import com.examen2.examen2.models.TipoVehiculo;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return tipoVehiculoServiceImpl.crearTipVehiculo(tipoVehiculo);
    }

}
