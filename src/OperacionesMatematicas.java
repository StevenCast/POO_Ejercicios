public class OperacionesMatematicas {

    //atributos
    public int numEntero1;
    public int numEntero2;
    public int numEntero3;

    //metodos
    //Constructor
    /*
    public OperacionesMatematicas(int numEntero1, int numEntero2, int numEntero3) {
        this.numEntero1 = numEntero1;
        this.numEntero2 = numEntero2;
        this.numEntero3 = numEntero3;
    }
    */

    public void sumar(int numEntero1, int numEntero2){
        System.out.println("La suma de los dos numeros es: "+(numEntero1+numEntero2));
    }

    public void sumar(int numEntero1, int numEntero2, int numEntero3){
        System.out.println("La suma de los tres numeros es: "+(numEntero1+numEntero2+numEntero3+5));
    }

    public void sumar(float numEntero1, float numEntero2){
        System.out.println("La suma de los dos numeros decimales es: "+(numEntero1+numEntero2+2));
    }


    public static void main(String [] args){
        OperacionesMatematicas adicion = new OperacionesMatematicas();
        adicion.sumar(4,3);
        adicion.sumar(10,10,10);
        adicion.sumar(5.23f, 23.2f);

    }
}
