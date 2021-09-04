public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(100, 10, 0.9);
        auto.viajar(4);

        Camion camion = new Camion(100, 10, 0.9);
        camion.viajar(12);
    }
}
