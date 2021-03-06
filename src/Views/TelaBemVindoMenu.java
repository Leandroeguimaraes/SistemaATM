package Views;

import Control.Controller;
import javax.swing.JOptionPane;




public class TelaBemVindoMenu extends javax.swing.JFrame {


    Controller control;

    public TelaBemVindoMenu() {

        initComponents();

    }


    public TelaBemVindoMenu(Controller conta) {
        initComponents();
        this.control = conta;
        labelNomeUsuario.setText(this.control.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        labelNomeUsuario = new javax.swing.JLabel();
        labelBemVindo = new javax.swing.JLabel();
        btnFim = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnTransferencias = new javax.swing.JButton();
        btnPagamentos = new javax.swing.JButton();
        btnSaques = new javax.swing.JButton();
        btnSaldoExtrato = new javax.swing.JButton();
        btnPoupanca = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        painelPrincipal.setLayout(null);

        labelNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelNomeUsuario.setForeground(new java.awt.Color(0, 102, 153));
        labelNomeUsuario.setText("Nome do Usuário");
        painelPrincipal.add(labelNomeUsuario);
        labelNomeUsuario.setBounds(320, 100, 350, 30);

        labelBemVindo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelBemVindo.setForeground(new java.awt.Color(0, 51, 102));
        labelBemVindo.setText("Bem Vindo, ");
        painelPrincipal.add(labelBemVindo);
        labelBemVindo.setBounds(320, 50, 220, 50);

        btnFim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnFim.setForeground(new java.awt.Color(102, 0, 51));
        btnFim.setText("Fim");
        btnFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFimActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnFim);
        btnFim.setBounds(300, 500, 200, 50);

        btnDeposito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(0, 51, 102));
        btnDeposito.setText("Depósitos");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDeposito);
        btnDeposito.setBounds(450, 250, 300, 50);

        btnTransferencias.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTransferencias.setForeground(new java.awt.Color(0, 51, 102));
        btnTransferencias.setText("Transferências");
        btnTransferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciasActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnTransferencias);
        btnTransferencias.setBounds(50, 320, 300, 50);

        btnPagamentos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPagamentos.setForeground(new java.awt.Color(0, 51, 102));
        btnPagamentos.setText("Pagamentos");
        btnPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentosActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnPagamentos);
        btnPagamentos.setBounds(50, 250, 300, 50);

        btnSaques.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSaques.setForeground(new java.awt.Color(0, 51, 102));
        btnSaques.setText("Saques");
        btnSaques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaquesActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSaques);
        btnSaques.setBounds(450, 175, 300, 50);

        btnSaldoExtrato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSaldoExtrato.setForeground(new java.awt.Color(0, 51, 102));
        btnSaldoExtrato.setText("Saldo e Extratos");
        btnSaldoExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoExtratoActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSaldoExtrato);
        btnSaldoExtrato.setBounds(50, 175, 300, 50);

        btnPoupanca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPoupanca.setForeground(new java.awt.Color(0, 51, 102));
        btnPoupanca.setText("Poupança");
        btnPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoupancaActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnPoupanca);
        btnPoupanca.setBounds(450, 320, 300, 50);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        painelPrincipal.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFimActionPerformed
        int a = JOptionPane.showConfirmDialog(painelPrincipal, "Deseja finalizar a sessão?");
        if (a == 0) {
            this.setVisible(false);
            this.dispose();
            new TelaInicial().setVisible(true);
        }
    }//GEN-LAST:event_btnFimActionPerformed

    private void btnSaldoExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoExtratoActionPerformed
        this.setVisible(false);
        new TelaSaldoExtrato(control).setVisible(true);

    }//GEN-LAST:event_btnSaldoExtratoActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        this.setVisible(false);
        new TelaDeposito(control).setVisible(true);
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnSaquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaquesActionPerformed
        this.setVisible(false);
        new TelaSaque(control).setVisible(true);
    }//GEN-LAST:event_btnSaquesActionPerformed

    private void btnPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentosActionPerformed
        this.setVisible(false);
        new TelaPagamento(control).setVisible(true);
    }//GEN-LAST:event_btnPagamentosActionPerformed

    private void btnTransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciasActionPerformed
        this.setVisible(false);
        new TelaTransferencia(control).setVisible(true);
    }//GEN-LAST:event_btnTransferenciasActionPerformed

    private void btnPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoupancaActionPerformed
        this.setVisible(false);
        new TelaPoupanca(control).setVisible(true);
    }//GEN-LAST:event_btnPoupancaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBemVindoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBemVindoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBemVindoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBemVindoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBemVindoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnFim;
    private javax.swing.JButton btnPagamentos;
    private javax.swing.JButton btnPoupanca;
    private javax.swing.JButton btnSaldoExtrato;
    private javax.swing.JButton btnSaques;
    private javax.swing.JButton btnTransferencias;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
