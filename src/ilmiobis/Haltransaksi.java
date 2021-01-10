/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilmiobis;

//import com.mysql.jdbc.Statement;
//import ilmiobis.Ilmiobis;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Afifah
 */
public class Haltransaksi extends javax.swing.JFrame {
   
    
       

    
    /**
     * Creates new form Login
     */
    
    public Haltransaksi() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelmenu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labeltambah = new javax.swing.JLabel();
        labelcetaktiket = new javax.swing.JLabel();
        labelsimpan = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbidbus = new javax.swing.JComboBox<>();
        cmbnamapenumpang = new javax.swing.JComboBox<>();
        cmbidbooking = new javax.swing.JComboBox<>();
        btncetaktiket = new javax.swing.JButton();
        btnmenu1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cmbjenisbus = new javax.swing.JComboBox<>();
        labelkeluar1 = new javax.swing.JLabel();
        labeledit = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbjam = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        btnbatal = new javax.swing.JButton();
        labelhapus = new javax.swing.JLabel();
        btnhapus = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbtujuan = new javax.swing.JComboBox<>();
        cmbasal = new javax.swing.JComboBox<>();
        btnkeluar = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        txttanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeljadwal = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Bus");
        jLabel16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel16FocusGained(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 20));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pembayaran");
        jLabel22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel22FocusGained(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 220, 80));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\User-Interface-Exit-icon.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        labelmenu.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        labelmenu.setForeground(new java.awt.Color(51, 37, 78));
        labelmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelmenu.setText("MENU");
        labelmenu.setFocusable(false);
        labelmenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\icontrash.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 30, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\Pencil-icon.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 40, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\User-Interface-Exit-icon.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 40, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\closeicon.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 30, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\save-icon.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\iconbusmini.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, -1));

        labeltambah.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        labeltambah.setForeground(new java.awt.Color(51, 37, 78));
        labeltambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltambah.setText("BATAL");
        labeltambah.setFocusable(false);
        labeltambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labeltambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 80, 30));

        labelcetaktiket.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        labelcetaktiket.setForeground(new java.awt.Color(255, 255, 255));
        labelcetaktiket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcetaktiket.setText("CETAK TIKET");
        labelcetaktiket.setFocusable(false);
        labelcetaktiket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelcetaktiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, 90));

        labelsimpan.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        labelsimpan.setForeground(new java.awt.Color(51, 37, 78));
        labelsimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsimpan.setText("SIMPAN");
        labelsimpan.setFocusable(false);
        labelsimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 70, 30));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nama Penumpang");
        jLabel18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel18FocusGained(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        cmbidbus.setBackground(new java.awt.Color(156, 42, 225));
        cmbidbus.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbidbus.setForeground(new java.awt.Color(255, 255, 255));
        cmbidbus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "07.00", "09.00", "11.00", "13.00", "15.00", "17.00", "19.00", "21.00", "23.00", " " }));
        jPanel1.add(cmbidbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, -1));

        cmbnamapenumpang.setBackground(new java.awt.Color(156, 42, 225));
        cmbnamapenumpang.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbnamapenumpang.setForeground(new java.awt.Color(255, 255, 255));
        cmbnamapenumpang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "07.00", "09.00", "11.00", "13.00", "15.00", "17.00", "19.00", "21.00", "23.00", " " }));
        jPanel1.add(cmbnamapenumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, -1));

        cmbidbooking.setBackground(new java.awt.Color(156, 42, 225));
        cmbidbooking.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbidbooking.setForeground(new java.awt.Color(255, 255, 255));
        cmbidbooking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "07.00", "09.00", "11.00", "13.00", "15.00", "17.00", "19.00", "21.00", "23.00", " " }));
        jPanel1.add(cmbidbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, -1));

        btncetaktiket.setBackground(new java.awt.Color(51, 37, 78));
        btncetaktiket.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btncetaktiket.setForeground(new java.awt.Color(51, 37, 78));
        btncetaktiket.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\New folder\\Rectangle 1.png")); // NOI18N
        btncetaktiket.setBorder(null);
        btncetaktiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetaktiketActionPerformed(evt);
            }
        });
        jPanel1.add(btncetaktiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, 90));

        btnmenu1.setBackground(new java.awt.Color(51, 37, 78));
        btnmenu1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnmenu1.setForeground(new java.awt.Color(51, 37, 78));
        btnmenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnmenu1.setBorder(null);
        btnmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenu1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Jenis Bus");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 20));

        cmbjenisbus.setBackground(new java.awt.Color(156, 42, 225));
        cmbjenisbus.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbjenisbus.setForeground(new java.awt.Color(255, 255, 255));
        cmbjenisbus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Jakarta", "Depok", "Bekasi", "Tangerang", "Bandung", "Bogor", "Tasikmalaya", "Karawang", "Cikarang", "Banten", "Purwakarta" }));
        jPanel1.add(cmbjenisbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 190, -1));

        labelkeluar1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        labelkeluar1.setForeground(new java.awt.Color(51, 37, 78));
        labelkeluar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelkeluar1.setText("KELUAR");
        labelkeluar1.setFocusable(false);
        labelkeluar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelkeluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, 30));

        labeledit.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        labeledit.setForeground(new java.awt.Color(51, 37, 78));
        labeledit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeledit.setText("EDIT");
        labeledit.setFocusable(false);
        labeledit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labeledit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 80, 30));

        JLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JLabel3.setText("Tujuan");
        jPanel1.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 20));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Come and Go With Us");
        jLabel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel6FocusGained(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, 20));

        cmbjam.setBackground(new java.awt.Color(156, 42, 225));
        cmbjam.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbjam.setForeground(new java.awt.Color(255, 255, 255));
        cmbjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Jakarta", "Depok", "Bekasi", "Tangerang", "Bandung", "Bogor", "Tasikmalaya", "Karawang", "Cikarang", "Banten", "Purwakarta" }));
        jPanel1.add(cmbjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 190, -1));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Jam Keberangkatan");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, 20));

        btnbatal.setBackground(new java.awt.Color(51, 37, 78));
        btnbatal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnbatal.setBorder(null);
        btnbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbatalMouseClicked(evt);
            }
        });
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 90, 30));

        labelhapus.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        labelhapus.setForeground(new java.awt.Color(51, 37, 78));
        labelhapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelhapus.setText("HAPUS");
        labelhapus.setFocusable(false);
        labelhapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 80, 30));

        btnhapus.setBackground(new java.awt.Color(51, 37, 78));
        btnhapus.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(51, 37, 78));
        btnhapus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnhapus.setBorder(null);
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 90, 30));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Harga");
        jLabel21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel21FocusGained(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 20));

        txtharga.setBackground(new java.awt.Color(51, 37, 78));
        txtharga.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        txtharga.setForeground(new java.awt.Color(153, 153, 153));
        txtharga.setText("Harga");
        txtharga.setBorder(null);
        txtharga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthargaFocusGained(evt);
            }
        });
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        jPanel1.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 37, 78));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID Booking");
        jLabel15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel15FocusGained(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal Keberangkatan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 170, -1));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Asal");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 20));

        cmbtujuan.setBackground(new java.awt.Color(156, 42, 225));
        cmbtujuan.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbtujuan.setForeground(new java.awt.Color(255, 255, 255));
        cmbtujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Jakarta", "Depok", "Bekasi", "Tangerang", "Bandung", "Bogor", "Banten", "Tasikmalaya", "Karawang", "Cikarang", "Purwakarta", " " }));
        jPanel1.add(cmbtujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, -1));

        cmbasal.setBackground(new java.awt.Color(156, 42, 225));
        cmbasal.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cmbasal.setForeground(new java.awt.Color(255, 255, 255));
        cmbasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Jakarta", "Depok", "Bekasi", "Tangerang", "Bandung", "Bogor", "Tasikmalaya", "Karawang", "Cikarang", "Banten", "Purwakarta" }));
        jPanel1.add(cmbasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, -1));

        btnkeluar.setBackground(new java.awt.Color(51, 37, 78));
        btnkeluar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(51, 37, 78));
        btnkeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnkeluar.setBorder(null);
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 30));

        btnedit.setBackground(new java.awt.Color(51, 37, 78));
        btnedit.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(51, 37, 78));
        btnedit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnedit.setBorder(null);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 90, 30));

        btnsimpan.setBackground(new java.awt.Color(51, 37, 78));
        btnsimpan.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(51, 37, 78));
        btnsimpan.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnsimpan.setBorder(null);
        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
        });
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 90, 30));
        jPanel1.add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, -1));

        tabeljadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeljadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljadwalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeljadwal);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 480, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Pictures\\leftPanelBack.png")); // NOI18N
        jLabel4.setText("ddd");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel6FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel6FocusGained

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jLabel15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel15FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15FocusGained

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbatalMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnbatalMouseClicked

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void tabeljadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljadwalMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabeljadwalMouseClicked

    private void jLabel22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22FocusGained

    private void jLabel18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel18FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18FocusGained

    private void jLabel21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel21FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21FocusGained

    private void txthargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthargaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaFocusGained

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void jLabel16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel16FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16FocusGained

    private void btnmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenu1ActionPerformed

    private void btncetaktiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetaktiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncetaktiketActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Haltransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Haltransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Haltransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Haltransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Haltransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel3;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btncetaktiket;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnmenu1;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbasal;
    private javax.swing.JComboBox<String> cmbidbooking;
    private javax.swing.JComboBox<String> cmbidbus;
    private javax.swing.JComboBox<String> cmbjam;
    private javax.swing.JComboBox<String> cmbjenisbus;
    private javax.swing.JComboBox<String> cmbnamapenumpang;
    private javax.swing.JComboBox<String> cmbtujuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelcetaktiket;
    private javax.swing.JLabel labeledit;
    private javax.swing.JLabel labelhapus;
    private javax.swing.JLabel labelkeluar1;
    private javax.swing.JLabel labelmenu;
    private javax.swing.JLabel labelsimpan;
    private javax.swing.JLabel labeltambah;
    public javax.swing.JTable tabeljadwal;
    private javax.swing.JTextField txtharga;
    private com.toedter.calendar.JDateChooser txttanggal;
    // End of variables declaration//GEN-END:variables
}
