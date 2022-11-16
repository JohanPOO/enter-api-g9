package com.example.servicios;

import com.example.entidades.Categoria;
import java.util.List;
import java.util.Optional;


public interface CategoriaService {
    
    List<Categoria> findAll();
    
    List<Categoria> findAllCustom();

    Optional<Categoria> findById(Long id);

    Categoria add(Categoria categoria);

    Categoria update(Categoria categoria);

    Categoria delete(Categoria categoria);
}
