package clases;

public class Carro extends Transporte{

    private int capacidad;
    private double km;

    /**
     * Cosntructor con parametros
     * @param capacidad recibe la capacidad del carro
     * @param km recibe la cantidad de kilometraje
     */
    public Carro(int capacidad, double km){
        this.capacidad=capacidad;
        this.km=km;
    }

    /**
     * Constructor vacio
     */
    public Carro(){
    }

    /**
     * Metodo  mostrarKm con parametro tipo Double
     * @param km Recibe en tipo double la cantidad de km
     */
    public void mostrarKm(double km){
        System.out.println("Soy un carro y he recorido: "+km+" kilometros");
    }


    /**
     * Metodo mostrarKm sin parametros
     */
    public void mostrarKm(){
        System.out.println("Soy un carro nomas ");
    }

    //Get
    public int getCapacidad() {
        return capacidad;
    }

    //Set
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Sobreescritura de metoodo girar iZQ
     */
    @Override
    public void girarIzquierda(){
        System.out.println("Girando a la Izquierda Como un Carro");
    }

    /**
     * Sobre escriutra de metodo girar derecha
     */
    @Override
    public void girarDerecha(){
        System.out.println("Girando a la Derecha Como un Carro");
    }

    /**
     * Sobre escritura de metodo arrancar
     */

    @Override
    public void arrancar(){
        System.out.println("Arrancando Como Un Carro");
    }

    /**
     * Sobre escritura de meotodo frenar
     */
    @Override
    public void frenar(){
        System.out.println("Frenando Como Un Carro");
    }

    /**
     * Sobre escriuta de metodo apgar
     */
    @Override
    public void apagar(){
        System.out.println("Apagando Como Un Carro");
    }

}
