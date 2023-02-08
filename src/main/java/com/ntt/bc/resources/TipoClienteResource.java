package com.ntt.bc.resources;

import java.util.Optional;

import com.ntt.bc.model.TipoCliente;
import com.ntt.bc.service.ITipoClienteService;

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

@Path("/tipoClientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TipoClienteResource {

    @Inject
    private ITipoClienteService iService;

    @GET
    @Transactional
    public Response listarTodo() {
        return Response.ok(this.iService.listarTodo()).build();
    }

    @GET
    @Transactional
    @Path("/:id")
    public Response buscarPorId(@PathParam("id") Long id) {
        TipoCliente tipoCliente = iService.buscarPorId(id);
        if (tipoCliente == null) {
            return Response.noContent().build();
        }
        return Response.ok(tipoCliente).build();
    }

    @POST
    @Transactional
    public Response guardar(@Valid TipoCliente tipoCliente) {
        TipoCliente nuevo = iService.crear(tipoCliente);
        return Response.ok(nuevo).build();
    }

    @PUT
    @Transactional
    @Path("/:id")
    public Response actulizar(@PathParam("id") Long id, @Valid TipoCliente tipoCliente) {
        Optional<TipoCliente> buscarTipoCliente = Optional.of(iService.buscarPorId(id));
        if (buscarTipoCliente.isPresent() == false) {
            return Response.noContent().build();
        }
        tipoCliente.setIdTipoCliente(id);
        TipoCliente actualizar = iService.actualizar(tipoCliente);
        return Response.ok(actualizar).build();
    }

    @DELETE
    @Transactional
    @Path("/:id")
    public Response eliminar(@PathParam("id") Long id) {
        this.iService.eliminar(id);
        return Response.noContent().build();
    }
}
