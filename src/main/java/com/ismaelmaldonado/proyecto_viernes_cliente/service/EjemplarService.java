package com.ismaelmaldonado.proyecto_viernes_cliente.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ismaelmaldonado.proyecto_viernes_cliente.model.Ejemplar;

/**
 * Implementación del servicio de ejemplares que utiliza un RestTemplate para
 * interactuar con el microservicio servidor.
 * 
 * @author Ismael Maldonado
 */
@Service
public class EjemplarService implements IEjemplarService {

    /** RestTemplate para realizar llamadas HTTP al microservicio servidor. */
    @Autowired
    RestTemplate template;

    /** URL base del microservicio servidor. */
    private String url = "http://localhost:9090/";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Ejemplar> darAltaNuevoEjemplar(Ejemplar ejemplar) {
        template.postForLocation(url + "libro", ejemplar);
        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Ejemplar> getAllEjemplares() {
        return Arrays.asList(template.getForObject(url + "libros", Ejemplar[].class));
    }

}
