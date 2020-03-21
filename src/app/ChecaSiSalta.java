package app;

/**
 * ChecaSiSalta
 */
public class ChecaSiSalta implements ChecaRasgo{
    @Override
    public boolean prueba(Animal a) {
        return a.puedeSaltar();
    }
}