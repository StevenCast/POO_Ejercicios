public class Futbol {
    public String DuracionPartido;
    public int NumJugadores;

    public Futbol(String DuracionPartido, int NumJugadores){
        this.DuracionPartido = DuracionPartido;
        this.NumJugadores = NumJugadores;
    }
    public static void Correr(){
        System.out.println("Recorrido 200 metros");
    }
    public static void main(String[] args){
        Correr();
    }
}
