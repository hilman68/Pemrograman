/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
/**
 *
 * @author hilman
 */


public class tugas2 extends JFrame {

    JLabel lblKode = new JLabel("Kode Barang");
    JLabel lblNama = new JLabel("Nama Barang");
    JLabel lblHarga = new JLabel("Harga");

    JTextField txtKode = new JTextField();
    JTextField txtNama = new JTextField();
    JTextField txtHarga = new JTextField();

    JButton btnTambah = new JButton("Tambah");
    JButton btnHapus = new JButton("Hapus");
    JButton btnReset = new JButton("Reset");

    JTable tabel;
    DefaultTableModel model;

    tugas2() {
        setTitle("Data Barang");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Label & Input
        lblKode.setBounds(20, 20, 100, 25);
        txtKode.setBounds(130, 20, 150, 25);

        lblNama.setBounds(20, 60, 100, 25);
        txtNama.setBounds(130, 60, 150, 25);

        lblHarga.setBounds(20, 100, 100, 25);
        txtHarga.setBounds(130, 100, 150, 25);

        // Tombol
        btnTambah.setBounds(300, 20, 100, 30);
        btnHapus.setBounds(300, 60, 100, 30);
        btnReset.setBounds(300, 100, 100, 30);

        // Tabel
        model = new DefaultTableModel();
        model.addColumn("Kode");
        model.addColumn("Nama");
        model.addColumn("Harga");

        tabel = new JTable(model);
        JScrollPane scroll = new JScrollPane(tabel);
        scroll.setBounds(20, 150, 440, 180);

        // Tambah ke frame
        add(lblKode); add(txtKode);
        add(lblNama); add(txtNama);
        add(lblHarga); add(txtHarga);
        add(btnTambah); add(btnHapus); add(btnReset);
        add(scroll);

        // EVENT TAMBAH
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kode = txtKode.getText();
                String nama = txtNama.getText();
                String harga = txtHarga.getText();

                if (kode.isEmpty() || nama.isEmpty() || harga.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
                } else {
                    model.addRow(new Object[]{kode, nama, harga});
                }
            }
        });

        // EVENT HAPUS
        btnHapus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = tabel.getSelectedRow();
                if (row >= 0) {
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data dulu!");
                }
            }
        });

        // EVENT RESET
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
        new tugas2();
    }
}
