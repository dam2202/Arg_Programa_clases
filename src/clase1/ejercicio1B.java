package clase1;

public class ejercicio1B {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroActual = numeroInicio;

        while (numeroActual <= numeroFin) {
            if (numeroActual % 2 == 0) {
                System.out.print(numeroActual + ",");
            }
            numeroActual++;
        }
    }

}
