import java.util.Scanner;

public class Aplicacion118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de hormigas capturadas: ");
        int numeroHormigas = scanner.nextInt();

        System.out.print("Número de arañas capturadas: ");
        int numeroAranas = scanner.nextInt();

        System.out.print("Número de cochinillas capturadas: ");
        int numeroCochinillas = scanner.nextInt();

        int totaldepatas = (numeroHormigas * 6) + (numeroAranas * 8) + (numeroCochinillas * 14);

        System.out.println("El número total de patas es: " + totaldepatas);

        scanner.close();
    }
}


