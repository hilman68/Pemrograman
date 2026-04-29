/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hilman
 * CONTOH MENU BAR
 */

public class latihan1 extends JFrame {

    private JMenuBar menuBar = new JMenuBar();

    // Menu Master
    private JMenu menuMaster = new JMenu("Master Data");
    private JMenuItem menuBarang = new JMenuItem("Barang");
    private JMenuItem menuCustomer = new JMenuItem("Customer");
    private JMenuItem menuUserAccount = new JMenuItem("User Account");

    // Menu Transaksi
    private JMenu menuTransaksi = new JMenu("Transaksi");
    private JMenuItem menuPenjualan = new JMenuItem("Penjualan");
    private JMenuItem menuPembelian = new JMenuItem("Pembelian");

    // Menu Exit
    private JMenuItem menuExit = new JMenuItem("Exit");

    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    latihan1() {
        super("Membuat Menu");

        setSize(350, 300);
        setLocation(
            dimensi.width / 2 - getWidth() / 2,
            dimensi.height / 2 - getHeight() / 2
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Isi Menu Master
        menuMaster.add(menuBarang);
        menuMaster.add(menuCustomer);
        menuMaster.addSeparator();
        menuMaster.add(menuUserAccount);

        // Isi Menu Transaksi
        menuTransaksi.add(menuPenjualan);
        menuTransaksi.add(menuPembelian);

        // Tambahkan ke MenuBar
        menuBar.add(menuMaster);
        menuBar.add(menuTransaksi);
        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        // Fungsi tombol Exit
        menuExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new latihan1();
    }
}