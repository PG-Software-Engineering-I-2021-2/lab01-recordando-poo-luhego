package cs.ing.software.lab01;

public class Vehiculo {
    protected double consumoPorKilometro;
    protected double capacidadCombustible;
    protected double cantidadCombustible;

    public Vehiculo(double consumoPorKilometro, double capacidadCombustible, double cantidadCombustible) {
        this.consumoPorKilometro = consumoPorKilometro;
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadCombustible = cantidadCombustible;
    }

    public String abastecer(double combustible) {
        this.cantidadCombustible += combustible;
        return "";
    }

    public String viajar(int distancia) {
        double combustibleRequerido = this.consumoPorKilometro * distancia;
        if (combustibleRequerido > this.cantidadCombustible) {
            return "Vehículo necesita reabastecimiento de combustible";
        } else {
            this.cantidadCombustible -= combustibleRequerido;
            return "Vehículo viajó " + String.format("%.1f", (double) distancia) + " km y aún tiene " + String.format("%.2f", this.cantidadCombustible) + " de combustible";
        }
    }
}
