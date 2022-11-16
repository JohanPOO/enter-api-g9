package com.example.implementaciones;

import com.example.entidades.Cliente;
import com.example.repositorios.ClienteRepository;
import com.example.servicios.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteRepository repositorio;
    
    @Override
    public List<Cliente> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<Cliente> findAllCustom() {
       return repositorio.finAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Cliente add(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        Cliente nuevo_cliente = repositorio.getById(cliente.getCodigo());
        BeanUtils.copyProperties(cliente, nuevo_cliente);
        return repositorio.save(nuevo_cliente);
    }

    @Override
    public Cliente delete(Cliente cliente) {
        Cliente nuevo_cliente = repositorio.getById(cliente.getCodigo());
        nuevo_cliente.setEstado(false);
        return repositorio.save(nuevo_cliente);
    }
    
}
