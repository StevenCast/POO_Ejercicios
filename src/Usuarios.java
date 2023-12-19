public class Usuarios {
    public static void main(String[] args){
        PersonaB usuario_1 = new PersonaB();
        usuario_1.nombrePersona = "Raul";
        usuario_1.setNumTarjetaBanco(486515481);
        System.out.println("Hola, el nombres: "+usuario_1.nombrePersona);
        System.out.println("Mi  número de tarjeta es: "+usuario_1.getNumTarjetaBanco());

    }
}
