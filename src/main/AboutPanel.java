/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import AppPackage.AnimationClass;

/**
 *
 * @author muham
 */
public class AboutPanel extends javax.swing.JFrame {
    
    AnimationClass animasi = new AnimationClass();

    /**
     * Creates new form AboutPanel
     */
    public AboutPanel() {
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

        popupAzma = new javax.swing.JLabel();
        popupRizal = new javax.swing.JLabel();
        popupFandi = new javax.swing.JLabel();
        Azma = new javax.swing.JLabel();
        Rizal = new javax.swing.JLabel();
        Fandi = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        popupAzma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/azma3.png"))); // NOI18N
        popupAzma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popupAzmaMouseClicked(evt);
            }
        });
        getContentPane().add(popupAzma);
        popupAzma.setBounds(35, -250, 230, 250);

        popupRizal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/rizal3.png"))); // NOI18N
        popupRizal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popupRizalMouseClicked(evt);
            }
        });
        getContentPane().add(popupRizal);
        popupRizal.setBounds(290, -250, 230, 250);

        popupFandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/fandi3.png"))); // NOI18N
        popupFandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popupFandiMouseClicked(evt);
            }
        });
        getContentPane().add(popupFandi);
        popupFandi.setBounds(550, -250, 230, 250);

        Azma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/azma1.png"))); // NOI18N
        Azma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AzmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AzmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AzmaMouseExited(evt);
            }
        });
        getContentPane().add(Azma);
        Azma.setBounds(80, 70, 136, 194);

        Rizal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/rizal1.png"))); // NOI18N
        Rizal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RizalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RizalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RizalMouseExited(evt);
            }
        });
        getContentPane().add(Rizal);
        Rizal.setBounds(330, 70, 130, 194);

        Fandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/fandi1.png"))); // NOI18N
        Fandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FandiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FandiMouseExited(evt);
            }
        });
        getContentPane().add(Fandi);
        Fandi.setBounds(600, 70, 120, 194);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/AboutPanel.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AzmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzmaMouseEntered
        Azma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/azma2.png")));
    }//GEN-LAST:event_AzmaMouseEntered

    private void AzmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzmaMouseExited
        Azma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/azma1.png")));
    }//GEN-LAST:event_AzmaMouseExited

    private void RizalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RizalMouseEntered
        Rizal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/rizal2.png")));
    }//GEN-LAST:event_RizalMouseEntered

    private void RizalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RizalMouseExited
        Rizal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/rizal1.png")));
    }//GEN-LAST:event_RizalMouseExited

    private void FandiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FandiMouseEntered
        Fandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/fandi2.png")));
    }//GEN-LAST:event_FandiMouseEntered

    private void FandiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FandiMouseExited
        Fandi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/picture/fandi1.png")));
    }//GEN-LAST:event_FandiMouseExited

    private void AzmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzmaMouseClicked
       animasi.jLabelYDown(-250, 60, 15, 10,popupAzma);
       
       
    }//GEN-LAST:event_AzmaMouseClicked

    private void RizalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RizalMouseClicked
        animasi.jLabelYDown(-250, 60, 15, 10, popupRizal);
    }//GEN-LAST:event_RizalMouseClicked

    private void popupRizalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popupRizalMouseClicked
        animasi.jLabelYUp(60, -250, 15, 10, popupRizal);
    }//GEN-LAST:event_popupRizalMouseClicked

    private void FandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FandiMouseClicked
      animasi.jLabelYDown(-250, 60, 15, 10, popupFandi);
    }//GEN-LAST:event_FandiMouseClicked

    private void popupFandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popupFandiMouseClicked
      animasi.jLabelYUp(60, -250, 15, 10, popupFandi);
    }//GEN-LAST:event_popupFandiMouseClicked

    private void popupAzmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popupAzmaMouseClicked
      animasi.jLabelYUp(60, -250, 15, 10, popupAzma);
    }//GEN-LAST:event_popupAzmaMouseClicked

    public static void summonAboutPanel() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setSize(800, 625);
        aboutPanel.setLocationRelativeTo(null);
        aboutPanel.setVisible(true);

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
            java.util.logging.Logger.getLogger(AboutPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                summonAboutPanel();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Azma;
    private javax.swing.JLabel Fandi;
    private javax.swing.JLabel Rizal;
    private javax.swing.JLabel background;
    private javax.swing.JLabel popupAzma;
    private javax.swing.JLabel popupFandi;
    private javax.swing.JLabel popupRizal;
    // End of variables declaration//GEN-END:variables
}
