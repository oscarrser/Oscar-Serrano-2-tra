# Composite · Ejercicio de entrada: carpetas y archivos

## Problema
Una carpeta puede tener archivos y también otras carpetas, que a su vez tienen archivos y carpetas.
En `00-inicio`, `Carpeta` guarda **dos listas** (una de `Archivo`, otra de `Carpeta`) y cada
operación (`getTamanoKB`, `mostrar`) repite dos ciclos.

**Requisito nuevo:** poder guardar accesos directos (1 KB) dentro de cualquier carpeta.
Con el diseño actual habría que agregar una tercera lista y un tercer ciclo en cada método.

## Cómo ejecutar
```
cd 00-inicio
javac *.java
java Main
```

## Reto (15 min)
1. Cree la interfaz `Elemento` con `getNombre()`, `getTamanoKB()` y `mostrar(String sangria)`.
2. Haga que `Archivo` implemente `Elemento` (es la **hoja**).
3. Haga que `Carpeta` implemente `Elemento` y cambie las dos listas por **una** `List<Elemento> hijos`
   con un solo método `agregar(Elemento e)` (es el **compuesto**).
4. Reescriba `getTamanoKB()` y `mostrar()` con un solo ciclo que delega en cada hijo.
5. Cree `AccesoDirecto implements Elemento` y agregue uno a la carpeta `Universidad`.

## Quedó bien si
- El total de `Documentos` sigue siendo **4785 KB** antes del acceso directo y **4786 KB** después.
- `Carpeta` no tiene ningún `instanceof` ni menciona `Archivo`.
- Agregar `AccesoDirecto` no obligó a modificar `Carpeta`.

## Reto extra (sin solución incluida)
Agregue a `Elemento` el método `int contarArchivos()`. ¿Cuántas clases tuvo que tocar?

La solución está en `01-solucion`.
