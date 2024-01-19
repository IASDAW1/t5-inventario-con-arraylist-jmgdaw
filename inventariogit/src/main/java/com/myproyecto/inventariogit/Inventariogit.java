/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myproyecto.inventariogit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kiru
 */
public class Inventariogit {
    
    public class Producto //creo la clase producto para organizar todo el inventario
    {
        String nombre;
        double precio;
        int cantidad;
    
    Producto(String Nomb, double prec, int canti) //constructor de la clase para usar el obejto
        {
        this.nombre = Nomb; //asigna el parametro al atributo
        this.precio = prec;
        this.cantidad = canti;
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>(); //El <Producto> indica que esta lista contendrá objetos del tipo "Producto".
        Scanner scanner = new Scanner(System.in);
            
        while (true) { //si pongo true el bucle funciona hasta que se escribe algo
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto al inventario");
            System.out.println("2. Actualizar inventario");
            System.out.println("3. Buscar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt(); //se guarda el dato introducido en la variable opcion
            scanner.nextLine(); //borra el espacio de next para utilizarlo despues

            switch (opcion) {
                case 1:
                    agregarProducto(inventario);
                    break;

                case 2:
                    actualizarInventario(inventario);
                    break;

                case 3:
                    buscarProducto(inventario); //me daba un error de scanner que ha solucionado automaticamente netbeans (no sé por qué)
                    break;

                case 4:
                    mostrarInventario(inventario);
                    break;

                case 5:
                    System.out.println("Salir.");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opción incorrecta, elija otra");
            }
        }
    }

    public static void agregarProducto( ArrayList<Producto> inventario) 
        {

        System.out.print("Escriba el nombre del producto: ");
        String nombre = scanner.nextLine(); //me abre otra clase para meter scanner, pero no lo entiendo

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad en stock: ");
        int cantidad = scanner.nextInt();

        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        inventario.add(nuevoProducto);

        System.out.println("Producto agregado al inventario.");
    
        }

    public static void actualizarInventario(ArrayList<Producto> inventario) 

        {

        System.out.print("Escriba el nombre del producto a actualizar: ");
        String nombreProductoActualizar = scanner.nextLine();

        System.out.print("Nueva cantidad de producto en el inventario: ");
        int nuevaCantidad = scanner.nextInt();
        producto.cantidad = nuevaCantidad;

        System.out.print("Nuevo precio de producto en el inventario: ");
        double nuevoPrecio = scanner.nextDouble();
        producto.precio = nuevoPrecio;

        System.out.println("Inventario del producto: " + nombreProductoActualizar + "actualizado");
        
        }
    }

    public static void buscarProducto(ArrayList<Producto> inventario) 

        {

        for (Producto producto : inventario)
        {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBuscar = scanner.nextLine();

        System.out.println("Producto encontrado:");
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
        System.out.println("Cantidad en stock: " + producto.cantidad);
        }

        }


    public static void mostrarInventario(ArrayList<Producto> inventario)

        {
        System.out.println("\nInventario: ");
        for (producto : inventario)
        {
            System.out.println("Nombre: " + producto.nombre);
            System.out.println("Precio: $" + producto.precio);
            System.out.println("Cantidad en stock: " + producto.cantidad);
        }
     
    }
}
