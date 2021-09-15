package cs.ing.software.lab01;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(0.9, 100, 10);
        auto.abastecer(90);
        auto.abastecer(100);
        auto.viajar(4);

        Camion camion = new Camion(0.9, 100, 10);
        camion.abastecer(90);
        camion.abastecer(100);
        camion.viajar(12);
    }
}
