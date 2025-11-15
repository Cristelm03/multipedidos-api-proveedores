package com.project.multipedidos_api_proveedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.multipedidos_api_proveedores.entity.Factura;

//Repository de Factura
public interface FacturaRepository extends JpaRepository<Factura, Long> {}