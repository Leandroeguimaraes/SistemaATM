/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zViews;

/**
 *
 * @author Lucas Thimoteo
 */
public class BoasVindas extends javax.swing.JFrame {

    /**
     * Creates new form BoasVindas
     */
    public BoasVindas() {
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

        jButton1 = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");
        setBackground(new java.awt.Color(204, 0, 204));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("*insere*");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 320, 73, 23);

        botaoSair.setText("SAIR");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(473, 323, 90, 40);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDOBOASVINDAS.png"))); // NOI18N
        fundo.setText("jLabel2");
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login tela = new Login();
        this.setVisible(false);
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}