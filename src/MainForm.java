
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Pattern;

public class MainForm extends javax.swing.JFrame {

 private Connection con = null;
 
 public static String UserIdtxt  ="0";
    public MainForm() {
        initComponents();
        
      
        GenrelClass.setImangeIntoLabel("350.jpg", AboutShowPic);
        showpassword.setVisible(false);
    }
public void setID(String id)
{
    UserIdtxt = id;
    
}
public static String getID()
{
    return UserIdtxt;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        showpassword = new javax.swing.JLabel();
        LoginIDtxt = new javax.swing.JTextField();
        LoginPassLabel = new javax.swing.JLabel();
        LoginBtn1 = new javax.swing.JButton();
        LoginAsLabel = new javax.swing.JLabel();
        LoginIDlabel1 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        LoginComboBox = new javax.swing.JComboBox();
        RegBtn = new javax.swing.JButton();
        LoginPasstxt = new javax.swing.JPasswordField();
        ForgotButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FeedCnclBtn2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        InqCnclBtn = new javax.swing.JButton();
        InqSubBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Inqtxt = new javax.swing.JTextArea();
        InqMsglabel = new javax.swing.JLabel();
        InqNametxt = new javax.swing.JTextField();
        InqNamelabel = new javax.swing.JLabel();
        InqIDlabel = new javax.swing.JLabel();
        InqIDtxt = new javax.swing.JTextField();
        InqContLabel = new javax.swing.JLabel();
        InqConttxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FeedCnclBtn1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        FeedNamelabel = new javax.swing.JLabel();
        FeedNametxt = new javax.swing.JTextField();
        FeedMailtxt = new javax.swing.JTextField();
        FeedMailLabel = new javax.swing.JLabel();
        Feedlabel = new javax.swing.JLabel();
        FeedSubBtn = new javax.swing.JButton();
        FeedCnclBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Feedtxt = new javax.swing.JTextArea();
        FeedEmailError = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        AdminBtn = new javax.swing.JButton();
        AdminCnclBtn = new javax.swing.JButton();
        AdminPassLabel = new javax.swing.JLabel();
        AdminIDlabel = new javax.swing.JLabel();
        AdminIDtxt = new javax.swing.JTextField();
        AdminPasstxt = new javax.swing.JPasswordField();
        LoginBtn2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        AboutShowPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true), "BLOOD DONATION MANAGEMENT SYSTEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 153, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "LOGIN ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N

        showpassword.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N

        LoginIDtxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginIDtxtActionPerformed(evt);
            }
        });
        LoginIDtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginIDtxtKeyPressed(evt);
            }
        });

        LoginPassLabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginPassLabel.setForeground(new java.awt.Color(255, 153, 0));
        LoginPassLabel.setText("Password");

        LoginBtn1.setBackground(new java.awt.Color(0, 102, 51));
        LoginBtn1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginBtn1.setForeground(new java.awt.Color(255, 153, 0));
        LoginBtn1.setText("Sign In");
        LoginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtn1ActionPerformed(evt);
            }
        });

        LoginAsLabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginAsLabel.setForeground(new java.awt.Color(255, 153, 0));
        LoginAsLabel.setText("Login as");

        LoginIDlabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginIDlabel1.setForeground(new java.awt.Color(255, 153, 0));
        LoginIDlabel1.setText("ID");

        LoginBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\godfrey\\Documents\\ProjectBDS\\show icon.png")); // NOI18N
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        LoginComboBox.setBackground(new java.awt.Color(0, 102, 51));
        LoginComboBox.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginComboBox.setForeground(new java.awt.Color(255, 153, 0));
        LoginComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "As Donor", "As Doctor" }));
        LoginComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginComboBoxActionPerformed(evt);
            }
        });

        RegBtn.setBackground(new java.awt.Color(0, 102, 51));
        RegBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        RegBtn.setForeground(new java.awt.Color(255, 153, 0));
        RegBtn.setText("Sign Up");
        RegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegBtnActionPerformed(evt);
            }
        });

        ForgotButton.setBackground(new java.awt.Color(0, 102, 51));
        ForgotButton.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        ForgotButton.setForeground(new java.awt.Color(255, 153, 0));
        ForgotButton.setText("Forgot Password");
        ForgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Your Login ID Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("New? Register here!");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Trouble Loging In ?");

        FeedCnclBtn2.setBackground(new java.awt.Color(0, 102, 51));
        FeedCnclBtn2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedCnclBtn2.setForeground(new java.awt.Color(255, 153, 0));
        FeedCnclBtn2.setText("Clear");
        FeedCnclBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedCnclBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginIDlabel1)
                            .addComponent(LoginAsLabel)
                            .addComponent(LoginPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LoginPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LoginComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoginIDtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ForgotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FeedCnclBtn2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LoginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(91, 91, 91)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addGap(73, 73, 73)
                .addComponent(showpassword)
                .addGap(455, 455, 455))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(showpassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginIDlabel1))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LoginPassLabel)
                                .addComponent(LoginPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginAsLabel)
                            .addComponent(LoginComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginBtn1)
                            .addComponent(RegBtn))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ForgotButton)
                    .addComponent(FeedCnclBtn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "INQUIER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N

        InqCnclBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqCnclBtn.setText("Clear");

        InqSubBtn.setBackground(new java.awt.Color(0, 102, 51));
        InqSubBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqSubBtn.setForeground(new java.awt.Color(255, 153, 0));
        InqSubBtn.setText("Submit");
        InqSubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InqSubBtnActionPerformed(evt);
            }
        });

        Inqtxt.setColumns(20);
        Inqtxt.setRows(5);
        jScrollPane2.setViewportView(Inqtxt);

        InqMsglabel.setBackground(new java.awt.Color(0, 102, 51));
        InqMsglabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqMsglabel.setForeground(new java.awt.Color(255, 153, 0));
        InqMsglabel.setText("Message");

        InqNametxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InqNametxtActionPerformed(evt);
            }
        });

        InqNamelabel.setBackground(new java.awt.Color(0, 102, 51));
        InqNamelabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqNamelabel.setForeground(new java.awt.Color(255, 153, 0));
        InqNamelabel.setText("Enter Name");

        InqIDlabel.setBackground(new java.awt.Color(0, 102, 51));
        InqIDlabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqIDlabel.setForeground(new java.awt.Color(255, 153, 0));
        InqIDlabel.setText("Enter ID");

        InqIDtxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InqIDtxtActionPerformed(evt);
            }
        });

        InqContLabel.setBackground(new java.awt.Color(0, 102, 51));
        InqContLabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqContLabel.setForeground(new java.awt.Color(255, 153, 0));
        InqContLabel.setText("Enter Contact");

        InqConttxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        InqConttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InqConttxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Your Login ID Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("10 Numerics ");

        FeedCnclBtn1.setBackground(new java.awt.Color(0, 102, 51));
        FeedCnclBtn1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedCnclBtn1.setForeground(new java.awt.Color(255, 153, 0));
        FeedCnclBtn1.setText("Clear");
        FeedCnclBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedCnclBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(InqSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InqIDlabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InqNamelabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InqContLabel)
                    .addComponent(InqMsglabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(InqIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InqNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InqConttxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FeedCnclBtn1))
                .addGap(114, 114, 114)
                .addComponent(InqCnclBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(InqCnclBtn)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InqIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InqIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InqNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InqNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(InqContLabel)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(InqConttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InqMsglabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FeedCnclBtn1)
                            .addComponent(InqSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        jTabbedPane1.addTab("Inquiry ", jPanel4);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "SEND FEEDBACK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 24), new java.awt.Color(255, 153, 0))); // NOI18N

        FeedNamelabel.setBackground(new java.awt.Color(0, 102, 51));
        FeedNamelabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedNamelabel.setForeground(new java.awt.Color(255, 153, 0));
        FeedNamelabel.setText("Enter Name");

        FeedNametxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedNametxtActionPerformed(evt);
            }
        });

        FeedMailtxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedMailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedMailtxtActionPerformed(evt);
            }
        });

        FeedMailLabel.setBackground(new java.awt.Color(0, 102, 51));
        FeedMailLabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedMailLabel.setForeground(new java.awt.Color(255, 153, 0));
        FeedMailLabel.setText("Enter Email");

        Feedlabel.setBackground(new java.awt.Color(0, 102, 51));
        Feedlabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Feedlabel.setForeground(new java.awt.Color(255, 153, 0));
        Feedlabel.setText("Feedback");

        FeedSubBtn.setBackground(new java.awt.Color(0, 102, 51));
        FeedSubBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedSubBtn.setForeground(new java.awt.Color(255, 153, 0));
        FeedSubBtn.setText("Submit");
        FeedSubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedSubBtnActionPerformed(evt);
            }
        });

        FeedCnclBtn.setBackground(new java.awt.Color(0, 102, 51));
        FeedCnclBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        FeedCnclBtn.setForeground(new java.awt.Color(255, 153, 0));
        FeedCnclBtn.setText("Clear");
        FeedCnclBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedCnclBtnActionPerformed(evt);
            }
        });

        Feedtxt.setColumns(20);
        Feedtxt.setRows(5);
        jScrollPane1.setViewportView(Feedtxt);

        FeedEmailError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        FeedEmailError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(FeedSubBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FeedCnclBtn))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Feedlabel)
                            .addComponent(FeedMailLabel)
                            .addComponent(FeedNamelabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FeedNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FeedMailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(FeedEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(FeedEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FeedNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeedNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FeedMailLabel)
                    .addComponent(FeedMailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Feedlabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FeedSubBtn)
                    .addComponent(FeedCnclBtn))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Feedback", jPanel6);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "ADMIN LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N

        AdminBtn.setBackground(new java.awt.Color(0, 102, 51));
        AdminBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        AdminBtn.setForeground(new java.awt.Color(255, 204, 0));
        AdminBtn.setText("Login");
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        AdminCnclBtn.setBackground(new java.awt.Color(0, 102, 51));
        AdminCnclBtn.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        AdminCnclBtn.setForeground(new java.awt.Color(255, 153, 0));
        AdminCnclBtn.setText("Clear");
        AdminCnclBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCnclBtnActionPerformed(evt);
            }
        });

        AdminPassLabel.setBackground(new java.awt.Color(0, 102, 51));
        AdminPassLabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        AdminPassLabel.setForeground(new java.awt.Color(255, 153, 0));
        AdminPassLabel.setText("Password");

        AdminIDlabel.setBackground(new java.awt.Color(0, 102, 51));
        AdminIDlabel.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        AdminIDlabel.setForeground(new java.awt.Color(255, 153, 0));
        AdminIDlabel.setText("ID");

        AdminIDtxt.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        AdminIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminIDtxtActionPerformed(evt);
            }
        });
        AdminIDtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdminIDtxtKeyPressed(evt);
            }
        });

        LoginBtn2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        LoginBtn2.setIcon(new javax.swing.ImageIcon("C:\\Users\\godfrey\\Documents\\ProjectBDS\\show icon.png")); // NOI18N
        LoginBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtn2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Your Login ID Number");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(AdminPassLabel)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(AdminIDlabel)
                                .addGap(82, 82, 82)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdminIDtxt)
                            .addComponent(AdminPasstxt)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(AdminBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdminCnclBtn)))
                .addGap(18, 18, 18)
                .addComponent(LoginBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminIDlabel)
                    .addComponent(AdminIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminPassLabel)
                        .addComponent(AdminPasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LoginBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminBtn)
                    .addComponent(AdminCnclBtn))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AboutShowPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AboutShowPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FeedNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeedNametxtActionPerformed

    private void FeedMailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedMailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeedMailtxtActionPerformed

    private void FeedSubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedSubBtnActionPerformed
       
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", FeedMailtxt.getText()))) 
{          
            FeedEmailError.setText("Invalid Email");
            
            }
            else
        {
        con = DBSCon.dataBaseConnection();
            try
            {
                
            Statement st = con.createStatement();
            String queery = "Insert into feed values('"+FeedNametxt.getText()+"','"+FeedMailtxt.getText()+"','"+Feedtxt.getText()+"')";
            st.executeUpdate(queery);
            JOptionPane.showMessageDialog(null,"We appretiate your feedback Thank You!");
            
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
    }//GEN-LAST:event_FeedSubBtnActionPerformed

    private void InqSubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InqSubBtnActionPerformed
         con = DBSCon.dataBaseConnection();
            try
            {
                
            Statement st = con.createStatement();
            String queery = "Insert into inq_form values('"+Integer.parseInt(InqIDtxt.getText())+"','"+InqNametxt.getText()+"','"+InqConttxt.getText()+"','"+Inqtxt.getText()+"')";
            st.executeUpdate(queery);
            JOptionPane.showMessageDialog(null,"Inquery has been Sent we will be in touch soon thank you!");
            
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
    }//GEN-LAST:event_InqSubBtnActionPerformed

    private void InqNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InqNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InqNametxtActionPerformed

    private void InqIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InqIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InqIDtxtActionPerformed

    private void InqConttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InqConttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InqConttxtActionPerformed

    private void LoginBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtn2ActionPerformed
       
        if (showpassword.getText().equals("")){
           AdminPasstxt.setEchoChar((char)0);
            showpassword.setText(("Show password"));
            
        }else{
        AdminPasstxt.setEchoChar('*');
        showpassword.setText("");
        }

    }//GEN-LAST:event_LoginBtn2ActionPerformed

    private void AdminIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminIDtxtActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        con = DBSCon.dataBaseConnection();
        try
        {
            setID(AdminIDtxt.getText());
            Statement st = con.createStatement();
            String queery = "Select id from admin where id = '"+Integer.parseInt(AdminIDtxt.getText())+"' and pass = '"+AdminPasstxt.getText()+"' ";
            ResultSet rs = st.executeQuery(queery);
            if (rs.next())
            {
                dispose();
                new AdminControl().show();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Un-Authorized Admin Please enter Valid ID and Password!");
            }

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
    }//GEN-LAST:event_AdminBtnActionPerformed

    private void ForgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotButtonActionPerformed

        setVisible(false);
        Forgot ob=new Forgot();
        ob.setVisible(true);
    }//GEN-LAST:event_ForgotButtonActionPerformed

    private void RegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegBtnActionPerformed

        this.hide();
        new Add_Donor_Doctor().show();
        
    }//GEN-LAST:event_RegBtnActionPerformed

    private void LoginComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginComboBoxActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:

        if (showpassword.getText().equals("")){
            LoginPasstxt.setEchoChar((char)0);
            showpassword.setText(("Show password"));

        }else{
            LoginPasstxt.setEchoChar('*');
            showpassword.setText("");
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void LoginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtn1ActionPerformed
        con = DBSCon.dataBaseConnection();
        try
        {
            setID(LoginIDtxt.getText());
            Statement st = con.createStatement();
            String queery = "Select id from User_Reg where id = '"+LoginIDtxt.getText()+"' and pass = '"+LoginPasstxt.getText()+"'";
            ResultSet rs = st.executeQuery(queery);
            if (rs.next())
            {
                if (LoginComboBox.getSelectedIndex()== 0)
                {
                    dispose();//this.hide();
                    new BloodDonor().show();
                }

                if (LoginComboBox.getSelectedIndex()== 1)
                {
                    dispose();
                    new Patient().show();
                }
            }
            else
            {
                //
                JOptionPane.showMessageDialog(null,"Un-Authorized User Please enter Valid ID and Password!");
            }

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
    }//GEN-LAST:event_LoginBtn1ActionPerformed

    private void LoginIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginIDtxtActionPerformed

    }//GEN-LAST:event_LoginIDtxtActionPerformed

    private void LoginIDtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginIDtxtKeyPressed
        String IdLogin = LoginIDtxt.getText();
        int length = IdLogin.length();
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='5')
        {
            if(length<10){
                LoginIDtxt.setEditable(true);
            }else
            {
                LoginIDtxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                LoginIDtxt.setEditable(true);
            }else
            {
                LoginIDtxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_LoginIDtxtKeyPressed

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

    private void AdminCnclBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCnclBtnActionPerformed
        AdminIDtxt.setText(" ");
        AdminPasstxt.setText(" ");
    }//GEN-LAST:event_AdminCnclBtnActionPerformed

    private void FeedCnclBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedCnclBtnActionPerformed
       LoginIDtxt.setText(" ");
        LoginPasstxt.setText(" ");
    }//GEN-LAST:event_FeedCnclBtnActionPerformed

    private void FeedCnclBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedCnclBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeedCnclBtn1ActionPerformed

    private void FeedCnclBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedCnclBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeedCnclBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutShowPic;
    private javax.swing.JButton AdminBtn;
    private javax.swing.JButton AdminCnclBtn;
    private javax.swing.JLabel AdminIDlabel;
    private javax.swing.JTextField AdminIDtxt;
    private javax.swing.JLabel AdminPassLabel;
    private javax.swing.JPasswordField AdminPasstxt;
    private javax.swing.JButton FeedCnclBtn;
    private javax.swing.JButton FeedCnclBtn1;
    private javax.swing.JButton FeedCnclBtn2;
    private javax.swing.JLabel FeedEmailError;
    private javax.swing.JLabel FeedMailLabel;
    private javax.swing.JTextField FeedMailtxt;
    private javax.swing.JLabel FeedNamelabel;
    private javax.swing.JTextField FeedNametxt;
    private javax.swing.JButton FeedSubBtn;
    private javax.swing.JLabel Feedlabel;
    private javax.swing.JTextArea Feedtxt;
    private javax.swing.JButton ForgotButton;
    private javax.swing.JButton InqCnclBtn;
    private javax.swing.JLabel InqContLabel;
    private javax.swing.JTextField InqConttxt;
    private javax.swing.JLabel InqIDlabel;
    private javax.swing.JTextField InqIDtxt;
    private javax.swing.JLabel InqMsglabel;
    private javax.swing.JLabel InqNamelabel;
    private javax.swing.JTextField InqNametxt;
    private javax.swing.JButton InqSubBtn;
    private javax.swing.JTextArea Inqtxt;
    private javax.swing.JLabel LoginAsLabel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton LoginBtn1;
    private javax.swing.JButton LoginBtn2;
    private javax.swing.JComboBox LoginComboBox;
    private javax.swing.JLabel LoginIDlabel1;
    private javax.swing.JTextField LoginIDtxt;
    private javax.swing.JLabel LoginPassLabel;
    private javax.swing.JPasswordField LoginPasstxt;
    private javax.swing.JButton RegBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel showpassword;
    // End of variables declaration//GEN-END:variables
}
