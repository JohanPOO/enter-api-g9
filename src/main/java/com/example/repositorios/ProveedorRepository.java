package com.example.repositorios;

import com.example.entidades.Proveedor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
    @Query("Select pv from ProveedorEntity pv where pv.estado=1")
    List<Proveedor> finAllCustom();
}
