package com.ntt.bc.service.impl;

import java.util.List;

import com.ntt.bc.model.TipoCliente;
import com.ntt.bc.repository.TipoClienteRepository;
import com.ntt.bc.service.ITipoClienteService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TipoClienteServiceImpl implements ITipoClienteService {

    @Inject
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crear(TipoCliente obj) {
        this.tipoClienteRepository.persist(obj);
        return obj;
    }

    @Override
    public TipoCliente actualizar(TipoCliente obj) {
        this.tipoClienteRepository.persist(obj);
        return obj;
    }

    @Override
    public List<TipoCliente> listarTodo() {

        return this.tipoClienteRepository.listAll();
    }

    @Override
    public TipoCliente buscarPorId(Long id) {

        return this.tipoClienteRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {

        this.tipoClienteRepository.deleteById(id);
    }

}
