package cs.ing.software.lab01;

public class Main {
    public static String testAuto() {
        Automovil auto = new Automovil(0.9, 100, 10);
        auto.abastecer(90);
        return auto.viajar(4);
    }

    public static String testCamion() {
        Camion camion = new Camion(0.9, 100, 10);
        camion.abastecer(90);
        return camion.viajar(12);
    }

    public static void main(String[] args) {
        Main.testAuto();
        Main.testCamion();
    }
}
