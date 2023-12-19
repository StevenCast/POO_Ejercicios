

public class Animal {
    public void hacerSonido(){
        System.out.println("Haciendo sonido genérico");
    }

    //subclases
    static class Perro extends Animal{
        //Sobreescritura
        @Override
        public void hacerSonido(){
            System.out.println("Gua, gua");
        }
    }

    static class Gato extends Animal{
        //Sobreescritura
        @Override
        public void hacerSonido(){
            System.out.println("Meow, meow");
        }
    }

    //main

    public static void main(String[] args){
        //objetos
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gatillo = new Gato();

        animal.hacerSonido();
        perro.hacerSonido();
        gatillo.hacerSonido();

    }
}





