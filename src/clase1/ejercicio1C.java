package clase1;

public class ejercicio1C {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroActual = numeroInicio;
        boolean mostrarPares = true; // Cambiar a false para mostrar impares

        while (numeroActual <= numeroFin) {
            if ((numeroActual % 2 == 0 && mostrarPares) || (numeroActual % 2 != 0 && !mostrarPares)) {
                System.out.print(numeroActual + ",");
            }
            numeroActual++;
        }
    }

}
