
import java.util.Random;  //Importar libreria para generar numeros aleatorios

//clase Carta abstracta
public abstract class Carta {
    private String nombre;
    //metodos abstractos
    public abstract void jugar();
    public  abstract void mostrarDescripcion();
    //getters and setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Acciones
    public String cartas_manojo[]  = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
    public String cartas_efecto[] = {"Curacion", "Veneno", "Sin efecto"};

    public int set_numero = (int)(Math.random()*12+1);
    public int set_efecto = (int)(Math.random()*2+1);
    public String number = cartas_manojo[set_numero];
    public String efect = cartas_efecto[set_efecto ];


    static class CartaNumerica extends Carta{ //Clase CartaNumerica que herada de Carta
        private int numero;

        //getters and setters
        public void setNumero(int numero){
            this.numero = numero;
        }
        public int getNumero(){
            return numero;
        }

        public  void jugar(){
            System.out.println("El juego va a comenzar");
        }
        public  void mostrarDescripcion(){
            System.out.println("A continuacion se muestre la informacion de tu carta");
            int numero_carta = Integer.parseInt(number);
            System.out.println("Tu carta tiene : " + numero_carta+" puntos de vida");
        }
    }


    static class CartaEspecial extends Carta{ //Clase CartaEspecial que herada de Carta

        //getters and setters
        public  void jugar(){
            System.out.println("El juego va a comenzar");
        }
        public  void mostrarDescripcion(){
            System.out.println("A continuacion se muestre la informacion de tu carta");
            System.out.println("El efecto de tu carta es: " + efect);
        }

        public void activarEfectoEspecial(){

            try{
                if (efect == "Curacion") {
                    System.out.println("Ganas");

                } else if(efect == "Veneno"){
                    System.out.println("Pierdes");

                } else if(efect == "Sin efecto"){
                    System.out.println("Continuas");
                }
            }catch (ArithmeticException e){
                System.out.println("Error la operacion no se pudo efectuar: "+e.getMessage());
            }
        }
    }


    public static void main(String[] args){
        CartaNumerica carta1 = new CartaNumerica();
        carta1.jugar();
        carta1.mostrarDescripcion();
        System.out.println();

        CartaEspecial carta2 = new CartaEspecial();
        carta2.mostrarDescripcion();
        carta2.activarEfectoEspecial();

    }
}
