package com.ntt.bc.repository;

import com.ntt.bc.model.TipoCliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoClienteRepository implements PanacheRepository<TipoCliente> {

}
