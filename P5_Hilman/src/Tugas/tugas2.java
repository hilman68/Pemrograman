/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author hilman
 */
public class tugas2 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);

        String[] menu = {"Ayam Goreng", "Mie Goreng", "Nasi Goreng", "Sate"};
        int pilihan;

        while (true) {
            System.out.println("\n=== MENU MAKANAN ===");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.println("0. Keluar");

            System.out.print("Input Pilihan: ");

            if (!simpan.hasNextInt()) {
                System.out.println("Input harus angka!");
                simpan.next(); // buang input salah
                continue;
            }

            pilihan = simpan.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih 😄");
                break;
            }

            if (pilihan >= 1 && pilihan <= menu.length) {
                System.out.println("Yang dipilih: " + menu[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
        }

        simpan.close();
    }
}
