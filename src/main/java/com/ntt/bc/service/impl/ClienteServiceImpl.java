package com.ntt.bc.service.impl;

import java.util.List;

import com.ntt.bc.model.Cliente;
import com.ntt.bc.repository.ClienteRepository;
import com.ntt.bc.service.IClienteService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClienteServiceImpl implements IClienteService {

    @Inject
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crear(Cliente obj) {
        this.clienteRepository.persist(obj);
        return obj;
    }

    @Override
    public Cliente actualizar(Cliente obj) {
        this.clienteRepository.persist(obj);
        return obj;
    }

    @Override
    public List<Cliente> listarTodo() {

        return this.clienteRepository.listAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {

        return this.clienteRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        this.clienteRepository.deleteById(id);
    }

}
