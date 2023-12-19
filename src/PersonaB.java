import com.sun.management.UnixOperatingSystemMXBean;

public class PersonaB {
    //atributos

    public String nombrePersona;
    private int numTarjetaBanco;

    //metodos
        //constructor
    /*
    public PersonaB(String nombrePersona, int numTarjetaBanco){
        this.nombrePersona = nombrePersona;
        this.numTarjetaBanco = numTarjetaBanco;
    }
    */
        //getter
    public int getNumTarjetaBanco(){
        return  numTarjetaBanco;
    }
        //setter
    public void setNumTarjetaBanco(int numTarjetaBanco){
        this.numTarjetaBanco = numTarjetaBanco;
    }
}
