import java.util.ArrayList;
import java.util.List;

public class EstacionClima {
    private List<SensorTemperatura> sensores = new ArrayList<>();
    // PROBLEMA: una lista aparte solo para la marca importada
    private List<SensorImportado> importados = new ArrayList<>();

    public void agregar(SensorTemperatura sensor) {
        sensores.add(sensor);
    }

    // PROBLEMA: la estacion tiene que conocer la clase del proveedor
    public void agregarImportado(SensorImportado sensor) {
        importados.add(sensor);
    }

    public void reporte() {
        double suma = 0;
        int cantidad = 0;
        for (SensorTemperatura s : sensores) {
            System.out.printf("%-18s %5.1f C%n", s.getNombre(), s.leerCelsius());
            suma += s.leerCelsius();
            cantidad++;
        }
        // PROBLEMA: el mismo ciclo repetido, con la conversion metida aqui
        for (SensorImportado s : importados) {
            double celsius = (s.readFahrenheit() - 32) * 5 / 9;
            System.out.printf("%-18s %5.1f C%n", "Importado " + s.getModelo(), celsius);
            suma += celsius;
            cantidad++;
        }
        System.out.printf("Promedio:          %5.1f C%n", suma / cantidad);
    }
}
