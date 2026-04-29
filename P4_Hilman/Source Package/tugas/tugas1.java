import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float makan, transport, belanja;
        float total, diskon, totalBayar;
        float persenMakan, persenTransport, persenBelanja;

        // Input
        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextFloat();
        System.out.print("Masukkan pengeluaran transport: ");
        transport = input.nextFloat();
        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextFloat();

        // Proses total
        total = makan + transport + belanja;

        // Hitung persentase
        persenMakan = (makan / total) * 100;
        persenTransport = (transport / total) * 100;
        persenBelanja = (belanja / total) * 100;

        // Hitung diskon 10%
        diskon = total * 10 / 100;
        totalBayar = total - diskon;

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.println("Total pengeluaran: " + total);

        System.out.println("\nPersentase:");
        System.out.println("Makan: " + persenMakan + "%");
        System.out.println("Transport: " + persenTransport + "%");
        System.out.println("Belanja: " + persenBelanja + "%");

        System.out.println("\nDiskon: " + diskon);
        System.out.println("Total setelah diskon: " + totalBayar);
    }
}