public class Camion extends Vehiculo{
    public Camion(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    @Override
    public void abastecer(double combustible) {
        this.cantidadCombustible += (combustible * 0.95);
    }
}
