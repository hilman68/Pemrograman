/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
import javax.swing.JOptionPane;
/**
 *
 * @author hilman
 * menggunakanjoptionpane
 * 
 */
public class latihan4 {
    

    public static void main(String[] args) {
        String nama = "";

        nama = JOptionPane.showInputDialog("Ketik nama anda : ");
        String msg = "Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !";
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
