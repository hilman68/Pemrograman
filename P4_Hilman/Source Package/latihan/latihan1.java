import java.util.Scanner;

public class latihan1 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        //S1 Statment Perintah
        System.out.print("Masukkan realisasi: ");
        realisasi = input.nextFloat();
        System.out.print("Masukkan kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("Masukkan tugas: ");
        tugas = input.nextFloat();
        System.out.print("Masukkan uts: ");
        uts = input.nextFloat();
        System.out.print("Masukkan uas: ");
        uas = input.nextFloat();


        //P1 Proses 1
        b_kehadiran = kehadiran/realisasi*10;
        b_tugas = tugas*20/100;
        b_uts= uas*30/100;
        b_uas = uts*40/100;
        total = b_kehadiran+b_tugas+b_uts+b_uas;


        //P2 Statment Informasi
        System.out.println("Realisasi kehadiran: "+ realisasi);
        System.out.println("Kehadiran: "+ b_kehadiran);
        System.out.println("Nilai tugas: "+ b_tugas);
        System.out.println("Nilai UTS: "+ b_uts);
        System.out.println("Nilai UAS: "+ b_uas);
        System.out.println("Total: "+ total);
    }

    

}


