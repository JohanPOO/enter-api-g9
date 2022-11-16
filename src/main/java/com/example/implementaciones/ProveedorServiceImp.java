package com.example.implementaciones;

import com.example.entidades.Proveedor;
import com.example.repositorios.ProveedorRepository;
import com.example.servicios.ProveedorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImp implements ProveedorService{
    
    @Autowired
    private ProveedorRepository repositorio;
    
    @Override
    public List<Proveedor> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<Proveedor> findAllCustom() {
       return repositorio.finAllCustom();
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Proveedor add(Proveedor proveedor) {
        return repositorio.save(proveedor);
    }

    @Override
    public Proveedor update(Proveedor proveedor) {
        Proveedor nuevo_proveedor = repositorio.getById(proveedor.getCodigo());
        BeanUtils.copyProperties(proveedor, nuevo_proveedor);
        return repositorio.save(nuevo_proveedor);
    }

    @Override
    public Proveedor delete(Proveedor proveedor) {
        Proveedor nuevo_proveedor = repositorio.getById(proveedor.getCodigo());
        nuevo_proveedor.setEstado(false);
        return repositorio.save(nuevo_proveedor);
    }
}
