package com.example.repositorios;

import com.example.entidades.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
    @Query("Select c from ClienteEntity c where c.estado=1")
    List<Cliente> finAllCustom();
}
