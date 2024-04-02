package newpackage;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Show_Result extends javax.swing.JFrame {

    int s1;
    int s2;
    int s3;
    int s4;
    int s5;
    int s6;
    int s7;
    int s8;
    int s9;

    PreparedStatement ptst;
    // Connection con;
    Statement st;
    ResultSet rs;

    String roll_num5;
    String Year1;
    String name2;
    String father3;
    String mother4;
    String Course6;
    String Gender7;
    String hindi8;
    String english9;
    String math10;
    String web_design11;
    String yoga12;
    String operating_sys13;
    String Community_eng14;
    String environment15;
    String ComputerFanda16;
    String total_Marks17;
    String result_18;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Show_Result.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Result.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Result.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Result.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Result().setVisible(true);
            }
        });
    }

    public Show_Result() {
        initComponents();
    }

    public Show_Result(String roll_num) {
        initComponents();
        jTextField5.setText(roll_num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sant Singaji Institute of Science & Management,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 27, -1, -1));

        jLabel2.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/newpackage/1595483733332-removebg-preview200.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 16, 125, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Sandalpur (M.P.)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 65, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Session  -- 2024 - 25");
        jLabel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel4ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 114, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 218, 87, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Father Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 252, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 184, 137, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 218, 137, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mother Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 286, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 252, 136, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 254, 94, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 286, 136, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Roll Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 184, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 184, 137, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Year");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 186, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Course");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 222, 55, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 220, 137, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 254, 137, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText(
                "Subject                           |          Marks          |               Passing Marks        |            Marks Obtained");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 326, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText(
                "Hindi                              |              75             |                        23                   ");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 354, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 354, 117, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("English                           |              75             |                        23");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 382, 480, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 382, 117, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Mathematics                 |              75             |                        23");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 410, 480, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 410, 117, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Web Designing             |              75             |                        23");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 438, 480, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 438, 117, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Yoga                              |              75             |                        23");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 480, -1));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 470, 120, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Operating System        |              75             |                        23 ");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 500, 480, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 500, 117, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Community Eng.           |              75            |                        23");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 528, 480, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 528, 117, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Enviroment                   |              75             |                        23");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 556, 480, -1));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 556, 117, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Computer Funda.         |               75            |                        23");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 584, 480, -1));
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 584, 117, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Result");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 640, 480, -1));
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 612, 117, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Total Marks");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 612, 480, -1));
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 640, 117, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Download PDF_File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Result_Bckground.png"))); // NOI18N
        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4ComponentHidden(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_jLabel4ComponentHidden
        // TODO add your handling code here:
    }// GEN-LAST:event_jLabel4ComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new Student_Result().setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_formComponentShown
        roll_num5 = jTextField5.getText();
        try {
            ClassLoadingAndConnectivity.loadAndConnect();
            Statement st = ClassLoadingAndConnectivity.con.createStatement();
            rs = st.executeQuery(
                    "select * from Student_Information inner join Student_Results where Student_Information.Roll_Number='"
                            + roll_num5 + "' and Student_Results.Roll_Num='" + roll_num5 + "' ");
            if (rs.next()) {

                Year1 = rs.getString(2);
                name2 = rs.getString(4);
                father3 = rs.getString(5);
                mother4 = rs.getString(6);
                Course6 = rs.getString(1);
                Gender7 = rs.getString(7);
                hindi8 = rs.getString(9);
                english9 = rs.getString(10);
                math10 = rs.getString(11);
                web_design11 = rs.getString(12);
                yoga12 = rs.getString(13);
                operating_sys13 = rs.getString(14);
                Community_eng14 = rs.getString(15);
                environment15 = rs.getString(16);
                ComputerFanda16 = rs.getString(17);

                jTextField1.setText(Year1);
                jTextField2.setText(name2);
                jTextField3.setText(father3);
                jTextField4.setText(mother4);
                jTextField6.setText(Course6);
                jTextField7.setText(Gender7);
                jTextField8.setText(hindi8);
                jTextField9.setText(english9);
                jTextField10.setText(math10);
                jTextField11.setText(web_design11);
                jTextField12.setText(yoga12);
                jTextField13.setText(operating_sys13);
                jTextField14.setText(Community_eng14);
                jTextField15.setText(environment15);
                jTextField16.setText(ComputerFanda16);

                s1 = Integer.parseInt(jTextField8.getText());
                s2 = Integer.parseInt(jTextField9.getText());
                s3 = Integer.parseInt(jTextField10.getText());
                s4 = Integer.parseInt(jTextField11.getText());
                s5 = Integer.parseInt(jTextField12.getText());
                s6 = Integer.parseInt(jTextField13.getText());
                s7 = Integer.parseInt(jTextField14.getText());
                s8 = Integer.parseInt(jTextField15.getText());
                s9 = Integer.parseInt(jTextField16.getText());
                int result = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9;
                total_Marks17 = String.valueOf(result);
                jTextField17.setText(total_Marks17);
                int count = 0;
                if (s1 < 23) {
                    count++;
                }
                if (s2 < 23) {
                    count++;
                }
                if (s3 < 23) {
                    count++;
                }
                if (s4 < 23) {
                    count++;
                }
                if (s5 < 23) {
                    count++;
                }
                if (s6 < 23) {
                    count++;
                }
                if (s7 < 23) {
                    count++;
                }
                if (s8 < 23) {
                    count++;
                }
                if (s9 < 23) {
                    count++;
                }
                if (count <= 3) {
                    result_18 = "ATKT";
                    jTextField18.setText(result_18);
                }
                if (count > 3) {
                    result_18 = "Fail";
                    jTextField18.setText(result_18);
                }
                if (count == 0) {
                    result_18 = "Pass";
                    jTextField18.setText(result_18);
                }

            } else {
                if (roll_num5.equals("")) {
                    JOptionPane.showMessageDialog(null, "please Enter Roll_number ");
                    setVisible(false);
                    new Student_Result().setVisible(true);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error");

        }
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
        jTextField12.setEditable(false);
        jTextField13.setEditable(false);
        jTextField14.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
        jTextField17.setEditable(false);
        jTextField18.setEditable(false);

    }// GEN-LAST:event_formComponentShown

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        GeneretedPdf();

        // ... rest of the code (GUI initialization and event handling)
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            formComponentShown(null);
        }
    }// GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            GeneretedPdf();
        }
    }// GEN-LAST:event_jButton2KeyPressed

    /**
     * @param args the command line arguments
     */
    void GeneretedPdf() {
        try {
            Document document;
            try {
                String file = roll_num5 + "Result.pdf";
                document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(file));
                document.open();
                float fntSize, lineSpacing;
                fntSize = 24.7f;
                lineSpacing = 30f;
                String line1 = "Sant Singaji Institute of Science &     \n     Management Sandalpur ( MP )\n\n         Session 2024--2025 \n\n                                    -----------------------------------";
                Paragraph p1 = new Paragraph(new Phrase(20f, line1,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, fntSize)));
                p1.setAlignment(5);
                document.add(p1);
                String line2 = "Roll_Number:           " + roll_num5;
                Paragraph p2 = new Paragraph(new Phrase(30f, line2,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p2.setAlignment(5);
                document.add(p2);
                String line3 = "Year:                  " + Year1;
                Paragraph p3 = new Paragraph(new Phrase(30f, line3,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p3.setAlignment(5);
                document.add(p3);
                String line4 = "Name:                  " + name2;
                Paragraph p4 = new Paragraph(new Phrase(30f, line4,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p4.setAlignment(5);
                document.add(p4);
                String line5 = "Father_Name:           " + father3;
                Paragraph p5 = new Paragraph(new Phrase(30f, line5,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p5.setAlignment(5);
                document.add(p5);
                String line6 = "Mother_Name:           " + mother4;
                Paragraph p6 = new Paragraph(new Phrase(30f, line6,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p6.setAlignment(5);
                document.add(p6);
                String line7 = "Course:                " + Course6;
                Paragraph p7 = new Paragraph(new Phrase(30f, line7,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p7.setAlignment(5);
                document.add(p7);
                String line8 = "Gender:                " + Gender7;
                Paragraph p8 = new Paragraph(new Phrase(30f, line8,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p8.setAlignment(5);
                document.add(p8);
                String line9 = "\n____________________________________________________\n";
                Paragraph p9 = new Paragraph(new Phrase(30f, line9,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p9.setAlignment(5);
                document.add(p9);
                String line10 = "\n";
                Paragraph p10 = new Paragraph(new Phrase(30f, line10,
                        FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                p9.setAlignment(5);
                document.add(p10);
                PdfPTable pdft = new PdfPTable(4);
                pdft.getDefaultCell().setMinimumHeight(20f);
                pdft.setTotalWidth(510f);
                pdft.setLockedWidth(true);
                pdft.setSpacingBefore(12.4f);
                pdft.addCell("Subject");
                pdft.addCell("Marks");
                pdft.addCell("Passing Marks");
                pdft.addCell("Marks Obtained");
                // document.add(pdft);
                ClassLoadingAndConnectivity.loadAndConnect();
                Statement st = ClassLoadingAndConnectivity.con.createStatement();
                // String query2=" Where bill_id ="+Cust_id.getText();
                ResultSet r = st.executeQuery(
                        "select * from Student_Information inner join Student_Results where Student_Information.Roll_Number='"
                                + roll_num5 + "' and Student_Results.Roll_Num='" + roll_num5 + "' ");
                if (r.next()) {
                    pdft.addCell("Hindi");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(hindi8);
                    pdft.addCell("English");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(english9);
                    pdft.addCell("Mathematics");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(math10);
                    pdft.addCell("Web Designing");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(web_design11);
                    pdft.addCell("Yoga");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(yoga12);
                    pdft.addCell("Operating System");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(operating_sys13);
                    pdft.addCell("Community_eng");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(Community_eng14);
                    pdft.addCell("Environment");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(environment15);
                    pdft.addCell("Computer Fandamental");
                    pdft.addCell("75");
                    pdft.addCell("23");
                    pdft.addCell(ComputerFanda16);
                    pdft.addCell("Total Marks ");
                    pdft.addCell("675");
                    pdft.addCell("-");
                    pdft.addCell(total_Marks17);
                    pdft.addCell("Result");
                    pdft.addCell("-");
                    pdft.addCell("-");
                    pdft.addCell(result_18);
                }
                document.add(pdft);
                document.close();
                JOptionPane.showMessageDialog(null, "Pdf Created");
            } catch (DocumentException | HeadlessException | FileNotFoundException | ClassNotFoundException
                    | SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
