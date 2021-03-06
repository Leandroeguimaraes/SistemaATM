/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Thimoteo
 */
public class TelaTED extends javax.swing.JFrame {

    /**
     * Creates new form TelaTED
     */
    private Controller control;

    public TelaTED() {
        initComponents();
    }

    TelaTED(Controller control) {
        this.control = control;
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

        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        labelCPF = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        labelAgencia = new javax.swing.JLabel();
        labelConta = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelBanco = new javax.swing.JLabel();
        labelTED = new javax.swing.JLabel();
        campoValor = new Views.JNumberFormatField();
        campoCPF = new javax.swing.JTextField();
        campoAgencia = new javax.swing.JTextField();
        campoConta = new javax.swing.JTextField();
        campoBanco = new javax.swing.JTextField();
        labelFundo = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        labelCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(0, 51, 102));
        labelCPF.setText("CPF:");
        jPanel2.add(labelCPF);
        labelCPF.setBounds(50, 200, 180, 30);

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

        labelAgencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAgencia.setForeground(new java.awt.Color(0, 51, 102));
        labelAgencia.setText("Agência:");
        jPanel2.add(labelAgencia);
        labelAgencia.setBounds(50, 300, 180, 30);

        labelConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelConta.setForeground(new java.awt.Color(0, 51, 102));
        labelConta.setText("Conta Corrente:");
        jPanel2.add(labelConta);
        labelConta.setBounds(50, 350, 180, 30);

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(0, 51, 102));
        labelValor.setText("Valor:");
        jPanel2.add(labelValor);
        labelValor.setBounds(50, 400, 180, 30);

        labelBanco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelBanco.setForeground(new java.awt.Color(0, 51, 102));
        labelBanco.setText("Banco:");
        jPanel2.add(labelBanco);
        labelBanco.setBounds(50, 250, 180, 30);

        labelTED.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTED.setForeground(new java.awt.Color(0, 51, 102));
        labelTED.setText("TED");
        jPanel2.add(labelTED);
        labelTED.setBounds(320, 50, 200, 50);

        campoValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(campoValor);
        campoValor.setBounds(230, 400, 200, 35);

        campoCPF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCPFKeyTyped(evt);
            }
        });
        jPanel2.add(campoCPF);
        campoCPF.setBounds(230, 200, 200, 35);

        campoAgencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoAgenciaKeyTyped(evt);
            }
        });
        jPanel2.add(campoAgencia);
        campoAgencia.setBounds(230, 300, 200, 35);

        campoConta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoContaKeyTyped(evt);
            }
        });
        jPanel2.add(campoConta);
        campoConta.setBounds(230, 350, 200, 35);

        campoBanco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        campoBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBancoKeyTyped(evt);
            }
        });
        jPanel2.add(campoBanco);
        campoBanco.setBounds(230, 250, 200, 35);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        jPanel2.add(labelFundo);
        labelFundo.setBounds(0, 0, 800, 600);

        jFormattedTextField1.setText("jFormattedTextField1");
        jPanel2.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(470, 290, 109, 20);

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
        new TelaTransferencia(control).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        double valor = this.campoValor.getValue().doubleValue();
        int status = control.existeContaECpf(this.campoBanco.getText(), this.campoAgencia.getText(), this.campoConta.getText(), this.campoCPF.getText());
        if (!this.campoBanco.getText().equals("005")) {
            if (status == 2) {
                JOptionPane.showMessageDialog(this, "Conta inexistente.");
            }
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "CPF nao corresponde.");
            }
            if (status == 0) {

                TelaConfirmacao tela = new TelaConfirmacao(this, true, control);
                tela.setVisible(true);
                if (tela.confirma()) {
                    if (this.control.efetuaTransferencia(valor)) {
                        JOptionPane.showMessageDialog(this, "Transferencia realizada com sucesso.");
                        this.setVisible(false);
                        new TelaBemVindoMenu(this.control).setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Saldo insuficiente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nao é possivel realizar transferencia TED para uma conta ATM5.");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void campoCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCPFKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoCPF.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_campoCPFKeyTyped

    private void campoAgenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAgenciaKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoAgencia.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_campoAgenciaKeyTyped

    private void campoContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoContaKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoConta.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_campoContaKeyTyped

    private void campoBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBancoKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch) || this.campoBanco.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_campoBancoKeyTyped

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
            java.util.logging.Logger.getLogger(TelaTED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoAgencia;
    private javax.swing.JTextField campoBanco;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoConta;
    private Views.JNumberFormatField campoValor;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAgencia;
    private javax.swing.JLabel labelBanco;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelConta;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelTED;
    private javax.swing.JLabel labelValor;
    // End of variables declaration//GEN-END:variables
}
