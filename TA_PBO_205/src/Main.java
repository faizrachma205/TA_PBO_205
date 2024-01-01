import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("+=======================================+");
            System.out.println("|         Kalkulator Perjalanan         |");
            System.out.println("+=======================================+");
            System.out.println("Pilihan Operasi:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak Tempuh");
            System.out.println("3. Hitung Waktu Tempuh");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan Anda (1-4): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Kecepatan.hitungKecepatan();
                    break;
                case 2:
                    Jarak.hitungJarakTempuh();
                    break;
                case 3:
                    Waktu.hitungWaktuTempuh();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan Kalkulator Perjalanan. See You!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi!!");
            }
        }

        scanner.close();
    }
}