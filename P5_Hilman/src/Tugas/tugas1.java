/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 * CEK KELULUSAN
 * @author hilman
 */
public class tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int JumlahMhs = 5;
        int[] nilai = new int[JumlahMhs];
        int KKM = 75;
        
        for (int i = 0; i < JumlahMhs; i++){
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai[i] = input.nextInt();
        }
        System.out.println("\n ===Hasil Kelulusan ===");
        
        for (int i = 0; i<JumlahMhs; i++){
            System.out.print("Mahasiswa "+ (i+1)+" nilai "+nilai[i]+ " : ");
            
            if (nilai[i]>= KKM){
                System.out.println("LULUS");
            }else{
                System.out.println("TIDAK LULUS");
            }
        }
        
        input.close();
    }   
}
