public class Banco {
    public String cedula;
    public String nombre;

    //metodos
        public Banco(String cedula, String nombre){
            this.cedula = cedula;
            this.nombre = nombre;
        }
        public void registraUsuario(){
            System.out.println("datos metodos registrar usuario");
            System.out.println("Datos personales");
            System.out.println("Cedula: "+cedula);
            System.out.println("Nombre: "+nombre);

        }
        public void r_cuenta(){
            System.out.println("Cuenta registrada con exito");
        }

        public static void main(String[] args){
            Banco usuario1 = new Banco("1754351821", "Juan");
            usuario1.registraUsuario();
            usuario1.r_cuenta();

        }

}
