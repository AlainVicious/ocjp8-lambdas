import java.util.ArrayList;
import java.util.List;

/**
 * BusquedaTradicional
 */
public class BusquedaTradicional {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<Animal>();
        animales.add(new Animal("pez", false, true));
        animales.add(new Animal("kanguro", true, false));
        animales.add(new Animal("conejo", true, false));
        animales.add(new Animal("tortuga", false, true));

        imprime(animales, new ChecaSiSalta());

    }
    
    private static void imprime(List<Animal> animales, ChecaRasgo checador) {
        for (Animal animal : animales) {
            if(checador.prueba(animal)){
                System.out.println(animal + " \n");
            }
        }
    }
}