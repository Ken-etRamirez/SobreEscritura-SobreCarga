package clases;

public class Transporte {


    ///Atributos de la Clase
    private String marca;
    private String modelo;

    /**
     * Metodo Girar Izq
     */

    public void girarIzquierda(){
        System.out.println("Girando a la Izquierda...");
    }

    /**
     * Metodo girar derecha
     */

    public void girarDerecha(){
        System.out.println("Girando a la Derecha...");
    }

    /**
     * Metood arrancar
     */
    public void arrancar(){
        System.out.println("Arrancando...");
    }

    /**
     * Metodo de frenar
     */

    public void frenar(){
        System.out.println("Frenando...");
    }

    /**
     * Metodo d pagar
     */

    public void apagar(){
        System.out.println("Apagando");
    }


    //get
    public String getMarca() {
        return marca;
    }

    //set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //get
    public String getModelo() {
        return modelo;
    }

    //set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
