public class games {

    //Atributos
    public String nombre;
    public String genero;
    public double precio;
    public int peso;
    public int horasJugadas;

    //Metodos
        //Metodo Constructor
        public games(String nombre, String genero, double precio, int peso, int horasJugadas){
            this.nombre = nombre;
            this.genero = genero;
            this.precio = precio;
            this.peso = peso;
            this.horasJugadas = horasJugadas;
        }
        public void jugar(){
            System.out.println("Abriste " +nombre+" de genero "+genero+" con unas horas total jugadas de "+horasJugadas);
        }
        public void comprar(){
            System.out.println(nombre+" tiene un precio de "+precio+" aparte que posee un tamaño de "+peso+" GB");
        }

    public static void main(String[] args){

            games juego1 = new games("Counter Strike 2", "shooter",0, 34,140 );
            games juego2 = new games("Minecraft", "survival", 21.50,1, 400 );
            games juego3 = new games("Left4Dead2", "survival", 9.99, 15,55 );

            juego1.jugar();
            juego1.comprar();
            System.out.println();
            juego2.jugar();
            juego2.comprar();
            System.out.println();
            juego3.jugar();
            juego3.comprar();
    }

}
