import java.util.Scanner;

public class Waktu {
    public static void hitungWaktuTempuh() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+========================================+");
        System.out.println("|        Menghitung Waktu Tempuh         |");
        System.out.println("+========================================+");
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();

        double waktuTempuh = jarak / kecepatan;

        // Mengonversi waktu tempuh menjadi jam dan menit
        int jam = (int) waktuTempuh;
        int menit = (int) ((waktuTempuh - jam) * 60);

        System.out.println("Waktu tempuh Anda adalah " + jam + " jam " + menit + " menit");

    }
}