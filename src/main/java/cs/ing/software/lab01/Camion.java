package cs.ing.software.lab01;

public class Camion extends Vehiculo {
    public Camion(double consumoPorKilometro, double capacidadCombustible, double cantidadCombustible) {
        super(consumoPorKilometro, capacidadCombustible, cantidadCombustible);
    }

    @Override
    public String abastecer(double combustible) {
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            this.cantidadCombustible += (combustible * 0.95);
            return "La cantidad de combustible del camión es: " + String.format("%.2f", this.cantidadCombustible);
        } else {
            return "Camión no se puede reabastecer el tanque, está lleno";
        }
    }
}
