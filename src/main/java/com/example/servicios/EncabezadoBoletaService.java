package com.example.servicios;

import com.example.entidades.EncabezadoBoleta;
import java.util.List;
import java.util.Optional;


public interface EncabezadoBoletaService {
    
    List<EncabezadoBoleta> findAll();
    
    List<EncabezadoBoleta> findAllCustom();

    Optional<EncabezadoBoleta> findById(String id);

    EncabezadoBoleta add(EncabezadoBoleta encabezadoBoleta);

    EncabezadoBoleta update(EncabezadoBoleta encabezadoBoleta);

    EncabezadoBoleta delete(EncabezadoBoleta encabezadoBoleta);
}
