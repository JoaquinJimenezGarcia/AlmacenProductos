package me.jojigarcia.controller;

import me.jojigarcia.model.Almacen;
import me.jojigarcia.model.Categoria;
import me.jojigarcia.model.Producto;

import java.util.Scanner;

/**
 * Created by joaquinjimenezgarcia on 10/5/17.
 */
public class AlmacenApp {
    Almacen almacen;

    public AlmacenApp(){
        almacen = new Almacen();
    }

    public void run(){
        int option;

        while ((option = showMenu())!= 0){
            switch (option) {
                case 1:
                    almacen.sumarProducto(leerProducto());
                    break;
                case 2:
                    if (almacen.longitud()>0){
                        almacen.mostrarProductos(1);
                    }
                    break;
                case 3:
                    if (almacen.longitud()>0){
                        almacen.mostrarProductos(2);
                    }
                    break;
                case 4:
                    if (almacen.longitud()>0){
                        almacen.mostrarProductos(3);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public Producto leerProducto(){
        Scanner input = new Scanner (System.in);
        String nombre;
        Categoria categoria;
        int indiceCategoria;
        double peso;
        double volumen;
        Producto producto;

        do {
            System.out.println("Inserte el nombre del producto: ");
            nombre = input.next();
        }while (nombre.equals(""));

        do {
            for (Categoria cat: Categoria.values()){
                System.out.println((cat.ordinal() +1) + " - " + cat.toString());
            }

            System.out.println("Inserte categoria: ");
            indiceCategoria = input.nextInt();
        }while (indiceCategoria <= 0 || indiceCategoria >= 4);

        switch (indiceCategoria) {
            case 1:
                categoria = Categoria.INFORMATICA;
                break;
            case 2:
                categoria = Categoria.ELECTRONICA;
                break;
            case 3:
                categoria = Categoria.VIDEOJUEGOS;
                break;
            default:
                categoria = Categoria.VIDEOJUEGOS;
                break;
        }

        do {
            System.out.println("Inserte peso: ");
            peso = input.nextDouble();
        }while (peso <= 0.0);

        do {
            System.out.println("Inserte volumen: ");
            volumen = input.nextDouble();
        }while (volumen <= 0.0);

        producto = new Producto(nombre,categoria,peso,volumen);

        return producto;
    }

    public int showMenu(){
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("******************************************");
        System.out.println("* 1. Registrar producto                  *");
        if (almacen.longitud()>0) {
            System.out.println("* 2. Mostrar productos por peso          *");
            System.out.println("* 3. Mostrar productos por nombre        *");
            System.out.println("* 4. Mostrar productos por nombre y peso *");
        }
        System.out.println("* 0. Salir                               *");
        System.out.println("******************************************");

        System.out.println("Opción: ");
        option = input.nextInt();

        return option;
    }
}
