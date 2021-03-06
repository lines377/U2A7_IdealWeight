/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package U2A7_IdealWeightPackage;

import java.text.DecimalFormat;

/**
 *
 * @author xagod6351
 */
public class U2A7_IdealWeightFrame extends javax.swing.JFrame {

    /**
     * Creates new form U2A7_IdealWeightFrame
     */
    public U2A7_IdealWeightFrame() {
        initComponents();
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
        progressBar = new javax.swing.JProgressBar();
        titleLable = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        mesermentInput = new javax.swing.JTextField();
        hightInput = new javax.swing.JTextField();
        mesermentLable = new javax.swing.JLabel();
        hightLable = new javax.swing.JLabel();
        mOrI = new javax.swing.JLabel();
        outputLable = new javax.swing.JLabel();
        enterButtion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        progressBar.setForeground(new java.awt.Color(0, 255, 0));

        titleLable.setBackground(new java.awt.Color(255, 255, 0));
        titleLable.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        titleLable.setText("Ideal Body Mass Calculator");
        titleLable.setOpaque(true);

        nameLable.setText("Enter Your Name Here:");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        mesermentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesermentInputActionPerformed(evt);
            }
        });

        hightInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hightInputActionPerformed(evt);
            }
        });

        mesermentLable.setText("Imperial or metric meserments");

        hightLable.setText("Your Height");

        mOrI.setText("(M or I)");

        outputLable.setBackground(new java.awt.Color(204, 255, 255));
        outputLable.setFont(new java.awt.Font("Txt", 0, 24)); // NOI18N
        outputLable.setOpaque(true);

        enterButtion.setText("Enter");
        enterButtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(outputLable, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mesermentLable)
                                .addComponent(mOrI)
                                .addComponent(hightLable)
                                .addComponent(nameLable))
                            .addGap(72, 72, 72)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mesermentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterButtion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLable)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesermentLable)
                    .addComponent(mesermentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mOrI)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hightLable)
                    .addComponent(hightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterButtion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outputLable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hightInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hightInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hightInputActionPerformed

    private void mesermentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesermentInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesermentInputActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void enterButtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtionActionPerformed
    double height, weight;
    String meserments,name;
    DecimalFormat x = new DecimalFormat("### Kgs");
    DecimalFormat i = new DecimalFormat("### lbs");
    height= Double.parseDouble(hightInput.getText());
    name=nameInput.getText();
    meserments= mesermentInput.getText();
        switch (meserments) {
            case "I":
                 weight=height*height*25/703;
                 outputLable.setText(name+ "'s ideal Weight is " + x.format(weight));
            case "i":
                 weight=height*height*25/703;
                 outputLable.setText(name+ "'s ideal Weight is " + x.format(weight));
            case "M":
                 weight=height*height*25;
                 outputLable.setText(name+ "'s ideal Weight is " + x.format(weight));
                
            case "m":
                 weight=height*height*25;
                 outputLable.setText(name+ "'s ideal Weight is " + x.format(weight));
    }
    }//GEN-LAST:event_enterButtionActionPerformed

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
            java.util.logging.Logger.getLogger(U2A7_IdealWeightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U2A7_IdealWeightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U2A7_IdealWeightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U2A7_IdealWeightFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U2A7_IdealWeightFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButtion;
    private javax.swing.JTextField hightInput;
    private javax.swing.JLabel hightLable;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mOrI;
    private javax.swing.JTextField mesermentInput;
    private javax.swing.JLabel mesermentLable;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLable;
    private javax.swing.JLabel outputLable;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel titleLable;
    // End of variables declaration//GEN-END:variables
}
