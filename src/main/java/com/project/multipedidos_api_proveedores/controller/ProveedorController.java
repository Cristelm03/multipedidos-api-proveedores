package com.project.multipedidos_api_proveedores.controller;

import com.project.multipedidos_api_proveedores.entity.Factura;
import com.project.multipedidos_api_proveedores.entity.Proveedor;
import com.project.multipedidos_api_proveedores.repository.FacturaRepository;
import com.project.multipedidos_api_proveedores.repository.ProveedorRepository;
import com.multipedidos.OperacionesNegocio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProveedorController {

    private final ProveedorRepository proveedorRepo;
    private final FacturaRepository facturaRepo;

    public ProveedorController(ProveedorRepository proveedorRepo, FacturaRepository facturaRepo) {
        this.proveedorRepo = proveedorRepo;
        this.facturaRepo = facturaRepo;
    }

    @GetMapping("/")
    public String status() {
        return "✅ API de Proveedores y Facturación activa y conectada correctamente.";
    }

    @PostMapping("/proveedores")
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorRepo.save(proveedor);
    }

    @GetMapping("/proveedores")
    public List<Proveedor> listarProveedores() {
        return proveedorRepo.findAll();
    }

    @PostMapping("/facturas")
    public Factura crearFactura(@RequestBody Factura factura) {
        factura.setTotalFactura(OperacionesNegocio.calcularTotalConIVA(factura.getSubtotal()));
        return facturaRepo.save(factura);
    }

    @GetMapping("/facturas")
    public List<Factura> listarFacturas() {
        return facturaRepo.findAll();
    }
}