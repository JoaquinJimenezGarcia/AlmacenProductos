package me.jojigarcia.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by joaquinjimenezgarcia on 10/5/17.
 */
public class Almacen {
    private ArrayList<Producto> productos;

    public Almacen(){
        productos = new ArrayList<>();
    }

    public void sumarProducto(Producto producto){
        if (producto != null){
            productos.add(producto);
        }
    }

    public void mostrarProductos(){
        Collections.sort(productos, Producto.comparadorPorPeso);

        for (Producto producto: productos){
            System.out.println(producto);
        }
    }

    public int longitud(){
        return productos.size();
    }
}
