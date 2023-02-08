package com.ntt.bc.repository;

import com.ntt.bc.model.Cliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente> {

    /*
     * public List<Cliente> findByTipClientes(String tipoCliente) {
     * return list("tipoCliente", tipoCliente);
     * }
     * 
     * public List<Cliente> findByTipDocAndNroDoc(String tipDoc, String numDoc) {
     * return find("tipDoc = ?1 and numDoc =?2", tipDoc, numDoc).list();
     * }
     */
}
