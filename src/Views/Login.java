/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Lucas Thimoteo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        caixaSenha = new javax.swing.JTextField();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");
        setBackground(new java.awt.Color(204, 255, 51));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);
        getContentPane().add(caixaSenha);
        caixaSenha.setBounds(80, 270, 170, 20);

        botao1.setText("1");
        botao1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao1.setPreferredSize(new java.awt.Dimension(40, 30));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1);
        botao1.setBounds(80, 70, 50, 40);

        botao2.setText("2");
        botao2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao2.setPreferredSize(new java.awt.Dimension(40, 30));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botao2);
        botao2.setBounds(140, 70, 50, 40);

        botao3.setText("3");
        botao3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao3.setPreferredSize(new java.awt.Dimension(40, 30));
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        getContentPane().add(botao3);
        botao3.setBounds(200, 70, 50, 40);

        botao4.setText("4");
        botao4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao4.setPreferredSize(new java.awt.Dimension(40, 30));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        getContentPane().add(botao4);
        botao4.setBounds(80, 120, 50, 40);

        botao5.setText("5");
        botao5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao5.setPreferredSize(new java.awt.Dimension(40, 30));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        getContentPane().add(botao5);
        botao5.setBounds(140, 120, 50, 40);

        botao6.setText("6");
        botao6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao6.setPreferredSize(new java.awt.Dimension(40, 30));
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        getContentPane().add(botao6);
        botao6.setBounds(200, 120, 50, 40);

        botao7.setText("7");
        botao7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao7.setPreferredSize(new java.awt.Dimension(40, 30));
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        getContentPane().add(botao7);
        botao7.setBounds(80, 170, 50, 40);

        botao8.setText("8");
        botao8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao8.setPreferredSize(new java.awt.Dimension(40, 30));
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        getContentPane().add(botao8);
        botao8.setBounds(140, 170, 50, 40);

        botao9.setText("9");
        botao9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao9.setPreferredSize(new java.awt.Dimension(40, 30));
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        getContentPane().add(botao9);
        botao9.setBounds(200, 170, 50, 40);

        botao0.setText("0");
        botao0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });
        getContentPane().add(botao0);
        botao0.setBounds(140, 220, 50, 40);

        botaoEntrar.setText("ENTRAR");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar);
        botaoEntrar.setBounds(120, 340, 90, 40);

        botaoVoltar.setText("FIM");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar);
        botaoVoltar.setBounds(480, 340, 90, 40);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Insira sua senha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 190, 40);

        jLabel2.setText("*a senha é 123456*");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 110, 120, 14);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"1");
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"2");        // TODO add your handling code here:
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"3");        // TODO add your handling code here:
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"4");        // TODO add your handling code here:
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"5");        // TODO add your handling code here:
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"6");        // TODO add your handling code here:
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"7");        // TODO add your handling code here:
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"8");        // TODO add your handling code here:
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"9");        // TODO add your handling code here:
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        caixaSenha.setText(caixaSenha.getText()+"0");        // TODO add your handling code here:
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
    if (caixaSenha.getText().equals("123456")){
        Menu tela = new Menu();
        this.setVisible(false);
        tela.setVisible(true);
}
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        BoasVindas tela = new BoasVindas();
        this.setVisible(false);
        tela.setVisible(true); 
        
    }//GEN-LAST:event_botaoVoltarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField caixaSenha;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
