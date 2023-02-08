package com.ntt.bc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String tipDoc;
    @NotEmpty
    private String numDoc;
    @NotEmpty
    private String email;
    @NotEmpty
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idtipocliente")
    private TipoCliente tipoCliente;
}
