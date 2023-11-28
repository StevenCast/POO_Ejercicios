public class Coche {
    //atributos

    private String marca;
    private String color;
    private int año;

    //metodos
        //Constructor
        public Coche(String marca, String color, int año){
            this.marca = marca;
            this.color = color;
            this.año = año;
        }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public int getAño() {
        return año;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setAño(int año){
        this.año = año;
    }


    public void obtenerInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Color: "+ color);
        System.out.println("Año: "+ año);

    }
    public void acelerar(){
        System.out.println("El auto "+marca+" esta acelerando");
    }

    public void frenar(){
        System.out.println("El auto "+marca+" freno de golpe");
    }


    public static void main(String[] args){
            Coche coche1 = new Coche("Mazda", "gris", 2012);

        coche1.obtenerInfo();
        coche1.acelerar();
        coche1.frenar();
        //uso de get para obtener el año del coche
        System.out.println("El año del coche es "+coche1.getAño());
        //uso de set para cambiar el color del coche
        coche1.setColor("Amarillo");
        System.out.println("Despues de haber ido al taller esta es la información del coche:");
        coche1.obtenerInfo();

    }
}
