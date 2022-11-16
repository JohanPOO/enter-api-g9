package com.example.servicios;

import com.example.entidades.DetalleBoleta;
import java.util.List;
import java.util.Optional;


public interface DetalleBoletaService {
    
    List<DetalleBoleta> findAll();
    
    List<DetalleBoleta> findAllCustom();

    Optional<DetalleBoleta> findById(String id);

    DetalleBoleta add(DetalleBoleta detalleBoleta);

    DetalleBoleta update(DetalleBoleta detalleBoleta);

    DetalleBoleta delete(DetalleBoleta detalleBoleta);
}
