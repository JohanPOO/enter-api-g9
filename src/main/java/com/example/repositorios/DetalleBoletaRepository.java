package com.example.repositorios;

import com.example.entidades.DetalleBoleta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DetalleBoletaRepository extends JpaRepository<DetalleBoleta, String>{
    @Query("Select dt from DetalleBoletaEntity dt where dt.estado=1")
    List<DetalleBoleta> finAllCustom();
}
