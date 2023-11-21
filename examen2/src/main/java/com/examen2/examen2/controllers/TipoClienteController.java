package com.examen2.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Services.Impl.TipoClienteServiceImpl;
import com.examen2.examen2.models.TipoCliente;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente guardarTipoCliente(@RequestParam(name = "descripcion") String descripcion) {
        return tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }

}
