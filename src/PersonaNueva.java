import java.awt.desktop.SystemSleepEvent;

public class PersonaNueva {
    //atributos
    private String nombre;
    private int edad;
    private int dni;
    //metodos
        //Constructor
    public PersonaNueva(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad  = edad;
        this.dni = dni;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("DNI: "+dni);
    }

        //Clase Estudiante
        public static class Estudiante extends PersonaNueva{
            //atributos
            private String matricula;
            private String carrera;
            //metodos
            public Estudiante(String nombre, int edad, int dni, String matricula, String carrera){
                super(nombre, edad, dni);
                this.matricula = matricula;
                this.carrera = carrera;
            }
            public void mostrarInformacion(){
                super.mostrarInformacion();
                System.out.println("matricula: "+matricula);
                System.out.println("carrera: "+ carrera);
            }
        }

        //Clase Profesor
        public static class Profesor extends PersonaNueva{
            //atributos
            private String codigoEmpleado;
            private String materiaAsignada;
            //metodos
            public Profesor(String nombre, int edad, int dni, String codigoEmpleado, String materiaAsignada){
                super(nombre, edad, dni);
                this.codigoEmpleado = codigoEmpleado;
                this.materiaAsignada = materiaAsignada;
            }
            public void mostrarInformacion(){
                super.mostrarInformacion();
                System.out.println("Codigo de empleado: "+ codigoEmpleado);
                System.out.println("Materias Asignadas: "+materiaAsignada);
            }

        }

        //Clase Administrativo
        public static class Administrativo extends PersonaNueva{
            //atributo
            private String codigoEmpleado;
            private String departamento;
            //metodos

            public Administrativo(String nombre, int edad, int dni, String codigoEmpleado, String departamento){
                super(nombre, edad, dni);
                this.codigoEmpleado = codigoEmpleado;
                this.departamento = departamento;
            }

            public void mostrarInformacion() {
                super.mostrarInformacion();
                System.out.println("Codigo de empleado: "+ codigoEmpleado);
                System.out.println("Departamento: "+departamento);
            }
        }

    //Clase main
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Juan", 19, 1716451648,"053210","Derecho");
        Profesor profesor1 = new Profesor("Martin",25,1547512030,"14551515","Finanzas");
        Administrativo administrador1 = new Administrativo("Miguel", 35, 1562849510, "049816515","Ciencias");
        System.out.println("Información del estudiante: ");
        estudiante1.mostrarInformacion();
        System.out.println("Información del profesor: ");
        profesor1.mostrarInformacion();
        System.out.println("Informaicón del administrador: ");
        administrador1.mostrarInformacion();
    }
}
