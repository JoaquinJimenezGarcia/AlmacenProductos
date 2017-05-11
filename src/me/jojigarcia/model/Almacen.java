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

        if (productos.contains(producto)){
            System.out.println("Produto ya registrado anteriormente. No se registrará.");
            producto = null;
        }

        if (producto != null){
            productos.add(producto);
            System.out.println("Produto registrado con éxito");
        }
    }

    public void mostrarProductos(int tipoComparador){
        switch (tipoComparador){
            case 1:
                Collections.sort(productos, Producto.comparadorPorPeso);
                break;
            case 2:
                Collections.sort(productos, Producto.comparadorPorNombre);
                break;
            case 3:
                Collections.sort(productos, Producto.comparadorPorNombrePeso);
                break;
            default:
                break;
        }

        for (Producto producto: productos){
            System.out.println(producto);
        }
    }

    public int longitud(){
        return productos.size();
    }
}
