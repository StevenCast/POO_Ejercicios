public class comidaTipica {
    //atributos
    public String nombreComida;
    public String origenComida;
    public double precio;


    //Metodos
        //Constructor

    public comidaTipica(String nombre, String origenComida, double precio){
        this.nombreComida = nombre;
        this.origenComida = origenComida;
        this.precio = precio;
    }

    public void pedirComida(){
        System.out.println("Una persona ordenó "+nombreComida+" el cual es un plato tipico de la "+origenComida);
    }
    public void pagarCuenta(){
        System.out.println("El total a pagar de la cuenta que ordeno esa persona es "+precio+ " dolares");
    }

    public static void main(String[] args){


        comidaTipica plato1 = new comidaTipica("Encebollado", "Costa", 2.50);
        comidaTipica plato2 = new comidaTipica("Yaguarlocro", "Sierra", 3.25);
        comidaTipica plato3 = new comidaTipica("Seco de pollo", "Costa", 3.75);
        comidaTipica plato4 = new comidaTipica("Guatita", "Costa", 2.25);

        plato1.pedirComida();
        plato1.pagarCuenta();
        System.out.println();
        plato2.pedirComida();
        plato2.pagarCuenta();
        System.out.println();
        plato3.pedirComida();
        plato3.pagarCuenta();
        System.out.println();
        plato4.pedirComida();
        plato4.pagarCuenta();

    }
}
