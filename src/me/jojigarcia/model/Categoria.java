package me.jojigarcia.model;

/**
 * Created by joaquinjimenezgarcia on 10/5/17.
 */
public enum Categoria {
    INFORMATICA("Informática"),
    ELECTRONICA("Electrónica"),
    VIDEOJUEGOS("Videojuegos");

    private final String categoria;

    Categoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
