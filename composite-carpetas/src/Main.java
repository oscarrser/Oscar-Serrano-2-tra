public class Main {
    public static void main(String[] args) {
        Carpeta documentos = new Carpeta("Documentos");
        documentos.agregarArchivo(new Archivo("hoja-de-vida.pdf", 250));

        Carpeta fotos = new Carpeta("Fotos");
        fotos.agregarArchivo(new Archivo("grado.jpg", 2400));
        fotos.agregarArchivo(new Archivo("paseo.jpg", 1800));
        documentos.agregarCarpeta(fotos);

        Carpeta universidad = new Carpeta("Universidad");
        universidad.agregarArchivo(new Archivo("taller-poo.pdf", 320));
        Carpeta proyecto = new Carpeta("Proyecto");
        proyecto.agregarArchivo(new Archivo("Main.java", 6));
        proyecto.agregarArchivo(new Archivo("Carrito.java", 9));
        universidad.agregarCarpeta(proyecto);
        documentos.agregarCarpeta(universidad);

        documentos.mostrar("");

        // NUEVO REQUISITO: accesos directos de 1 KB dentro de cualquier carpeta.
        // Con este diseno: otra lista, otro metodo agregar y un tercer ciclo en CADA operacion.
    }
}
