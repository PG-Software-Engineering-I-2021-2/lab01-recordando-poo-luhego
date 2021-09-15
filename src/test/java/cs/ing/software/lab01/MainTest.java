package cs.ing.software.lab01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    double fuelConsumoVehiculo = 0.9;
    double tanqueCapacidad = 100;
    double cantidadCombustible = 10;

    @Test()
    public void testVehiculo01() {
        Vehiculo toyota = new Vehiculo(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(toyota.viajar(12), "Vehículo necesita reabastecimiento de combustible");
    }

    @Test
    public void testVehiculo02() {
        Vehiculo nissan = new Vehiculo(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(nissan.viajar(4), "Vehículo viajó 4.0 km y aún tiene 6.40 de combustible");
    }

    @Test
    public void testAutomovil01() {
        Automovil auto = new Automovil(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(auto.abastecer(40), "La cantidad de combustible del automóvil es: 50.00");
    }

    @Test
    public void testAutomovil02() {
        Automovil auto = new Automovil(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(auto.abastecer(100), "Automóvil no se puede reabastecer el tanque, está lleno");
    }

    @Test
    public void testAutomovil03() {
        Camion camion = new Camion(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(camion.abastecer(40), "La cantidad de combustible del camión es: 48.00");
    }

    @Test
    public void testCamion01() {
        Camion camion = new Camion(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(camion.abastecer(100), "Camión no se puede reabastecer el tanque, está lleno");
    }

    @Test
    public void testCamion02() {
        Vehiculo vehiculo = new Vehiculo(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(vehiculo.abastecer(40), "");
    }

    @Test
    public void testMain01() {
        Assert.assertEquals(Main.testAuto(), "Vehículo viajó 4.0 km y aún tiene 96.40 de combustible");
    }

    @Test
    public void testMain02() {
        Assert.assertEquals(Main.testCamion(), "Vehículo viajó 12.0 km y aún tiene 84.70 de combustible");
    }

    @Test(invocationCount = 80, threadPoolSize = 80)
    public void testStress() {
        Camion camion = new Camion(fuelConsumoVehiculo, tanqueCapacidad, cantidadCombustible);
        Assert.assertEquals(camion.abastecer(40), "La cantidad de combustible del camión es: 48.00");
    }
}
