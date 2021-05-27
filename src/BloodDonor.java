import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.glass.events.KeyEvent;
import java.io.FileOutputStream;
import javafx.application.Application;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
public class BloodDonor extends javax.swing.JFrame {

   private Connection con = null;
    public BloodDonor() {
        initComponents();
        showProfile();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProfileDTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AvailBloodDonorTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CityDonorCombo = new javax.swing.JComboBox();
        IdDonortxt = new javax.swing.JTextField();
        DonorDateChooser = new com.toedter.calendar.JDateChooser();
        NameDonortxt = new javax.swing.JTextField();
        BankDonortxt = new javax.swing.JTextField();
        LocationDonortxt = new javax.swing.JTextField();
        BTypeDonorCombo = new javax.swing.JComboBox();
        BottleDonorCombo = new javax.swing.JComboBox();
        DUpdateButton = new javax.swing.JButton();
        DDeleteButton = new javax.swing.JButton();
        DInsertButton = new javax.swing.JButton();
        LogoutDButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 4, true), "DONATE BLOOD AND BE A HERO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        ProfileDTable.setBackground(new java.awt.Color(0, 102, 102));
        ProfileDTable.setForeground(new java.awt.Color(255, 204, 0));
        jScrollPane3.setViewportView(ProfileDTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        jTabbedPane1.addTab("Profile", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 4, true), "DONATION DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MingLiU", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N

        AvailBloodDonorTable.setBackground(new java.awt.Color(0, 102, 102));
        AvailBloodDonorTable.setForeground(new java.awt.Color(255, 204, 0));
        AvailBloodDonorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvailBloodDonorTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(AvailBloodDonorTable);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("User Id");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Blood Bank Name");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("City/Town");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Blood Type");

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Location");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Bottle");

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Date");

        CityDonorCombo.setForeground(new java.awt.Color(255, 153, 0));
        CityDonorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alice", "Butterworth", "Bethlehem", "Bloemfontein", "East London", "Graaff-Reinet", "Grahamstown", "Jagersfontein", "King William’s Town", "Mthatha", "Port Elizabeth", "Queenstown", "Uitenhage", "Zwelitsha" }));

        IdDonortxt.setEditable(false);
        IdDonortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdDonortxtKeyPressed(evt);
            }
        });

        DonorDateChooser.setForeground(new java.awt.Color(255, 153, 0));

        NameDonortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameDonortxtKeyPressed(evt);
            }
        });

        LocationDonortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LocationDonortxtKeyPressed(evt);
            }
        });

        BTypeDonorCombo.setForeground(new java.awt.Color(255, 153, 0));
        BTypeDonorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        BottleDonorCombo.setForeground(new java.awt.Color(255, 153, 0));
        BottleDonorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        DUpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        DUpdateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DUpdateButton.setForeground(new java.awt.Color(255, 153, 0));
        DUpdateButton.setText("Update");
        DUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DUpdateButtonActionPerformed(evt);
            }
        });

        DDeleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DDeleteButton.setForeground(new java.awt.Color(255, 153, 0));
        DDeleteButton.setText("Delete");
        DDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDeleteButtonActionPerformed(evt);
            }
        });

        DInsertButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DInsertButton.setForeground(new java.awt.Color(255, 153, 0));
        DInsertButton.setText("Insert");
        DInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DInsertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NameDonortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BTypeDonorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CityDonorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BottleDonorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BankDonortxt)
                                .addComponent(LocationDonortxt)
                                .addComponent(DonorDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addComponent(IdDonortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IdDonortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(NameDonortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(BottleDonorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(BankDonortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(CityDonorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(DDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(BTypeDonorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(LocationDonortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DonorDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Donate", jPanel3);

        LogoutDButton.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        LogoutDButton.setForeground(new java.awt.Color(255, 153, 0));
        LogoutDButton.setText("Logout");
        LogoutDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutDButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogoutDButton))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogoutDButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        IdDonortxt.setText(MainForm.getID());
       // GenrelClass.showDataIntoTable("Request", RequestBloodTable);
       // GenrelClass.showDataIntoTable("Avail_Blood", RequestBloodTable);
       showSpecificBloodData(Integer.parseInt(MainForm.getID()));
        
        
    }//GEN-LAST:event_formWindowActivated

    private void LogoutDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutDButtonActionPerformed
        dispose();
        new MainForm().show();
    }//GEN-LAST:event_LogoutDButtonActionPerformed

    private void DInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DInsertButtonActionPerformed
        String date = ((JTextField)DonorDateChooser.getDateEditor().getUiComponent()).getText();
        con = DBSCon.dataBaseConnection();
        try
        {

            Statement st = con.createStatement();
            String queery = "insert into Avail_Blood values ('"+Integer.parseInt(IdDonortxt.getText())+"','"+NameDonortxt.getText()+"','"+BankDonortxt.getText()+"','"+CityDonorCombo.getSelectedItem()+"','"+BTypeDonorCombo.getSelectedItem()+"',"
                    + "'"+LocationDonortxt.getText()+"','"+BottleDonorCombo.getSelectedItem()+"','"+date+"')";
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
    }//GEN-LAST:event_DInsertButtonActionPerformed

    private void DDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDeleteButtonActionPerformed
        con = DBSCon.dataBaseConnection();
        try
        {
            Statement st = con.createStatement();
            String queery = "delete from Avail_Blood where Id = '"+IdDonortxt.getText()+"' and Name = '"+NameDonortxt.getText()+"' ";
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
    }//GEN-LAST:event_DDeleteButtonActionPerformed

    private void DUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DUpdateButtonActionPerformed
        con = DBSCon.dataBaseConnection();
        String date = ((JTextField)DonorDateChooser.getDateEditor().getUiComponent()).getText();
        try
        {
            Statement st = con.createStatement();
            String queery = "update Avail_Blood set Name = '"+NameDonortxt.getText()+"', BloodBank = '"+BankDonortxt.getText()+"', BloodType = '"+BTypeDonorCombo.getSelectedItem()+"',Location = '"+LocationDonortxt.getText()+"', Bottles = '"+BottleDonorCombo.getSelectedItem()+"',Date = '"+date+"' where Id = '"+Integer.parseInt(IdDonortxt.getText())+"' and City = '"+CityDonorCombo.getSelectedItem()+"' ";
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
    }//GEN-LAST:event_DUpdateButtonActionPerformed

    private void AvailBloodDonorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvailBloodDonorTableMouseClicked
        int row = AvailBloodDonorTable.getSelectedRow();
        int value = Integer.parseInt(AvailBloodDonorTable.getModel().getValueAt(row, 0).toString());

        con = DBSCon.dataBaseConnection();
        try
        {
            Statement st = con.createStatement();
            String queery = "select * from Avail_Blood where id = '"+value+"' ";
            ResultSet rs = st.executeQuery(queery);

            if (rs.next())
            {

                IdDonortxt.setText(rs.getString(1));
                NameDonortxt.setText(rs.getString(2));
                BankDonortxt.setText(rs.getString(3));
                CityDonorCombo.setSelectedItem(rs.getString(4));
                BTypeDonorCombo.setSelectedItem(rs.getString(5));
                LocationDonortxt.setText(rs.getString(6));
                BottleDonorCombo.setSelectedItem(rs.getString(7));
                Date date = rs.getDate(8);
                DonorDateChooser.setDate(date);

            }
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
    }//GEN-LAST:event_AvailBloodDonorTableMouseClicked

    private void IdDonortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdDonortxtKeyPressed
        String IdDonor = IdDonortxt.getText();
        int length = IdDonor.length();
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<5){
                IdDonortxt.setEditable(true);
            }else
            {
                IdDonortxt.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                IdDonortxt.setEditable(true);
            }else
            {
                IdDonortxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_IdDonortxtKeyPressed

    private void NameDonortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameDonortxtKeyPressed
       char c = evt.getKeyChar();
         if (Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            NameDonortxt.setEditable(true);
        }else{
             NameDonortxt.setEditable(false);
         }                                      

    }//GEN-LAST:event_NameDonortxtKeyPressed

    private void LocationDonortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LocationDonortxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationDonortxtKeyPressed

    
   public void showSpecificBloodData(int Id)
   {
           con = DBSCon.dataBaseConnection();
           try
           {
               Statement st = con.createStatement();
                       String queery = "select * from Avail_Blood where Id = "+Id;
                       ResultSet rs = st.executeQuery(queery);
                       AvailBloodDonorTable.setModel(DbUtils.resultSetToTableModel(rs));
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
    
    
   public void showProfile()
   {
           con = DBSCon.dataBaseConnection();
           try
           {
               Statement st = con.createStatement();
                       String queery = "select * from User_Reg where id = '"+Integer.parseInt(MainForm.getID())+"'";
                       ResultSet rs = st.executeQuery(queery);
                       ProfileDTable.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception ex)
           {
               ResultSet rs = null;
               ProfileDTable.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(BloodDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AvailBloodDonorTable;
    private javax.swing.JComboBox BTypeDonorCombo;
    private javax.swing.JTextField BankDonortxt;
    private javax.swing.JComboBox BottleDonorCombo;
    private javax.swing.JComboBox CityDonorCombo;
    private javax.swing.JButton DDeleteButton;
    private javax.swing.JButton DInsertButton;
    private javax.swing.JButton DUpdateButton;
    private com.toedter.calendar.JDateChooser DonorDateChooser;
    private javax.swing.JTextField IdDonortxt;
    private javax.swing.JTextField LocationDonortxt;
    private javax.swing.JButton LogoutDButton;
    private javax.swing.JTextField NameDonortxt;
    private javax.swing.JTable ProfileDTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
