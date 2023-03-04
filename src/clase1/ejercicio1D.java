package clase1;

public class ejercicio1D {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        for (int numeroActual = numeroFin; numeroActual >= numeroInicio; numeroActual--) {
            if (numeroActual % 2 == 0) {
                System.out.print(numeroActual + ",");
            }
        }
    }
}
