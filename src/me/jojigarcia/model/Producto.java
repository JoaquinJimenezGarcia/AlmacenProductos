package me.jojigarcia.model;

import java.util.Comparator;

/**
 * Created by joaquinjimenezgarcia on 10/5/17.
 */
public class Producto {
    String nombre;
    Categoria categoria;
    double peso;
    double volumen;

    public Producto() {
        this.nombre = "Desconocido";
        this.categoria = categoria;
        this.peso = 0;
        this.volumen = 0;
    }

    public Producto(String nombre, Categoria categoria, double peso, double volumen) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.peso = peso;
        this.volumen = volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")){
            this.nombre = "Desconocido";
        }else {
            this.nombre = nombre;
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (this.peso < 0){
            this.peso = 0;
        }else {
            this.peso = peso;
        }
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        if (this.volumen < 0){
            this.volumen = 0;
        }else {
            this.volumen = volumen;
        }
    }

    @Override
    public String toString() {
        return "Producto( " +
                "nombre = " + nombre +
                ", categoria = " + categoria +
                ", peso = " + peso +
                ", volumen = " + volumen +
                " )";
    }

    public static Comparator<Producto> comparadorPorPeso = new Comparator<Producto>() {
        @Override
        public int compare(Producto p1, Producto p2) {
            return (int)p1.getPeso() - (int)p2.getPeso();
        }
    };
}
