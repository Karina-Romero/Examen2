package com.examen2.examen2.Services;

import java.util.List;

import com.examen2.examen2.models.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerTodosClientes();

}
