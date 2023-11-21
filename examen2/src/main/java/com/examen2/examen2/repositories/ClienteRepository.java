package com.examen2.examen2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.examen2.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
