package com.project.multipedidos_api_proveedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.multipedidos_api_proveedores.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {}