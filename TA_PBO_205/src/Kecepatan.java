
import java.util.Scanner;

public class Kecepatan {
    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+=======================================+");
        System.out.println("|         Menghitung Kecepatan          |");
        System.out.println("+=======================================+");
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu tempuh (jam): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan Anda adalah " + kecepatan + " km/jam");

    }
}