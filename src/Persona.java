import jdk.jshell.PersistentSnippet;

public class Persona {

    /*Para la utilización de this en un metodo Constructor se lo usa cuando tanto parametro y el atributo tienen el mismo
    nombre ejemplo:

    public class Persona {
        public int cedula;
        public String nombre;
        public int edad;
    }
    //metodo Constructor
    permite inicializar atributos

    public Persona(int cedula, String nombre, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;

        a la izquierda estan los atributos y a la derecha los parametros que vamos a recibir
    }
    Lo siguiente va dentro del main
    //para instanciar
    Persona persona1 = new Persona();
    nombre de la clase + nombre del objeto = new + el metodo Constructor()
    */

        public int cedula;
        public String nombre;
        public int edad;

        //metodo constructor
        public Persona(int _cedula, String _nombre, int _edad){
            cedula = _cedula;
            nombre = _nombre;
            edad = _edad;
        }
        public void saludar(){
            System.out.println("Este es un saludo para " + nombre);
        }

    public static void main(String[] args){
            //Objeto1
            Persona persona1 = new Persona(1234567890,"Juan",20 );
            //persona1.cedula = 1020304050;
            //persona1.nombre;
            //persona1.edad;
            System.out.println("La cedula es "+persona1.cedula+" persona1.cedula");

            //Objeto2
            Persona trabajador = new Persona(1526845025, "Miguel", 35);
            System.out.println("La cedula de "+trabajador.nombre+" es "+trabajador.cedula);
            System.out.println(trabajador.nombre+ " tiene "+trabajador.edad+" años");

            //Objeto3
            Persona estudiante = new Persona(1590625130, "Raul", 15);
            System.out.println("La cedula de "+ estudiante.nombre+" es "+estudiante.cedula);
            System.out.println(estudiante.nombre+ " tiene "+estudiante.edad+" años");

            persona1.saludar();
            trabajador.saludar();
            estudiante.saludar();
    }
}

