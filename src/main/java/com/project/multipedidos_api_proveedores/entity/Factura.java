package com.project.multipedidos_api_proveedores.entity;

import jakarta.persistence.*;
import lombok.Data;

//Clase Factura
@Data
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long proveedorId;
    private double subtotal;
    private double totalFactura;
}