package com.example.servicios;

import com.example.entidades.Proveedor;
import java.util.List;
import java.util.Optional;


public interface ProveedorService {
    
    List<Proveedor> findAll();
    
    List<Proveedor> findAllCustom();

    Optional<Proveedor> findById(Long id);

    Proveedor add(Proveedor proveedor);

    Proveedor update(Proveedor proveedor);

    Proveedor delete(Proveedor proveedor);
}
