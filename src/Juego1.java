public class Juego1 {
    private String nombre;
    private String apellido;

    public Juego1(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void infoJugador(){
        System.out.println("El jugador inicialmente se llama "+nombre+" "+apellido);
    }
    public void infoActualizada(){
        System.out.println("El jugador ahora se llama "+nombre+" "+apellido);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static void main(String[] args){
        Juego1 jugador1 = new Juego1("Miguel", "O'hara");
        jugador1.infoJugador();
        jugador1.setNombre("Ruben");
        jugador1.setApellido("Torres");
        jugador1.infoActualizada();

    }
}
