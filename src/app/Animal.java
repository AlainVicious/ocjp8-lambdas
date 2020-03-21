package app;
/**
 * Animal
 */
public class Animal {

    private String especie;
    private boolean puedeSaltar;
    private boolean puedeNadar;

    public Animal(String especie, boolean salta, boolean nada){
        this.especie = especie;
        this.puedeSaltar = salta;
        this.puedeNadar = nada;
    }

    public boolean puedeSaltar(){
        return this.puedeSaltar;
    }

    public boolean puedeNadar() {
        return this.puedeNadar;
    }
    
    public String toString(){
        return this.especie;
    }

}