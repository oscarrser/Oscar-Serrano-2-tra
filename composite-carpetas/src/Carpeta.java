import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    // PROBLEMA: una lista por cada tipo de cosa que puede ir adentro
    private List<Archivo> archivos = new ArrayList<>();
    private List<Carpeta> subcarpetas = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarArchivo(Archivo a) {
        archivos.add(a);
    }

    public void agregarCarpeta(Carpeta c) {
        subcarpetas.add(c);
    }

    // PROBLEMA: cada operacion repite dos ciclos, uno por lista
    public int getTamanoKB() {
        int total = 0;
        for (Archivo a : archivos) {
            total += a.getTamanoKB();
        }
        for (Carpeta c : subcarpetas) {
            total += c.getTamanoKB();
        }
        return total;
    }

    public void mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] " + getTamanoKB() + " KB");
        for (Archivo a : archivos) {
            System.out.println(sangria + "   " + a.getNombre() + " " + a.getTamanoKB() + " KB");
        }
        for (Carpeta c : subcarpetas) {
            c.mostrar(sangria + "   ");
        }
    }
}
