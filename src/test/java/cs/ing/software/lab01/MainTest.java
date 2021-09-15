package cs.ing.software.lab01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    double fuelConsumoVehiculo = 0.9;
    double tanqueCapacidad = 100;
    double cantidadCombustible = 10;

    @Test()
    public void test01() {
        Automovil toyota = new Automovil(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(toyota.viajar(12), "Vehículo necesita reabastecimiento de combustible");
    }

    @Test
    public void test02() {
        Vehiculo nissan = new Vehiculo(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(nissan.viajar(4), "Vehículo viajó 4.0 km y aún tiene 6.40 de combustible");
    }

    @Test
    public void test03() {
        Automovil auto = new Automovil(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(auto.abastecer(40), "La cantidad de combustible del automóvil es: 50.00");
    }

    @Test
    public void test04() {
        Automovil auto = new Automovil(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(auto.abastecer(100), "Automóvil no se puede reabastecer el tanque, está lleno");
    }

    @Test
    public void test05() {
        Camion camion = new Camion(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(camion.abastecer(40), "La cantidad de combustible del camión es: 48.00");
    }

    @Test
    public void test06() {
        Camion camion = new Camion(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(camion.abastecer(100), "Camión no se puede reabastecer el tanque, está lleno");
    }

    @Test
    public void test07() {
        Vehiculo vehiculo = new Vehiculo(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(vehiculo.abastecer(40), "");
    }

    @Test
    public void test08() {
        Assert.assertEquals(Main.testAuto(), "Vehículo viajó 4.0 km y aún tiene 96.40 de combustible");
    }

    @Test
    public void test09() {
        Assert.assertEquals(Main.testCamion(), "Vehículo viajó 12.0 km y aún tiene 84.70 de combustible");
    }
}
