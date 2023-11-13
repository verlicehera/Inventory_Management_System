
package inventorymanagementsystem;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

 
    public SignUp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fNameField = new javax.swing.JTextField();
        unameField = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        confirmpassField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        birthdateField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        positionField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\InventoryManagementSystem\\src\\inventorymanagementsystem\\Icon\\icon'.jpg")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mines and Geosciences Bureau");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Finance and Administrative Division");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("copyright © Mines and Geosciences Bureau All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RightLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jLabel5))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(RightLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel7)))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)))
                .addGap(29, 29, 29))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(410, 700));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("SIGN UP");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        fNameField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fNameField.setForeground(new java.awt.Color(102, 102, 102));
        fNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameFieldActionPerformed(evt);
            }
        });
        jPanel3.add(fNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 30));

        unameField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        unameField.setForeground(new java.awt.Color(102, 102, 102));
        unameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameFieldActionPerformed(evt);
            }
        });
        jPanel3.add(unameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 350, 30));

        PassField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });
        jPanel3.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 350, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("I have an account. ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 165, 37));

        confirmpassField.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        confirmpassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassFieldActionPerformed(evt);
            }
        });
        jPanel3.add(confirmpassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 350, 30));

        jLabel12.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Login");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, 20));

        jLabel85.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("Contact Number");
        jLabel85.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel85.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel85.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel3.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, -1));

        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });
        jPanel3.add(contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        jLabel87.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(102, 102, 102));
        jLabel87.setText("Birthdate");
        jLabel87.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel87.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel87.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel3.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 110, -1));

        birthdateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateFieldActionPerformed(evt);
            }
        });
        jPanel3.add(birthdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 160, 30));
        jPanel3.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 30));

        positionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionFieldActionPerformed(evt);
            }
        });
        jPanel3.add(positionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 30));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Full Name");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Username");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Password");
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Confirm Password");
        jLabel14.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel14.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel14.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Email");
        jLabel15.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel15.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel15.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Position");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 100, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 410, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameFieldActionPerformed

    private void unameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameFieldActionPerformed

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fullname = fNameField.getText();
        String username = unameField.getText();
        String password = String.valueOf(PassField.getPassword());
        String password2 = String.valueOf(confirmpassField.getPassword());
        String contact = contactField.getText();
        String birth = birthdateField.getText();
        String email = emailField.getText();
        String position = positionField.getText();
        
        
        if (verifyFields()) {
            if(!checkUsername(username)) {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `signup`(`Fullname`, `Username`, `Password`, `Contact Number`, `Birthdate`, `Email`, `Position`) VALUES (?,?,?,?,?,?,?)";
                
                try {
                    
                    ps = (PreparedStatement) My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fullname);
                    ps.setString(2, username);
                    ps.setString(3, password);
                    ps.setString(4,contact);
                    ps.setString(5, birth);
                    ps.setString(6,email);
                    ps.setString(7, position);
                  
                    
                    if(ps.executeUpdate() !=0) {
                        JOptionPane.showMessageDialog(null, "Your Account has been created, Login your Account");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                    
                    fNameField.setText("");
                    unameField.setText("");
                    PassField.setText("");
                    confirmpassField.setText("");
                    contactField.setText("");
                    birthdateField.setText("");
                    emailField.setText("");
                    positionField.setText("");
                    
                    Login LoginFrame = new Login();
                    LoginFrame.setVisible(true);
                    LoginFrame.pack();
                    LoginFrame.setLocationRelativeTo(null);
                    this.dispose();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void confirmpassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassFieldActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void birthdateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateFieldActionPerformed

    private void positionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionFieldActionPerformed

    //create a function to verify the empty fields
    public boolean verifyFields() {
        String fullname = fNameField.getText();
        String username = unameField.getText();
        String password = String.valueOf(PassField.getPassword());
        String password2 = String.valueOf(confirmpassField.getPassword());
        String contact = contactField.getText();
        String birth = birthdateField.getText();
        String email = emailField.getText();
        String position = positionField.getText();
        
        //check empty fields
        if (fullname.trim().equals("") || username.trim().equals("") || password.trim().equals("") 
                || password2.trim().equals("") || contact.trim().equals("") || birth.trim().equals("")
                || email.trim().equals("") || position.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or More Fields are Empty!", "Empty Fields", 2);
            return false;
        }
        
        //check if the 2 passwords are equals
        if(!password.equals(password2)) {
            JOptionPane.showMessageDialog(null,"Password doesn't match!", "Confirm Password!", 2);
            return false;
    }
        //if everything is ok
        else {
            return true;
        }
        }
    
    //create a function if the entered username already exists in the database
        public boolean checkUsername(String uname) {
            
            PreparedStatement st;
            ResultSet rs;
            boolean uname_exist = false;
            
            String query = "SELECT * FROM `signup` WHERE `username` = ?";
            
            try{ 
                st = (PreparedStatement) My_CNX.getConnection().prepareStatement(query);
                st.setString(1, uname);
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    uname_exist = true;
                    JOptionPane.showMessageDialog(null, "This Username was already Taken! Choose Another One", "Username Failed!",2);
                }
            } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            return uname_exist;
        }
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField birthdateField;
    private javax.swing.JPasswordField confirmpassField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField positionField;
    private javax.swing.JTextField unameField;
    // End of variables declaration//GEN-END:variables

    
}
