
package Demo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class DemoMouse extends javax.swing.JFrame {
    
    private int cont = 0;

    public DemoMouse() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.barProgress.setForeground(Color.GREEN);
        txtName.getDocument().addDocumentListener(new ProgressListener());
        txtSurnamePattern.getDocument().addDocumentListener(new ProgressListener());
        txtSurnameMother.getDocument().addDocumentListener(new ProgressListener());
    }

    private void updateProgressBar() {
        int completedFields = 0;
        
        if (!txtName.getText().trim().isEmpty()) completedFields++;
        if (!txtSurnamePattern.getText().trim().isEmpty()) completedFields++;
        if (!txtSurnameMother.getText().trim().isEmpty()) completedFields++;
        if (!lblAge.getText().trim().isEmpty()) completedFields++;

        int progress = (completedFields * 100) / 4;
        
        // Actualizar la barra de progreso
        barProgress.setValue(progress);

        if (progress == 100) {
            barProgress.setForeground(Color.GREEN);
        } else {
            barProgress.setForeground(Color.BLUE);
        }
    }

    private class ProgressListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateProgressBar();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateProgressBar();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateProgressBar();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnTamañoLetra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSurnamePattern = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSurnameMother = new javax.swing.JTextField();
        btnAge = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        btnSubstractAge = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        barProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Usuario");

        jLabel2.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre, nombres:");

        txtName.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNameMouseEntered(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnTamañoLetra.setBackground(new java.awt.Color(60, 16, 118));
        btnTamañoLetra.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnTamañoLetra.setForeground(new java.awt.Color(255, 255, 255));
        btnTamañoLetra.setText("Aumentar letra");
        btnTamañoLetra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTamañoLetra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamañoLetraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTamañoLetraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTamañoLetraMouseExited(evt);
            }
        });
        btnTamañoLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamañoLetraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Paterno:");

        txtSurnamePattern.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        txtSurnamePattern.setForeground(new java.awt.Color(255, 255, 255));
        txtSurnamePattern.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSurnamePattern.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSurnamePattern.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSurnamePatternMouseEntered(evt);
            }
        });
        txtSurnamePattern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnamePatternActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Materno:");

        txtSurnameMother.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        txtSurnameMother.setForeground(new java.awt.Color(255, 255, 255));
        txtSurnameMother.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSurnameMother.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSurnameMother.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSurnameMotherMouseEntered(evt);
            }
        });
        txtSurnameMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameMotherActionPerformed(evt);
            }
        });

        btnAge.setBackground(new java.awt.Color(60, 89, 186));
        btnAge.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnAge.setForeground(new java.awt.Color(255, 255, 255));
        btnAge.setText("Edad");
        btnAge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgeMouseExited(evt);
            }
        });

        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSubstractAge.setBackground(new java.awt.Color(60, 89, 186));
        btnSubstractAge.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnSubstractAge.setForeground(new java.awt.Color(255, 255, 255));
        btnSubstractAge.setText("Restar Edad");
        btnSubstractAge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubstractAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubstractAgeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubstractAgeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubstractAgeMouseExited(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnComplete.setText("Completar Registro");
        btnComplete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSubstractAge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(txtSurnamePattern)
                                        .addComponent(txtSurnameMother)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTamañoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(barProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTamañoLetra))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSurnamePattern, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(barProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurnameMother, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubstractAge))
                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseEntered
        this.txtName.setBackground(Color.BLUE);
    }//GEN-LAST:event_txtNameMouseEntered

    private void btnTamañoLetraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamañoLetraMouseClicked
        this.txtName.setFont(new Font("Arial", Font.PLAIN, 20));
        this.txtSurnamePattern.setFont(new Font("Arial", Font.PLAIN, 20));
        this.txtSurnameMother.setFont(new Font("Arial", Font.PLAIN, 20));
        this.lblAge.setFont(new Font("Arial", Font.PLAIN, 20));
    }//GEN-LAST:event_btnTamañoLetraMouseClicked

    private void btnTamañoLetraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamañoLetraMouseEntered
        this.btnTamañoLetra.setBackground(Color.RED);
    }//GEN-LAST:event_btnTamañoLetraMouseEntered

    private void btnTamañoLetraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamañoLetraMouseExited
        this.btnTamañoLetra.setBackground(new Color(128, 0, 128));
    }//GEN-LAST:event_btnTamañoLetraMouseExited

    private void txtSurnamePatternMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSurnamePatternMouseEntered
        this.txtSurnamePattern.setBackground(Color.BLUE);
    }//GEN-LAST:event_txtSurnamePatternMouseEntered

    private void txtSurnamePatternActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnamePatternActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnamePatternActionPerformed

    private void txtSurnameMotherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSurnameMotherMouseEntered
        this.txtSurnameMother.setBackground(Color.BLUE);
    }//GEN-LAST:event_txtSurnameMotherMouseEntered

    private void txtSurnameMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameMotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameMotherActionPerformed

    private void btnAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgeMouseClicked
        cont++;
        this.lblAge.setText("Edad: " + cont);
        updateProgressBar();
        this.lblAge.setForeground(Color.white);
        this.lblAge.setFont(new Font("Arial", Font.PLAIN, 12));
        if (cont == 0) {
            cont++;
        }
    }//GEN-LAST:event_btnAgeMouseClicked

    private void btnAgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgeMouseEntered
        this.btnAge.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnAgeMouseEntered

    private void btnAgeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgeMouseExited
        this.btnAge.setBackground(new Color(60,89,186));
    }//GEN-LAST:event_btnAgeMouseExited

    private void btnSubstractAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubstractAgeMouseClicked
        cont--;
        this.lblAge.setText("Restando edad: " + cont);
        if (cont <= 0) {
            this.lblAge.setText("Edad no válida");
            this.lblAge.setForeground(Color.red);
            this.lblAge.setFont(new Font("Arial", Font.PLAIN, 20));
        }
    }//GEN-LAST:event_btnSubstractAgeMouseClicked

    private void btnSubstractAgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubstractAgeMouseEntered
        this.btnSubstractAge.setBackground(Color.red);
    }//GEN-LAST:event_btnSubstractAgeMouseEntered

    private void btnSubstractAgeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubstractAgeMouseExited
        this.btnSubstractAge.setBackground(new Color(60, 89, 186));
    }//GEN-LAST:event_btnSubstractAgeMouseExited

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        javax.swing.JFrame welcomeFrame = new javax.swing.JFrame();
        welcomeFrame.setSize(500, 400); // Ajusta el tamaño según sea necesario
        welcomeFrame.setLocationRelativeTo(this); // Centra la ventana
        welcomeFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
        
        javax.swing.JPanel panel = new javax.swing.JPanel();
        welcomeFrame.add(panel);
        placeComponents(panel);
        welcomeFrame.setVisible(true);
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnTamañoLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamañoLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTamañoLetraActionPerformed

    private void placeComponents(javax.swing.JPanel panel) {
    panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS)); // Usar BoxLayout para disposición vertical

    javax.swing.JLabel welcomeLabel = new javax.swing.JLabel("¡Bienvenido!");
    panel.add(welcomeLabel);

    String name = txtName.getText();
    String surnamePattern = txtSurnamePattern.getText();
    String surnameMother = txtSurnameMother.getText();
    String age = lblAge.getText(); 

    String data = "Nombre: " + name + "\n"
                + "Apellido Paterno: " + surnamePattern + "\n"
                + "Apellido Materno: " + surnameMother + "\n"
                + age;
    javax.swing.JTextArea dataArea = new javax.swing.JTextArea(data);
    dataArea.setEditable(false); // Hacer el JTextArea no editable
    dataArea.setLineWrap(true);
    dataArea.setWrapStyleWord(true); // Ajustar palabras en lugar de cortar
    dataArea.setPreferredSize(new java.awt.Dimension(350, 100)); 

    javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(dataArea);
    scrollPane.setPreferredSize(new java.awt.Dimension(350, 100));
    panel.add(scrollPane); 
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
            java.util.logging.Logger.getLogger(DemoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barProgress;
    private javax.swing.JButton btnAge;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnSubstractAge;
    private javax.swing.JButton btnTamañoLetra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurnameMother;
    private javax.swing.JTextField txtSurnamePattern;
    // End of variables declaration//GEN-END:variables
}
