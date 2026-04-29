/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author hilman
 */
public class latihan1 {
    
    public static void main(String[] args) {
        Scanner simpan=new Scanner (System.in);
        
        int pilihan; String makanan = null;
        
        System.out.print("Input Pilihan: ");
        pilihan= simpan.nextInt();
        
        if (pilihan==1){
            makanan="Ayam Goreng";
        }else if(pilihan == 2){
            makanan="Mie Goreng";
        }
        
        System.out.print("ini yang di pilih: "+makanan);
    }
}
