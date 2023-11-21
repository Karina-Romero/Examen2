package com.examen2.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Services.TipoClienteService;
import com.examen2.examen2.models.TipoCliente;
import com.examen2.examen2.repositories.TipoClienteRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nvTipoCliente = new TipoCliente();
        nvTipoCliente.setDescripcion(descripcion);
        return tipoClienteRepository.save(nvTipoCliente);
    }

}
