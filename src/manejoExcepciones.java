import java.util.Scanner;

public class manejoExcepciones {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        //manejo de Excepciones
        /*
        try {
            //Se coloca el codigo propenso a tener un error
            System.out.print("Ingrese un valor a dividir: ");
            int valor_num1 = entrada.nextInt();
            System.out.print("Ingrese otro valor a dividir: ");
            int valor_num2 = entrada.nextInt();
            int resultado = valor_num1/valor_num2;
            System.out.println("El resultado es: "+resultado);

        } catch(ArithmeticException e) {
            //Se ejecuta esto cuando exista el error del codigo del try
            System.out.println("Error en: "+ e.getMessage());
        } finally {
            //Esto siempre se va a ejecutar aunque se ejecuta bien el try o se ejecuta el catch
            System.out.println("Este bloque SIEMPRE se ejecuta");
        }

    */
        //Arreglos


        int numeros[] = {1,2,4,56,34,234,666};
        int matriz[][] ={{1,2,3},{4,5,6}};

        System.out.println(numeros[0] + numeros[1]);
        System.out.println("Vector");
        for (int i = 0; i< 2; i++){
            System.out.println(numeros[i]);
        }



        System.out.println("Matriz: "+matriz[1][2]);

    }
}
