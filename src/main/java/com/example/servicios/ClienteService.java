package com.example.servicios;

import com.example.entidades.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    
    List<Cliente> findAll();
    
    List<Cliente> findAllCustom();

    Optional<Cliente> findById(Long id);

    Cliente add(Cliente cliente);

    Cliente update(Cliente categoria);

    Cliente delete(Cliente categoria);
}
