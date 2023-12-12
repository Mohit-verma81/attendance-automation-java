/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apps;
import DB.DBConnection;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mohit
 */
public class RegistrationInfo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationInfo
     */
    Color bgColor = new Color(31,36,45);
    Color secondBgColor  = new Color(50,57,70);
    Color mainColor  = new Color(0,238,255);
    
    public RegistrationInfo() {
        initComponents();
        setTitle("Registration Page");
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
        reg_win = new javax.swing.JLabel();
        srno = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        scourse = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        contact1 = new javax.swing.JLabel();
        Address1 = new javax.swing.JLabel();
        userId_field = new javax.swing.JTextField();
        password_field = new javax.swing.JTextField();
        name_field = new javax.swing.JTextField();
        dob_field = new javax.swing.JTextField();
        qualification_field = new javax.swing.JTextField();
        post_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        contact_field = new javax.swing.JTextField();
        address_field = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        closeButton = new javax.swing.JLabel();
        bg_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 750));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 36, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reg_win.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        reg_win.setForeground(new java.awt.Color(50, 57, 70));
        reg_win.setText("Registration Window");
        reg_win.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 238, 255)));
        jPanel1.add(reg_win, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 390, 70));

        srno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        srno.setForeground(new java.awt.Color(50, 57, 70));
        srno.setText("User Id");
        srno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                srnoFocusGained(evt);
            }
        });
        jPanel1.add(srno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 90, 40));

        sname.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        sname.setForeground(new java.awt.Color(50, 57, 70));
        sname.setText("Password");
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 110, -1));

        scourse.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        scourse.setForeground(new java.awt.Color(50, 57, 70));
        scourse.setText("Name");
        jPanel1.add(scourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        sem.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        sem.setForeground(new java.awt.Color(50, 57, 70));
        sem.setText("D.O.B.");
        jPanel1.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, -1, -1));

        Address.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Address.setForeground(new java.awt.Color(50, 57, 70));
        Address.setText("Email");
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        contact.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        contact.setForeground(new java.awt.Color(50, 57, 70));
        contact.setText("Post");
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        email.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        email.setForeground(new java.awt.Color(50, 57, 70));
        email.setText("Qualification");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 140, -1));

        contact1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        contact1.setForeground(new java.awt.Color(50, 57, 70));
        contact1.setText("Contact");
        jPanel1.add(contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, -1, -1));

        Address1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Address1.setForeground(new java.awt.Color(50, 57, 70));
        Address1.setText("Address");
        jPanel1.add(Address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        userId_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userId_field.setForeground(new java.awt.Color(204, 204, 204));
        userId_field.setText("enter user Id");
        userId_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        userId_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userId_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userId_fieldFocusLost(evt);
            }
        });
        userId_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userId_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(userId_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 170, -1));

        password_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        password_field.setForeground(new java.awt.Color(204, 204, 204));
        password_field.setText("enter password");
        password_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_fieldFocusGained(evt);
            }
        });
        jPanel1.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 180, -1));

        name_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name_field.setForeground(new java.awt.Color(204, 204, 204));
        name_field.setText("enter name");
        name_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        name_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_fieldFocusGained(evt);
            }
        });
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 180, -1));

        dob_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dob_field.setForeground(new java.awt.Color(204, 204, 204));
        dob_field.setText("enter date of birth");
        dob_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        dob_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dob_fieldFocusGained(evt);
            }
        });
        jPanel1.add(dob_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 180, -1));

        qualification_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        qualification_field.setForeground(new java.awt.Color(204, 204, 204));
        qualification_field.setText("enter qualification");
        qualification_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        qualification_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qualification_fieldFocusGained(evt);
            }
        });
        jPanel1.add(qualification_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 180, -1));

        post_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        post_field.setForeground(new java.awt.Color(204, 204, 204));
        post_field.setText("enter post");
        post_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        post_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                post_fieldFocusGained(evt);
            }
        });
        jPanel1.add(post_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, 180, -1));

        email_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        email_field.setForeground(new java.awt.Color(204, 204, 204));
        email_field.setText("enter  email");
        email_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        email_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_fieldFocusGained(evt);
            }
        });
        jPanel1.add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 180, -1));

        contact_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        contact_field.setForeground(new java.awt.Color(204, 204, 204));
        contact_field.setText("enter mobile number");
        contact_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        contact_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contact_fieldFocusGained(evt);
            }
        });
        jPanel1.add(contact_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 180, -1));

        address_field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        address_field.setForeground(new java.awt.Color(204, 204, 204));
        address_field.setText("enter address");
        address_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 238, 255)));
        address_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                address_fieldFocusGained(evt);
            }
        });
        jPanel1.add(address_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 180, -1));

        submitButton.setBackground(new java.awt.Color(0, 238, 255));
        submitButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        submitButton.setForeground(new java.awt.Color(50, 57, 70));
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.gif"))); // NOI18N
        submitButton.setText("Register");
        submitButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                submitButtonFocusGained(evt);
            }
        });
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 160, 50));

        loginButton.setBackground(new java.awt.Color(0, 238, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        loginButton.setForeground(new java.awt.Color(50, 57, 70));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 160, 50));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1206557186603844069mcol_cross.svg.med.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 30, 40));

        bg_img.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bg_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Signup_bg2.jpg"))); // NOI18N
        jPanel1.add(bg_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1300, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 750));

        setSize(new java.awt.Dimension(1300, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        this.setVisible(false);
        LoginPage logpage = new LoginPage();
        logpage.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void submitButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitButtonFocusGained
        submitButton.setForeground(secondBgColor);
    }//GEN-LAST:event_submitButtonFocusGained

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try{
                String userId=userId_field.getText();
                String pswd=password_field.getText();
                String name=name_field.getText();
                String dob=dob_field.getText();
                String quali=qualification_field.getText();
                String post=post_field.getText();
                String addr=address_field.getText();
                String cont=contact_field.getText();
                String email=email_field.getText();
                
                DB.DBConnection db=new DB.DBConnection();
                db.stmt=db.con.createStatement();
                int i=db.stmt.executeUpdate("insert into login(user,password,name,dob,qualification,post,address,contact,email) "
                        + "values('"+userId+"','"+pswd+"','"+name+"','"+dob+"','"+quali+"','"+post+"','"+addr+"','"+cont+"','"+email+"')");
                if(i>0)
                {
                       JOptionPane.showMessageDialog(null, "Record Added Successfully");
                }
                
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void userId_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userId_fieldFocusGained
        userId_field.setText("");
        userId_field.setForeground(secondBgColor);
    }//GEN-LAST:event_userId_fieldFocusGained

    private void userId_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userId_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userId_fieldActionPerformed

    private void password_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_fieldFocusGained
        password_field.setText("");
        password_field.setForeground(secondBgColor);
    }//GEN-LAST:event_password_fieldFocusGained

    private void name_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_fieldFocusGained
        name_field.setText("");
        name_field.setForeground(secondBgColor);
    }//GEN-LAST:event_name_fieldFocusGained

    private void dob_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dob_fieldFocusGained
        dob_field.setText("");
        dob_field.setForeground(secondBgColor);
    }//GEN-LAST:event_dob_fieldFocusGained

    private void qualification_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualification_fieldFocusGained
        qualification_field.setText("");
        qualification_field.setForeground(secondBgColor);
    }//GEN-LAST:event_qualification_fieldFocusGained

    private void post_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_post_fieldFocusGained
        post_field.setText("");
        post_field.setForeground(secondBgColor);
    }//GEN-LAST:event_post_fieldFocusGained

    private void email_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_fieldFocusGained
        email_field.setText("");
        email_field.setForeground(secondBgColor);
    }//GEN-LAST:event_email_fieldFocusGained

    private void userId_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userId_fieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_userId_fieldFocusLost

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        
        int i=JOptionPane.showConfirmDialog(this,"Are you sure want to Close registration Form?","Close this form",JOptionPane.YES_NO_CANCEL_OPTION);
                // 0=yes, 1=no, 2=cancel
                //trick to learn remember indexing of button from 0;
                if(i==0){
                    this.setVisible(false);
                }
    }//GEN-LAST:event_closeButtonMouseClicked

    private void srnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srnoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_srnoFocusGained

    private void contact_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact_fieldFocusGained
        contact_field.setText("");
        contact_field.setForeground(secondBgColor);
    }//GEN-LAST:event_contact_fieldFocusGained

    private void address_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_fieldFocusGained
        address_field.setText("");
        address_field.setForeground(secondBgColor);
    }//GEN-LAST:event_address_fieldFocusGained

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
            java.util.logging.Logger.getLogger(RegistrationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Address1;
    private javax.swing.JTextField address_field;
    private javax.swing.JLabel bg_img;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel contact1;
    private javax.swing.JTextField contact_field;
    private javax.swing.JTextField dob_field;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email_field;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField password_field;
    private javax.swing.JTextField post_field;
    private javax.swing.JTextField qualification_field;
    private javax.swing.JLabel reg_win;
    private javax.swing.JLabel scourse;
    private javax.swing.JLabel sem;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel srno;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userId_field;
    // End of variables declaration//GEN-END:variables
}