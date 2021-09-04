public class Automovil extends Vehiculo{
    public Automovil(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
      super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    @Override
    public void abastecer(double combustible) {
        super.abastecer(combustible);
    }
}
