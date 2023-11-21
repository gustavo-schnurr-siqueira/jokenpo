/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        
        int player = 5;
        int machine = 0;
        int result = 9;
    
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
        narratorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("AardvarkBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JO-KEN-PO!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 23, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 631, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        machineHandLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jokenpo/Icones/machine_hand_icon.png"))); // NOI18N
        jPanel3.add(machineHandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 82, -1, -1));

        playerHandLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jokenpo/Icones/player_hand_icon.png"))); // NOI18N
        jPanel3.add(playerHandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 82, -1, -1));

        rockBut.setFont(new java.awt.Font("AardvarkBold", 0, 24)); // NOI18N
        rockBut.setForeground(new java.awt.Color(51, 51, 51));
        rockBut.setText("ROCK");
        rockBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButActionPerformed(evt);
            }
        });
        jPanel3.add(rockBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 264, 203, -1));

        paperBut.setFont(new java.awt.Font("AardvarkBold", 0, 24)); // NOI18N
        paperBut.setForeground(new java.awt.Color(51, 51, 51));
        paperBut.setText("PAPER");
        paperBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButActionPerformed(evt);
            }
        });
        jPanel3.add(paperBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 264, 188, -1));

        scisorsBut.setFont(new java.awt.Font("AardvarkBold", 0, 24)); // NOI18N
        scisorsBut.setForeground(new java.awt.Color(51, 51, 51));
        scisorsBut.setText("SCISORS");
        scisorsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scisorsButActionPerformed(evt);
            }
        });
        jPanel3.add(scisorsBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 264, 200, -1));

        goBut.setFont(new java.awt.Font("AardvarkBold", 0, 48)); // NOI18N
        goBut.setForeground(new java.awt.Color(51, 51, 51));
        goBut.setText("GO!");
        goBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButActionPerformed(evt);
            }
        });
        jPanel3.add(goBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 340, 254, -1));

        narratorLabel.setFont(new java.awt.Font("Accidental Presidency", 0, 18)); // NOI18N
        narratorLabel.setForeground(new java.awt.Color(255, 255, 255));
        narratorLabel.setText("Let's play!");
        jPanel3.add(narratorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 48, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, 631, 439));

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
        player=2;
    }//GEN-LAST:event_scisorsButActionPerformed

    private void paperButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButActionPerformed
        playerHandLabel.setIcon(paperIcon);
        player=1;
    }//GEN-LAST:event_paperButActionPerformed

    private void rockButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButActionPerformed
        playerHandLabel.setIcon(rockIcon);
        player=0;
    }//GEN-LAST:event_rockButActionPerformed

    private void goButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButActionPerformed
    if (player!=5){
        int machine = (int) (java.lang.Math.random() * 3 );
        System.out.println(machine);
        
        if (machine==0){
            machineHandLabel.setIcon(MrockIcon);
        }else if(machine==1){
            machineHandLabel.setIcon(MpaperIcon);
        }else{
            machineHandLabel.setIcon(MscisorsIcon);
        }
        
       //primeiro comentário
        
        if (player == machine){
            narratorLabel.setText("It's a draw!");
        }else if((player == 0 && machine == 2) || (player == 1 && machine == 0) || (player == 2 && machine == 1)){
            narratorLabel.setText("You win!");
        }else{
            narratorLabel.setText("You lose.");
        }
        
    }else{
        JOptionPane.showMessageDialog(null,"Select one of the options!");
    }
        
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
    private javax.swing.JLabel narratorLabel;
    private javax.swing.JButton paperBut;
    private javax.swing.JLabel playerHandLabel;
    private javax.swing.JButton rockBut;
    private javax.swing.JButton scisorsBut;
    // End of variables declaration//GEN-END:variables
}
