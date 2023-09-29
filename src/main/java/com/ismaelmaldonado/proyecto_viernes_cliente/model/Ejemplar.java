package com.ismaelmaldonado.proyecto_viernes_cliente.model;

/**
 * Representa un ejemplar de libro en el cliente.
 * 
 * @author Ismael Maldonado
 */
public class Ejemplar {

    /** ISBN del ejemplar, utilizado como identificador único. */
    private String isbn;

    /** Título del ejemplar. */
    private String titulo;

    /** Temática o género del ejemplar. */
    private String tematica;

    /**
     * Constructor por defecto.
     */
    public Ejemplar() {
    }

    /**
     * Constructor que inicializa el ejemplar con un ISBN.
     * 
     * @param isbn ISBN del ejemplar.
     */
    public Ejemplar(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Constructor completo para inicializar un ejemplar.
     * 
     * @param isbn     ISBN del ejemplar.
     * @param titulo   Título del ejemplar.
     * @param tematica Temática o género del ejemplar.
     */
    public Ejemplar(String isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    /**
     * @return ISBN del ejemplar.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece el ISBN del ejemplar.
     * 
     * @param isbn ISBN a establecer.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return Título del ejemplar.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del ejemplar.
     * 
     * @param titulo Título a establecer.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return Temática o género del ejemplar.
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * Establece la temática o género del ejemplar.
     * 
     * @param tematica Temática a establecer.
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ejemplar other = (Ejemplar) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ejemplar [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
    }

}
