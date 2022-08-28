package clases;

public class Moto extends Transporte{
    private String tipoMoto;

    /**
     * Constructor con Parametros
     * @param tipoMoto Recibe un String de tipo de moto q es
     */
    public Moto(String tipoMoto){
        this.tipoMoto=tipoMoto;
    }

    /**
     * Constructor Vacio
     */
    public Moto(){

    }

    /**
     * Metodo Mostrar Info de Moto recibiendo como parametro un String
     * @param tipoMoto Recibe String del tipo de moto q es
     */
    public void mostrarInfo(String tipoMoto){
        System.out.println("Soy una moto de tipo: "+tipoMoto);
    }

    /**
     * Metodo mostrar Info que tiene el mismo nombre q el anterior
     * pero aca en este pues no tiene parametros
     */
    public void mostrarInfo(){
        System.out.println("Nomas soy una moto");
    }

    /**
     * Sobreescritura de metodo girar
     */
    @Override
    public void girarIzquierda(){
        System.out.println("Girando a la Izquierda Como Una Moto");
    }

    /**
     * Sobre escritura de metodo girar
     */
    @Override
    public void girarDerecha(){
        System.out.println("Girando a la Derecha Como Una Moto");
    }

    /**
     * Sobre escritura de metodo arrancar
     */
    @Override
    public void arrancar(){
        System.out.println("Arrancando Como Una Moto");
    }

    /**
     * Sobre escritra de metodo frenar
     */
    @Override
    public void frenar(){
        System.out.println("Frenando Como Una Moto");
    }

    /**
     * Sobre escriutra de metodo apagar
     */
    @Override
    public void apagar(){
        System.out.println("Apagando Como Una Moto");
    }

    //Metodo get
    public String getTipoMoto() {
        return tipoMoto;
    }

    //Metodo Set
    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

}
