/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
/**
 *
 * @author hilman
 */
public class tugas2 {
    
    public static void main(String[] args) {

        double angka1 = Double.parseDouble(
            JOptionPane.showInputDialog("Masukkan angka pertama:")
        );

        double angka2 = Double.parseDouble(
            JOptionPane.showInputDialog("Masukkan angka kedua:")
        );

        double hasil = angka1 + angka2;

        NumberFormat number = NumberFormat.getNumberInstance();
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        NumberFormat percent = NumberFormat.getPercentInstance();

        String output = "Hasil Penjumlahan: " + hasil + "\n\n" +
                        "Format Number   : " + number.format(hasil) + "\n" +
                        "Format Currency : " + currency.format(hasil) + "\n" +
                        "Format Percent  : " + percent.format(hasil);

        JOptionPane.showMessageDialog(null, output);
    }

}
