package com.examen2.examen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen2.examen2.Services.ClienteService;
import com.examen2.examen2.models.Cliente;
import com.examen2.examen2.repositories.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodosClientes() {
        return this.clienteRepository.findAll();
    }

}
