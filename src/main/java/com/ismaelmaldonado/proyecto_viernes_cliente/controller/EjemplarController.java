package com.ismaelmaldonado.proyecto_viernes_cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ismaelmaldonado.proyecto_viernes_cliente.model.Ejemplar;
import com.ismaelmaldonado.proyecto_viernes_cliente.service.EjemplarService;

/**
 * Controlador REST para gestionar operaciones relacionadas con ejemplares en el
 * cliente.
 * 
 * @author Ismael Maldonado
 */
@RestController
public class EjemplarController {

    /** Servicio para gestionar las operaciones relacionadas con ejemplares. */
    @Autowired
    EjemplarService service;

    /**
     * Obtiene todos los ejemplares.
     * 
     * @return Lista de todos los ejemplares.
     */
    @GetMapping(value = "/ejemplares")
    public List<Ejemplar> getAllLibros() {
        return service.getAllEjemplares();
    }

    /**
     * Añade un nuevo ejemplar y devuelve la lista actualizada de ejemplares.
     * 
     * @param isbn     ISBN del ejemplar.
     * @param titulo   Título del ejemplar.
     * @param tematica Temática o género del ejemplar.
     * @return Lista actualizada de ejemplares.
     */
    @PostMapping(value = "/nuevoEjemplar/{isbn}/{titulo}/{tematica}")
    public List<Ejemplar> postDarAltaEjemplarDesdeCliente(@PathVariable("isbn") String isbn,
            @PathVariable("titulo") String titulo, @PathVariable("tematica") String tematica) {

        Ejemplar nuevoEjemplar = new Ejemplar(isbn, titulo, tematica);
        service.darAltaNuevoEjemplar(nuevoEjemplar);
        return service.getAllEjemplares();
    }

}
