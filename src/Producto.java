import javax.sound.sampled.Port;
import java.util.PropertyPermission;

public class Producto {
    public String nombre;
    public float precio;
    public int cantidad;

    //metodos
    //constructor

    public Producto() {
        this.nombre = "Vacio";
    }

    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void imprimir(){
        System.out.println("los detalles del producto son: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+ cantidad);
    }

    public void imprimir(String nuevo){
        System.out.println("god es igual a : "+nuevo);
    }


    public static void main(String[] args){
        Producto produc1 = new Producto("Manzanas",15.5f,2);
        Producto produc2 = new Producto("Peras",69.5f);
        Producto produc3 = new Producto();

        produc1.imprimir();
        produc2.imprimir();
        produc3.imprimir("xd");


    }
}
