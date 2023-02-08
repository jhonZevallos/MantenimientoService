package com.ntt.bc.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tipo_cliente")
public class TipoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoCliente;
    @NotEmpty
    private String nombre;

    /*
     * @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
     * 
     * @JoinColumn(name = "idtipocliente")
     * private List<Cliente> clientes;
     */
}
