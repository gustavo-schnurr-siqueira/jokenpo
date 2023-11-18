/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import javax.swing.ImageIcon;

/**
 *
 * @author 311100469
 */
public class Main_window extends javax.swing.JFrame {

    public Main_window() {
        initComponents();
    }

        ImageIcon rockIcon = new ImageIcon("C:\\Users\\311100469\\Documents\\NetBeansProjects\\Jokenpo\\src\\jokenpo\\Icones\\rock_icon.png");
        ImageIcon scisorsIcon = new ImageIcon("C:\\Users\\311100469\\Documents\\NetBeansProjects\\Jokenpo\\src\\jokenpo\\Icones\\scisors_icon.png");
        ImageIcon paperIcon = new ImageIcon("C:\\Users\\311100469\\Documents\\NetBeansProjects\\Jokenpo\\src\\jokenpo\\Icones\\paper_icon.png");
        
        ImageIcon MrockIcon = new ImageIcon("C:\\Users\\311100469\\Documents\\NetBeansProjects\\Jokenpo\\src\\jokenpo\\Icones\\machine_rock.png");
        ImageIcon MscisorsIcon = new ImageIcon("C:\\Users\\311100469\\Documents\\NetBeansProjects\\Jokenpo\\src\\jokenpo\\Icones\\machine_scisors.png");
        ImageIcon MpaperIcon = new ImageIcon("C:\\Users\\311100469\\Documents\\NetBeansProjects\\Jokenpo\\src\\jokenpo\\Icones\\machine_paper.png");
        
        int player = 0;
        int machine = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        machineHandLabel = new javax.swing.JLabel();
        playerHandLabel = new javax.swing.JLabel();
        rockBut = new javax.swing.JButton();
        paperBut = new javax.swing.JButton();
        scisorsBut = new javax.swing.JButton();
        goBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("AardvarkBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("JO-KEN-PO!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        machineHandLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jokenpo/Icones/machine_hand_icon.png"))); // NOI18N

        playerHandLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jokenpo/Icones/player_hand_icon.png"))); // NOI18N

        rockBut.setFont(new java.awt.Font("AardvarkBold", 0, 24)); // NOI18N
        rockBut.setForeground(new java.awt.Color(51, 51, 51));
        rockBut.setText("ROCK");
        rockBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButActionPerformed(evt);
            }
        });

        paperBut.setFont(new java.awt.Font("AardvarkBold", 0, 24)); // NOI18N
        paperBut.setForeground(new java.awt.Color(51, 51, 51));
        paperBut.setText("PAPER");
        paperBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButActionPerformed(evt);
            }
        });

        scisorsBut.setFont(new java.awt.Font("AardvarkBold", 0, 24)); // NOI18N
        scisorsBut.setForeground(new java.awt.Color(51, 51, 51));
        scisorsBut.setText("SCISORS");
        scisorsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scisorsButActionPerformed(evt);
            }
        });

        goBut.setFont(new java.awt.Font("AardvarkBold", 0, 48)); // NOI18N
        goBut.setForeground(new java.awt.Color(51, 51, 51));
        goBut.setText("GO!");
        goBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(playerHandLabel)
                .addGap(18, 191, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scisorsBut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(machineHandLabel))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rockBut, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paperBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(218, 218, 218))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goBut, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(playerHandLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(machineHandLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rockBut)
                    .addComponent(paperBut)
                    .addComponent(scisorsBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(goBut)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scisorsButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scisorsButActionPerformed
        playerHandLabel.setIcon(scisorsIcon);
        player=3;
    }//GEN-LAST:event_scisorsButActionPerformed

    private void paperButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButActionPerformed
        playerHandLabel.setIcon(paperIcon);
        player=2;
    }//GEN-LAST:event_paperButActionPerformed

    private void rockButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButActionPerformed
        playerHandLabel.setIcon(rockIcon);
        player=1;
    }//GEN-LAST:event_rockButActionPerformed

    private void goButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButActionPerformed
        
        int machine = (int) (java.lang.Math.random() * 3 + 1);
        System.out.println(machine);
        
        if (machine==1){
            machineHandLabel.setIcon(MrockIcon);
        }else if(machine==2){
            machineHandLabel.setIcon(MpaperIcon);
        }else{
            machineHandLabel.setIcon(MscisorsIcon);
        }
        
        if(machine==1 && pl)
        
    }//GEN-LAST:event_goButActionPerformed

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
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel machineHandLabel;
    private javax.swing.JButton paperBut;
    private javax.swing.JLabel playerHandLabel;
    private javax.swing.JButton rockBut;
    private javax.swing.JButton scisorsBut;
    // End of variables declaration//GEN-END:variables
}
