import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        class Persona {
            //atributos
            public String nombre;
            public int edad;

            //metodo
            public void caminar(){
                System.out.println(nombre+" esta caminando");
            }
        }
        Persona ps = new Persona();
        ps.nombre = "Miguel";
        ps.caminar();

        class Coche {
            //atributos
            public String color;
            public String marca;
            public int vMax;
            //metodos

            public void conducir(){
                System.out.println("El auto "+marca+" va a una velocidad maxima de "+vMax+"km");
            }
            public void elegirC(){
                System.out.println("El color elegido es: "+ color);
            }
        }
        Scanner entrada = new Scanner(System.in);
        Coche deportivo = new Coche();
        deportivo.marca = "Chevrolet";
        deportivo.vMax = 190;
        String newColor;
        System.out.print("Ingresa el color de tu auto: ");
        newColor = entrada.next();
        deportivo.color = newColor;
        deportivo.conducir();
        deportivo.elegirC();
    }
}