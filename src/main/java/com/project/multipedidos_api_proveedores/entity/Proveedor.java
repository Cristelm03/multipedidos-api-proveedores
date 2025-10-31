package com.project.multipedidos_api_proveedores.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
}