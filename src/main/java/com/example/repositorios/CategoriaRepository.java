package com.example.repositorios;

import com.example.entidades.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    @Query("Select ct from CategoriaEntity ct where ct.estado=1")
    List<Categoria> finAllCustom();
}
