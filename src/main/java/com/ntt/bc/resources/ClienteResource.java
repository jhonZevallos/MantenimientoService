package com.ntt.bc.resources;

import java.util.Optional;

import com.ntt.bc.model.Cliente;
import com.ntt.bc.service.IClienteService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/clientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    private IClienteService iService;

    @GET
    @Transactional
    public Response listarTodo() {
        return Response.ok(this.iService.listarTodo()).build();
    }

    @GET
    @Transactional
    @Path("/{id}")
    public Response buscarPorId(@PathParam("id") Long id) {
        Cliente cliente = iService.buscarPorId(id);
        if (cliente == null) {
            return Response.noContent().build();
        }
        return Response.ok(cliente).build();
    }

    @POST
    @Transactional
    public Response guardar(@Valid Cliente cliente) {
        Cliente nuevoCliente = iService.crear(cliente);
        return Response.ok(nuevoCliente).build();
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Response actualizar(@PathParam("id") Long id, @Valid Cliente cliente) {
        Cliente actualizarCliente = iService.actualizar(cliente);
        return Response.ok(actualizarCliente).build();
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public Response eliminar(@PathParam("id") Long id) {
        this.iService.eliminar(id);
        return Response.noContent().build();
    }
}
