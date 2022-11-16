package com.example.servicios;

import com.example.entidades.Producto;
import java.util.List;
import java.util.Optional;


public interface ProductoService {
    
    List<Producto> findAll();
    
    List<Producto> findAllCustom();

    Optional<Producto> findById(Long id);

    Producto add(Producto producto);

    Producto update(Producto producto);

    Producto delete(Producto producto);
}
