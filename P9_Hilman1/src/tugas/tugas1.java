/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author hilman
 */


public class tugas1 extends JFrame {

    JLabel lblKode = new JLabel("Kode Barang");
    JLabel lblNama = new JLabel("Nama Barang");
    JLabel lblHarga = new JLabel("Harga Barang");

    JTextField txtKode = new JTextField();
    JTextField txtNama = new JTextField();
    JTextField txtHarga = new JTextField();

    JButton btnSimpan = new JButton("Simpan");
    JButton btnReset = new JButton("Reset");

    tugas1() {
        setTitle("Input Data Barang");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Posisi komponen
        lblKode.setBounds(20, 20, 100, 25);
        txtKode.setBounds(130, 20, 150, 25);

        lblNama.setBounds(20, 60, 100, 25);
        txtNama.setBounds(130, 60, 150, 25);

        lblHarga.setBounds(20, 100, 100, 25);
        txtHarga.setBounds(130, 100, 150, 25);

        btnSimpan.setBounds(50, 150, 100, 30);
        btnReset.setBounds(170, 150, 100, 30);

        add(lblKode);
        add(txtKode);
        add(lblNama);
        add(txtNama);
        add(lblHarga);
        add(txtHarga);
        add(btnSimpan);
        add(btnReset);

        // Event tombol SIMPAN
        btnSimpan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kode = txtKode.getText();
                String nama = txtNama.getText();
                String harga = txtHarga.getText();

                JOptionPane.showMessageDialog(null,
                        "Data Barang:\n" +
                        "Kode: " + kode +
                        "\nNama: " + nama +
                        "\nHarga: " + harga);
            }
        });

        // Event tombol RESET
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtKode.setText("");
                txtNama.setText("");
                txtHarga.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new tugas1();
    }
}