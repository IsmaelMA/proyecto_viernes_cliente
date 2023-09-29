package com.ismaelmaldonado.proyecto_viernes_cliente.service;

import java.util.List;
import com.ismaelmaldonado.proyecto_viernes_cliente.model.Ejemplar;

/**
 * Define las operaciones básicas para el servicio de ejemplares en el cliente.
 * 
 * @author Ismael Maldonado
 */
public interface IEjemplarService {

    /**
     * Da de alta un nuevo ejemplar y devuelve la lista actualizada de ejemplares.
     * 
     * @param ejemplar El ejemplar a añadir.
     * @return Lista actualizada de ejemplares.
     */
    List<Ejemplar> darAltaNuevoEjemplar(Ejemplar ejemplar);

    /**
     * Obtiene todos los ejemplares disponibles.
     * 
     * @return Lista de todos los ejemplares.
     */
    List<Ejemplar> getAllEjemplares();
}
