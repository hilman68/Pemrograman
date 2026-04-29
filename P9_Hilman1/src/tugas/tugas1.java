/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author hilman
 */
public class tugas1 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String nama = "";
        int umur = 0;
        double ipk = 0;

        try {
            System.out.print("Masukkan Nama: ");
            nama = input.readLine();

            System.out.print("Masukkan Umur: ");
            umur = Integer.parseInt(input.readLine());

            System.out.print("Masukkan IPK: ");
            ipk = Double.parseDouble(input.readLine());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input!");
        }

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("IPK  : " + ipk);
    }

}
