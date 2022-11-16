package com.example.implementaciones;

import com.example.entidades.DetalleBoleta;
import com.example.repositorios.DetalleBoletaRepository;
import com.example.servicios.DetalleBoletaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleBoletaServiceImp implements DetalleBoletaService{

    @Autowired
    private DetalleBoletaRepository repositorio;
    
    @Override
    public List<DetalleBoleta> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<DetalleBoleta> findAllCustom() {
       return repositorio.finAllCustom();
    }

    @Override
    public Optional<DetalleBoleta> findById(String id) {
        return repositorio.findById(id);
    }

    @Override
    public DetalleBoleta add(DetalleBoleta detalleBoleta) {
        return repositorio.save(detalleBoleta);
    }

    @Override
    public DetalleBoleta update(DetalleBoleta detalleBoleta) {
        DetalleBoleta db = repositorio.getById(detalleBoleta.getCodigo());
        BeanUtils.copyProperties(detalleBoleta, db);
        return repositorio.save(db);
    }

    @Override
    public DetalleBoleta delete(DetalleBoleta detalleBoleta) {
        DetalleBoleta db = repositorio.getById(detalleBoleta.getCodigo());
        db.setEstado(false);
        return repositorio.save(db);
    }
    
}
