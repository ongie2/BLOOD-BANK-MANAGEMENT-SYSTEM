

import com.itextpdf.text.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.glass.events.KeyEvent;
import com.sun.javafx.font.FontFactory.*;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class AdminControl extends javax.swing.JFrame {

  private Connection con =null;
    public AdminControl() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        LogoutDButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AdminIDtxt = new javax.swing.JTextField();
        RUpdateButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AdminProfTable = new javax.swing.JTable();
        RDeleteButton = new javax.swing.JButton();
        AdminNametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDNumtxt = new javax.swing.JTextField();
        RInsertButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Addresstxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Contacttxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UserIDTextField = new javax.swing.JTextField();
        RegPasstxt = new javax.swing.JPasswordField();
        ConFPasstxt = new javax.swing.JPasswordField();
        UserSubButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RegIDPasslabel = new javax.swing.JLabel();
        RegIDPasslabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ReportDButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AvailableBloodTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestBloodTable = new javax.swing.JTable();
        ReportDButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        FeedBackTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        LogoutDButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        LogoutDButton.setForeground(new java.awt.Color(255, 153, 0));
        LogoutDButton.setText("Logout");
        LogoutDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutDButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.setForeground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "ADMIN DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Admin Id");

        AdminIDtxt.setEditable(false);
        AdminIDtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdminIDtxtKeyPressed(evt);
            }
        });

        RUpdateButton.setBackground(new java.awt.Color(0, 102, 51));
        RUpdateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RUpdateButton.setForeground(new java.awt.Color(255, 153, 0));
        RUpdateButton.setText("Update");
        RUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUpdateButtonActionPerformed(evt);
            }
        });

        AdminProfTable.setBackground(new java.awt.Color(153, 153, 153));
        AdminProfTable.setForeground(new java.awt.Color(255, 204, 0));
        AdminProfTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminProfTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(AdminProfTable);

        RDeleteButton.setBackground(new java.awt.Color(0, 102, 51));
        RDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RDeleteButton.setForeground(new java.awt.Color(255, 153, 0));
        RDeleteButton.setText("Delete");
        RDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDeleteButtonActionPerformed(evt);
            }
        });

        AdminNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdminNametxtKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 102, 51));
        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Admin Name");

        jLabel5.setBackground(new java.awt.Color(0, 102, 51));
        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("ID Number");

        IDNumtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDNumtxtKeyPressed(evt);
            }
        });

        RInsertButton.setBackground(new java.awt.Color(0, 102, 51));
        RInsertButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RInsertButton.setForeground(new java.awt.Color(255, 153, 0));
        RInsertButton.setText("Insert");
        RInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RInsertButtonActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 102, 51));
        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Address");

        Addresstxt.setColumns(20);
        Addresstxt.setRows(5);
        jScrollPane3.setViewportView(Addresstxt);

        jLabel6.setBackground(new java.awt.Color(0, 102, 51));
        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Contact");

        Contacttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContacttxtKeyPressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("+27");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(66, 66, 66)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdminNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdminIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addComponent(IDNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(RDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(RInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(AdminIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4))
                            .addComponent(AdminNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(IDNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(151, 151, 151))
        );

        jTabbedPane1.addTab("Profile", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "ADD NEW ADMIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        UserIDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserIDTextFieldKeyPressed(evt);
            }
        });

        UserSubButton.setBackground(new java.awt.Color(0, 102, 51));
        UserSubButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        UserSubButton.setForeground(new java.awt.Color(255, 153, 0));
        UserSubButton.setText("Submit");
        UserSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserSubButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 51));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Enter ID");

        RegIDPasslabel.setBackground(new java.awt.Color(0, 102, 51));
        RegIDPasslabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        RegIDPasslabel.setForeground(new java.awt.Color(255, 153, 0));
        RegIDPasslabel.setText("Enter Admin Password");

        RegIDPasslabel1.setBackground(new java.awt.Color(0, 102, 51));
        RegIDPasslabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        RegIDPasslabel1.setForeground(new java.awt.Color(255, 153, 0));
        RegIDPasslabel1.setText("Confirm Admin Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(UserSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(RegIDPasslabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(RegIDPasslabel1)
                            .addGap(18, 18, 18)
                            .addComponent(ConFPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(UserIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegIDPasslabel)
                    .addComponent(RegPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegIDPasslabel1)
                    .addComponent(ConFPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(UserSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Admin", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        ReportDButton.setBackground(new java.awt.Color(0, 102, 51));
        ReportDButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        ReportDButton.setForeground(new java.awt.Color(255, 153, 0));
        ReportDButton.setText("All Blood Request To PDF");
        ReportDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportDButtonActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "ALL AVAILABLE BLOOD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        AvailableBloodTable.setBackground(new java.awt.Color(0, 102, 102));
        AvailableBloodTable.setForeground(new java.awt.Color(255, 204, 0));
        AvailableBloodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(AvailableBloodTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "ALL BLOOD REQUESTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        RequestBloodTable.setBackground(new java.awt.Color(0, 102, 102));
        RequestBloodTable.setForeground(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(RequestBloodTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        ReportDButton1.setBackground(new java.awt.Color(0, 102, 51));
        ReportDButton1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        ReportDButton1.setForeground(new java.awt.Color(255, 153, 0));
        ReportDButton1.setText("All Available Blood To PDF");
        ReportDButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportDButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ReportDButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(ReportDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReportDButton)
                    .addComponent(ReportDButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jTabbedPane1.addTab("Database Report", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inquiries", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "ALL FEEDBACK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 153, 0))); // NOI18N

        FeedBackTable.setBackground(new java.awt.Color(0, 102, 102));
        FeedBackTable.setForeground(new java.awt.Color(255, 204, 0));
        jScrollPane6.setViewportView(FeedBackTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User FeedBack", jPanel5);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutDButton)
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReportDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportDButtonActionPerformed

        com.itextpdf.text.Document doc = new com.itextpdf.text.Document ();
        try
        {   File desktopDir = new File(System.getProperty("user.home"), "Desktop");
 System.out.println(desktopDir.getPath() + " " + desktopDir.exists());
 String pathToDesktop = desktopDir.getPath();
            String fileName = JOptionPane.showInputDialog("Please enter file name");

            //PdfWriter.getInstance(doc, new FileOutputStream(fileName+".pdf"));
            PdfWriter.getInstance(doc, new FileOutputStream( pathToDesktop+System.getProperty("file.separator")+fileName+".pdf"));
            doc.open();
            doc.add(new Paragraph("--------------------------------"));
            doc.add(new Paragraph("all request for Blood" , FontFactory.getFont(FontFactory.TIMES_BOLD,35, BaseColor.GRAY)));
            doc.add(new Paragraph(new java.util.Date().toString()));
            doc.add(new Paragraph("--------------------------------"));

            PdfPTable table = new PdfPTable(8);
            table.addCell("Id");
            table.addCell("Name");
            table.addCell("BloodBank");
            table.addCell("City");
            table.addCell("BloodType");
            table.addCell("Location");
            table.addCell("Bottles");
            table.addCell("Date");

            con = DBSCon.dataBaseConnection();

            try
            {
                Statement st = con.createStatement();
                String queery = "select * from Request";

                ResultSet rs = st.executeQuery(queery);
                while(rs.next())
                {
                    table.addCell(rs.getString("Id"));
                    table.addCell(rs.getString("Name"));
                    table.addCell(rs.getString("BloodBank"));
                    table.addCell(rs.getString("City"));
                    table.addCell(rs.getString("BloodType"));
                    table.addCell(rs.getString("Location"));
                    table.addCell(rs.getString("Bottles"));
                    table.addCell(rs.getString("Date"));
                }

                JOptionPane.showMessageDialog(null, " Report saved ");

                showSpecificBloodData(Integer.parseInt(MainForm.getID()));
            }catch(Exception ex)
            {

            }
            finally
            {
                try
                {
                    con.close();
                }catch(Exception ex)
                {

                }
            }

            doc.add(table);

            doc.add(new Paragraph("--------------------------------"));
            doc.add(new Paragraph("Please donate Blood" , FontFactory.getFont(FontFactory.TIMES_BOLD,35, BaseColor.GRAY)));
            doc.add(new Paragraph("--------------------------------"));

            doc.close();

        }catch(Exception ex)

        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_ReportDButtonActionPerformed

    private void UserSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserSubButtonActionPerformed
        
        
        if(UserIDTextField.getText().equals("") || RegPasstxt.getText().equals("") || ConFPasstxt.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Please Fill all the Fields");
        }
        else if (RegPasstxt.getText().equals(ConFPasstxt.getText()))
        {
            {
                
                con = DBSCon.dataBaseConnection();
                try
                {
                    Statement st = con.createStatement();
                    String queery = "Insert into admin values('"+UserIDTextField.getText()+"','"+RegPasstxt.getText()+"')";
                    st.executeUpdate(queery);
                    JOptionPane.showMessageDialog(null,"inserted into database");
                    showSpecificBloodData(Integer.parseInt(MainForm.getID()));
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                finally
                {
                    try
                    {
                        con.close();
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }

            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Check Passwords");
        }
    }//GEN-LAST:event_UserSubButtonActionPerformed

    private void RUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUpdateButtonActionPerformed
        con = DBSCon.dataBaseConnection();
        try
        {
            Statement st = con.createStatement();
            String queery = "update Admin_Prof set Name = '"+AdminNametxt.getText()+"', IDNum = '"+IDNumtxt.getText()+"',Adress = '"+Addresstxt.getText()+"',Contact = '"+Contacttxt.getText()+"'";
            st.executeUpdate(queery);
            JOptionPane.showMessageDialog(null, "Data Updated ");
            showSpecificBloodData(Integer.parseInt(MainForm.getID()));
        }catch(Exception ex)
        {

        }
        finally
        {
            try
            {
                con.close();
            }catch(Exception ex)
            {

            }
        }
    }//GEN-LAST:event_RUpdateButtonActionPerformed

    private void AdminProfTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminProfTableMouseClicked
        
    }//GEN-LAST:event_AdminProfTableMouseClicked

    private void RDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDeleteButtonActionPerformed
        con = DBSCon.dataBaseConnection();
        try
        {
            Statement st = con.createStatement();
            String queery = "delete from Admin_Prof where Id = '"+AdminIDtxt.getText()+"'";
            st.executeUpdate(queery);
            JOptionPane.showMessageDialog(null, "Data Deleted ");
            showSpecificBloodData(Integer.parseInt(MainForm.getID()));
        }catch(Exception ex)
        {

        }
        finally
        {
            try
            {
                con.close();
            }catch(Exception ex)
            {

            }
        }
    }//GEN-LAST:event_RDeleteButtonActionPerformed

    private void RInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RInsertButtonActionPerformed
        String contacts = "+27" + Contacttxt.getText() ;
        con = DBSCon.dataBaseConnection();
        try
        {
            Statement st = con.createStatement();
            String queery = "insert into Admin_Prof values ('"+AdminIDtxt.getText()+"','"+AdminNametxt.getText()+"','"+IDNumtxt.getText()+"','"+Addresstxt.getText()+"','"+contacts+"')";
            st.executeUpdate(queery);
            JOptionPane.showMessageDialog(null," Data Inserted Sucessfully");
           showSpecificBloodData(Integer.parseInt(MainForm.getID()));
        }catch(Exception ex)
        {

        }
        finally
        {
            try
            {
                con.close();
            }catch(Exception ex)
            {

            }
        }
    }//GEN-LAST:event_RInsertButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        AdminIDtxt.setText(MainForm.getID());
        GenrelClass.showDataIntoTable("Request", RequestBloodTable);
        GenrelClass.showDataIntoTable("Avail_Blood", AvailableBloodTable);
      JTable InqTable = null;
        GenrelClass.showDataIntoTable("inq_form", InqTable);
        GenrelClass.showDataIntoTable("feed", FeedBackTable);
        showProfile();
    }//GEN-LAST:event_formWindowActivated

    private void LogoutDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutDButtonActionPerformed
        dispose();
        new MainForm().show();
    }//GEN-LAST:event_LogoutDButtonActionPerformed

    private void AdminIDtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdminIDtxtKeyPressed
         String AdminIdLogin = AdminIDtxt.getText();
        int length = AdminIdLogin.length();
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='5')
        {
            if(length<10){
                AdminIDtxt.setEditable(true);
            }else
            {
                AdminIDtxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                AdminIDtxt.setEditable(true);
            }else
            {
                AdminIDtxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_AdminIDtxtKeyPressed

    private void UserIDTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserIDTextFieldKeyPressed
         String AdminIdCreate = UserIDTextField.getText();
        int length = AdminIdCreate.length();
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='5')
        {
            if(length<10){
                UserIDTextField.setEditable(true);
            }else
            {
                UserIDTextField.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                UserIDTextField.setEditable(true);
            }else
            {
               UserIDTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_UserIDTextFieldKeyPressed

    private void ContacttxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContacttxtKeyPressed
        String phoneNum = Contacttxt.getText();
        int length = phoneNum.length();
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='8')
        {
            if(length<10){
                Contacttxt.setEditable(true);
            }else
            {
                Contacttxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                Contacttxt.setEditable(true);
            }else
            {
                Contacttxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_ContacttxtKeyPressed

    private void IDNumtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDNumtxtKeyPressed
        String IDNum = IDNumtxt.getText();
        int length = IDNum.length();
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<13){
                IDNumtxt.setEditable(true);
            }else
            {
                IDNumtxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                IDNumtxt.setEditable(true);
            }else
            {
                IDNumtxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_IDNumtxtKeyPressed

    private void AdminNametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdminNametxtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            AdminNametxt.setEditable(true);
        }else{
            AdminNametxt.setEditable(false);
        }
    }//GEN-LAST:event_AdminNametxtKeyPressed

    private void ReportDButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportDButton1ActionPerformed
           com.itextpdf.text.Document doc = new com.itextpdf.text.Document ();
        try
        {   File desktopDir = new File(System.getProperty("user.home"), "Desktop");
 System.out.println(desktopDir.getPath() + " " + desktopDir.exists());
 String pathToDesktop = desktopDir.getPath();
            String fileName = JOptionPane.showInputDialog("Please enter file name");

            //PdfWriter.getInstance(doc, new FileOutputStream(fileName+".pdf"));
            PdfWriter.getInstance(doc, new FileOutputStream( pathToDesktop+System.getProperty("file.separator")+fileName+".pdf"));
            doc.open();
            doc.add(new Paragraph("--------------------------------"));
            doc.add(new Paragraph("all Available Blood" , FontFactory.getFont(FontFactory.TIMES_BOLD,35, BaseColor.GRAY)));
            doc.add(new Paragraph(new java.util.Date().toString()));
            doc.add(new Paragraph("--------------------------------"));

            PdfPTable table = new PdfPTable(8);
            table.addCell("Id");
            table.addCell("Name");
            table.addCell("BloodBank");
            table.addCell("City");
            table.addCell("BloodType");
            table.addCell("Location");
            table.addCell("Bottles");
            table.addCell("Date");

            con = DBSCon.dataBaseConnection();

            try
            {
                Statement st = con.createStatement();
                String queery = "select * from Avail_Blood";

                ResultSet rs = st.executeQuery(queery);
                while(rs.next())
                {
                    table.addCell(rs.getString("Id"));
                    table.addCell(rs.getString("Name"));
                    table.addCell(rs.getString("BloodBank"));
                    table.addCell(rs.getString("City"));
                    table.addCell(rs.getString("BloodType"));
                    table.addCell(rs.getString("Location"));
                    table.addCell(rs.getString("Bottles"));
                    table.addCell(rs.getString("Date"));
                }

                JOptionPane.showMessageDialog(null, " Report saved ");

                showSpecificBloodData(Integer.parseInt(MainForm.getID()));
            }catch(Exception ex)
            {

            }
            finally
            {
                try
                {
                    con.close();
                }catch(Exception ex)
                {

                }
            }

            doc.add(table);

            doc.add(new Paragraph("--------------------------------"));
            doc.add(new Paragraph("Please donate Blood" , FontFactory.getFont(FontFactory.TIMES_BOLD,35, BaseColor.GRAY)));
            doc.add(new Paragraph("--------------------------------"));

            doc.close();

        }catch(Exception ex)

        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_ReportDButton1ActionPerformed
  public void showProfile()
   {
           con = DBSCon.dataBaseConnection();
           try
           {
               Statement st = con.createStatement();
                       String queery = "select * from Admin_Prof where id = '"+Integer.parseInt(MainForm.getID())+"'";
                       ResultSet rs = st.executeQuery(queery);
                       AdminProfTable.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception ex)
           {
               
           }
   finally 
           {
           try
           {
               con.close();
           }catch(Exception ex)
           {
               
           }
           }
                  
   }
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
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Addresstxt;
    private javax.swing.JTextField AdminIDtxt;
    private javax.swing.JTextField AdminNametxt;
    private javax.swing.JTable AdminProfTable;
    private javax.swing.JTable AvailableBloodTable;
    private javax.swing.JPasswordField ConFPasstxt;
    private javax.swing.JTextField Contacttxt;
    private javax.swing.JTable FeedBackTable;
    private javax.swing.JTextField IDNumtxt;
    private javax.swing.JButton LogoutDButton;
    private javax.swing.JButton RDeleteButton;
    private javax.swing.JButton RInsertButton;
    private javax.swing.JButton RUpdateButton;
    private javax.swing.JLabel RegIDPasslabel;
    private javax.swing.JLabel RegIDPasslabel1;
    private javax.swing.JPasswordField RegPasstxt;
    private javax.swing.JButton ReportDButton;
    private javax.swing.JButton ReportDButton1;
    private javax.swing.JTable RequestBloodTable;
    private javax.swing.JTextField UserIDTextField;
    private javax.swing.JButton UserSubButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void showSpecificBloodData(int Id) {
        
   con = DBSCon.dataBaseConnection();
           try
           {
               Statement st = con.createStatement();
                       String queery = "select * from Admin_Profe Id = "+Id;
                       ResultSet rs = st.executeQuery(queery);
                       AdminProfTable.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception ex)
           {
               
           }
   finally 
           {
           try
           {
               con.close();
           }catch(Exception ex)
           {
               
           }
           }
                      
    }
}
