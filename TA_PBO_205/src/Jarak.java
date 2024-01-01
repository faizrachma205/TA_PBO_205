import java.util.Scanner;

public class Jarak {
    public static void hitungJarakTempuh() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+=========================================+");
        System.out.println("|         Menghitung Jarak Tempuh         |");
        System.out.println("+=========================================+");
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu tempuh (jam): ");
        double waktu = scanner.nextDouble();

        double jarakTempuh = kecepatan * waktu;
        System.out.println("Jarak tempuh Anda adalah " + jarakTempuh + " km");

    }
}