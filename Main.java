import java.util.Random;

public class Main {
    public static String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void main(String[] args) {
        ListaAlquileres alquileresLista = new ListaAlquileres();

        Velero veleroFer = new Velero(123, 150, 1994, (byte) 3);
        Alquiler fer = new Alquiler("Fer", 38536277, (byte) 14, "Septiembre", 28, veleroFer);

        Deportivo deportivoMartin = new Deportivo(124, 100, 1988, (byte) 2);
        Alquiler martin = new Alquiler("Martin", 34179064, (byte) 20, "Octubre", 29, deportivoMartin);

        Yates yateMicaela = new Yates(125, 125, 1991, 10,5);
        Alquiler micaela = new Alquiler ("Micaela", 36888233, (byte) 10,"Agosto", 30, yateMicaela);

        alquileresLista.agregarAlquiler(fer);
        alquileresLista.agregarAlquiler(martin);
        alquileresLista.agregarAlquiler(micaela);

        /*Eslora máxima de un barco = 400 Metros
        Random generadorAleatorios = new Random();

        int numeroAleatorioDias = 1 + generadorAleatorios.nextInt(31); //Para cantidad de días
        int numeroAleatorioMes = 1 + generadorAleatorios.nextInt(12); //Para meses
        int numeroAleatorioEslora = 1 + generadorAleatorios.nextInt(400); //Para Eslora
           */

        System.out.println("Menor alquiler: " + alquileresLista.getMenorAlquiler());
        System.out.println("Mayor alquiler: " + alquileresLista.getMayorAlquiler());
        System.out.println("Promedio Total Anio: " + alquileresLista.getPromedioAlquiler());

    }
}