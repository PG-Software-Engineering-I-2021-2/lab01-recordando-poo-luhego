package cs.ing.software.lab01;

public class Automovil extends Vehiculo {
    public Automovil(double consumoPorKilometro, double capacidadCombustible, double cantidadCombustible) {
        super(consumoPorKilometro, capacidadCombustible, cantidadCombustible);
    }

    @Override
    public String abastecer(double combustible) {
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            this.cantidadCombustible += combustible;
            return "La cantidad de combustible del automóvil es: " + String.format("%.2f", this.cantidadCombustible);
        } else {
            return "Automóvil no se puede reabastecer el tanque, está lleno";
        }
    }
}
