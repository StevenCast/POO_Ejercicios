public class Estudiantes {
    //Atributos

    private String nombre;
    private int edad;
    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void Saludar(){
        System.out.println("Hola "+nombre);
        System.out.println("Tu edad es "+edad+" años.");
    }
    public static void main(String []args){
    //instancias
        Estudiantes estudiante1 = new Estudiantes("DENNIS",20);
        Estudiantes estudiante2 = new Estudiantes("Erick", 20);
        estudiante1.Saludar(); estudiante2.Saludar();
    }

}

