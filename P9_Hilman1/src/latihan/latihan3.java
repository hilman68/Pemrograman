/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hilman
 */

public class latihan3 extends JFrame {

    private JDesktopPane frmMDI;
    private JInternalFrame frmBarang;
    private JInternalFrame frmCustomer;
    private JInternalFrame frmUserAccount;
    private JPanel pnlBarang;

    private JMenuBar MenuBar = new JMenuBar();
    private JMenu MenuMaster = new JMenu("Master Data");
    private JMenuItem MenuBarang = new JMenuItem("Barang"),
            MenuCustomer = new JMenuItem("Customer"),
            MenuUserAccount = new JMenuItem("User Account");

    private JMenu MenuTransaksi = new JMenu("Transaksi");
    private JMenuItem MenuPenjualan = new JMenuItem("Penjualan"),
            MenuPembelian = new JMenuItem("Pembelian");

    private JMenuItem MenuExit = new JMenuItem("Exit");

    private static JLabel LblKodeBarang = new JLabel("Kode Barang");
    private static JTextField TxtKodeBarang = new JTextField();
    private static JLabel LblNamaBarang = new JLabel("Nama Barang");
    private static JTextField TxtNamaBarang = new JTextField();
    private static JLabel LblHargaBarang = new JLabel("Harga Barang");
    private static JTextField TxtHargaBarang = new JTextField();
    private static JButton TblBarangSave = new JButton("Save");
    private static JButton TblBarangCancel = new JButton("Cancel");

    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    latihan3() {
        super("Aplikasi Toko");

        setSize(650, 500);
        setLocation(
                dimensi.width / 2 - getWidth() / 2,
                dimensi.height / 2 - getHeight() / 2
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        frmMDI = new JDesktopPane();
        frmMDI.setLayout(null);
        setContentPane(frmMDI);

        // Menu
        MenuMaster.add(MenuBarang);
        MenuMaster.add(MenuCustomer);
        MenuMaster.addSeparator();
        MenuMaster.add(MenuUserAccount);

        MenuBar.add(MenuMaster);

        MenuTransaksi.add(MenuPenjualan);
        MenuTransaksi.add(MenuPembelian);
        MenuBar.add(MenuTransaksi);

        MenuBar.add(MenuExit);

        setJMenuBar(MenuBar);

        // Action
        MenuBarang.addActionListener(new MenuHandler());
        MenuCustomer.addActionListener(new MenuHandler());
        MenuUserAccount.addActionListener(new MenuHandler());
        MenuExit.addActionListener(new MenuHandler());

        TblBarangSave.addActionListener(new TombolHandler());
        TblBarangCancel.addActionListener(new TombolHandler());

        // Internal Frame
        frmBarang = new JInternalFrame("Master Data Barang", true, true, true, true);
        frmCustomer = new JInternalFrame("Master Data Customer", true, true, true, true);
        frmUserAccount = new JInternalFrame("Master Data User Account", true, true, true, true);

        pnlBarang = new JPanel();
        pnlBarang.setLayout(null);

        LblKodeBarang.setBounds(30, 20, 160, 25);
        pnlBarang.add(LblKodeBarang);

        TxtKodeBarang.setBounds(120, 20, 100, 25);
        pnlBarang.add(TxtKodeBarang);

        LblNamaBarang.setBounds(30, 50, 160, 25);
        pnlBarang.add(LblNamaBarang);

        TxtNamaBarang.setBounds(120, 50, 200, 25);
        pnlBarang.add(TxtNamaBarang);

        LblHargaBarang.setBounds(30, 80, 160, 25);
        pnlBarang.add(LblHargaBarang);

        TxtHargaBarang.setBounds(120, 80, 100, 25);
        pnlBarang.add(TxtHargaBarang);

        TblBarangSave.setBounds(80, 160, 80, 25);
        pnlBarang.add(TblBarangSave);

        TblBarangCancel.setBounds(170, 160, 80, 25);
        pnlBarang.add(TblBarangCancel);

        frmBarang.add(pnlBarang);

        frmBarang.setBounds(10, 10, 367, 250);
        frmCustomer.setBounds(30, 30, 367, 250);
        frmUserAccount.setBounds(50, 50, 367, 250);

        frmMDI.add(frmBarang);
        frmMDI.add(frmCustomer);
        frmMDI.add(frmUserAccount);

        setVisible(true);
    }

    private class MenuHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JMenuItem M = (JMenuItem) e.getSource();

            if (M.getText().equals("Barang")) {
                frmBarang.setVisible(true);
            } else if (M.getText().equals("Customer")) {
                frmCustomer.setVisible(true);
            } else if (M.getText().equals("User Account")) {
                frmUserAccount.setVisible(true);
            } else if (M.getText().equals("Exit")) {
                dispose();
            }
        }
    }

    private class TombolHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton TblPilih = (JButton) e.getSource();

            if (TblPilih.getText().equals("Save")) {
                JOptionPane.showMessageDialog(null, "Dipilih Save");
                frmBarang.setVisible(false);
            } else if (TblPilih.getText().equals("Cancel")) {
                JOptionPane.showMessageDialog(null, "Dipilih Cancel");
                frmBarang.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        new latihan3();
    }
}