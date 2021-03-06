package Views;

import Control.Controller;
import javax.swing.JOptionPane;

public class TelaSaqueOutros extends javax.swing.JFrame {

    private Controller control;

    public TelaSaqueOutros() {
        initComponents();
    }

    TelaSaqueOutros(Controller control) {
        this.control = control;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        labelValorSaque = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        labelOutroValor = new javax.swing.JLabel();
        campoValor = new Views.JNumberFormatField();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(102, 0, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar);
        btnVoltar.setBounds(550, 500, 200, 50);

        labelValorSaque.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValorSaque.setForeground(new java.awt.Color(0, 51, 102));
        labelValorSaque.setText("Valor do Saque:");
        jPanel2.add(labelValorSaque);
        labelValorSaque.setBounds(50, 200, 210, 30);

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(0, 51, 102));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar);
        btnConfirmar.setBounds(300, 500, 200, 50);

        labelOutroValor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelOutroValor.setForeground(new java.awt.Color(0, 51, 102));
        labelOutroValor.setText("Outro Valor");
        jPanel2.add(labelOutroValor);
        labelOutroValor.setBounds(320, 50, 200, 50);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoValor);
        campoValor.setBounds(230, 200, 200, 35);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        jPanel2.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        new TelaSaque(control).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (this.campoValor.getValue().doubleValue() > 0) {
            TelaConfirmacao tela = new TelaConfirmacao(this, true, control);
            tela.setVisible(true);
            if (tela.confirma()) {
                if (control.efetuaSaque(this.campoValor.getValue().doubleValue())) {
                    JOptionPane.showMessageDialog(this, "Saque realizado com sucesso");
                    this.setVisible(false);
                    new TelaBemVindoMenu(control).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Saldo insuficiente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Operação cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Impossivel realizar um saque no valor de R$0.");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSaqueOutros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaqueOutros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaqueOutros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaqueOutros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaqueOutros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private Views.JNumberFormatField campoValor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelOutroValor;
    private javax.swing.JLabel labelValorSaque;
    // End of variables declaration//GEN-END:variables
}
