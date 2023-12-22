public class Vehiculo {

    //metodo definido para superclase
    public void acelerar(){
        System.out.println("Acelerando de forma genérica");
    }


    //Subclases o clases hijas

    static class Coche extends Vehiculo{
        @Override
        public void acelerar(){
            System.out.println("El coche acelera a 100km por hora");
        }
    }

    static class Bicicleta extends Vehiculo{
        @Override
        public void acelerar(){
            System.out.println("La bicicleta acelera a 20km por hora");
        }
    }

    static class Avion extends Vehiculo{
        @Override
        public void acelerar(){
            System.out.println("El avion acelera a 900km por hora");
        }
    }

    //main
    public static void main(String[] args){
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Bicicleta bici = new Bicicleta();
        Avion avion = new Avion();

        vehiculo.acelerar();
        coche.acelerar();
        bici.acelerar();
        avion.acelerar();
    }
}
