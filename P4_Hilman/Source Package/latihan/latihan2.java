import java.util.Scanner;

public class latihan2 {
    public static void main (String arg[]){
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float b_makan, b_transpot, b_belanja;

        System.out.print("Makan: ");
        makan = input.nextFloat();
        System.out.print("Transport: ");
        transport = input.nextFloat();
        System.out.print("Belanja: ");
        belanja = input.nextFloat();

        total = makan+transport+belanja;

        b_makan = (makan/total) * 100;
        b_transpot = (transport/total) *100;
        b_belanja = (belanja/total)*100;


        System.out.println("Makan: "+ b_makan );
        System.out.println("Transport: "+ b_transpot);
        System.out.println("Belanja: "+ b_belanja);

    }
}