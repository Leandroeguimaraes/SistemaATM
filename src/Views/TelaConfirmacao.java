/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import controller.Controller;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucas Thimoteo
 */
public class TelaConfirmacao extends javax.swing.JDialog {
    
    HashMap senhas = new HashMap();
    int[][] matriz = new int[6][2];
    int cont = 0;
    private boolean confirma;
    private Controller control;
    /**
     * Creates new form TelaConfirmacao
     * @param parent
     * @param modal
     * @param usuario
     */
    public TelaConfirmacao(java.awt.Frame parent, boolean modal,Controller control) {
        super(parent, modal);
        this.control = control;
        initComponents();
    }

    private TelaConfirmacao(JFrame jFrame, boolean b) {
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

        panelConfirmacao = new javax.swing.JPanel();
        btn09 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btnConfirmaSenha = new javax.swing.JButton();
        btnApagaSenha = new javax.swing.JButton();
        btnCancelarSenha = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        panelConfirmacao.setLayout(null);

        btn09.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn09.setForeground(new java.awt.Color(0, 51, 102));
        btn09.setText("0 ou 9");
        btn09.setFocusable(false);
        btn09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn09ActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btn09);
        btn09.setBounds(50, 160, 100, 100);

        btn15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn15.setForeground(new java.awt.Color(0, 51, 102));
        btn15.setText("1 ou 5");
        btn15.setFocusable(false);
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btn15);
        btn15.setBounds(350, 160, 100, 100);

        btn28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn28.setForeground(new java.awt.Color(0, 51, 102));
        btn28.setText("2 ou 8");
        btn28.setFocusable(false);
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btn28);
        btn28.setBounds(500, 160, 100, 100);

        btn37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn37.setForeground(new java.awt.Color(0, 51, 102));
        btn37.setText("3 ou 7");
        btn37.setFocusable(false);
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btn37);
        btn37.setBounds(200, 160, 100, 100);

        btn46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn46.setForeground(new java.awt.Color(0, 51, 102));
        btn46.setText("4 ou 6");
        btn46.setFocusable(false);
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btn46);
        btn46.setBounds(650, 160, 100, 100);

        btnConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConfirmaSenha.setForeground(new java.awt.Color(0, 51, 102));
        btnConfirmaSenha.setText("Confirmar");
        btnConfirmaSenha.setFocusable(false);
        btnConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaSenhaActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btnConfirmaSenha);
        btnConfirmaSenha.setBounds(50, 500, 200, 50);

        btnApagaSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnApagaSenha.setForeground(new java.awt.Color(204, 153, 0));
        btnApagaSenha.setText("Apagar");
        btnApagaSenha.setFocusable(false);
        btnApagaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaSenhaActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btnApagaSenha);
        btnApagaSenha.setBounds(300, 500, 200, 50);

        btnCancelarSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancelarSenha.setForeground(new java.awt.Color(102, 0, 51));
        btnCancelarSenha.setText("Cancelar");
        btnCancelarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSenhaActionPerformed(evt);
            }
        });
        panelConfirmacao.add(btnCancelarSenha);
        btnCancelarSenha.setBounds(550, 500, 200, 50);

        campoSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelConfirmacao.add(campoSenha);
        campoSenha.setBounds(250, 350, 300, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        panelConfirmacao.add(fundo);
        fundo.setBounds(0, 0, 800, 600);

        getContentPane().add(panelConfirmacao);
        panelConfirmacao.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn09ActionPerformed
        aperta(0,9);
    }//GEN-LAST:event_btn09ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        aperta(1,5);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        aperta(2,8);
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        aperta(3,7);
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        aperta(4,6);
    }//GEN-LAST:event_btn46ActionPerformed

    private void btnConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaSenhaActionPerformed
        if (cont<6){
            JOptionPane.showMessageDialog(this,"Senha incorreta.");
        }else{
            geraSenhas();
            if (senhas.containsValue(this.control.getSenha())){
                confirma = true;
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"Senha incorreta.");
            }
        }
    }//GEN-LAST:event_btnConfirmaSenhaActionPerformed

    private void btnApagaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaSenhaActionPerformed
        if (cont>0){
            matriz[cont-1][0] = 0;
            matriz[cont-1][1] = 0;
            cont --;
            this.campoSenha.setText(this.campoSenha.getText().substring(0, this.campoSenha.getText().length()-1));
        }
    }//GEN-LAST:event_btnApagaSenhaActionPerformed

    private void btnCancelarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSenhaActionPerformed
        confirma = false;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarSenhaActionPerformed
    
    private void aperta(int num1, int num2){
        if (cont<6){
            campoSenha.setText(campoSenha.getText()+"*");
            matriz[cont][0] = num1;
            matriz[cont][1] = num2;
            cont ++;
        }
    }
    
    private void geraSenhas(){
        int key=0;
        for (int a = 0; a <2; a++) {
            for (int b = 0; b < 2; b++) {
                for (int c = 0; c < 2; c++) {
                    for (int d = 0; d < 2; d++) {
                        for (int e = 0; e < 2; e++) {
                            for (int f = 0; f < 2; f++) {
                                senhas.put(String.valueOf(key), String.valueOf(matriz[0][a])+
                                                                        String.valueOf(matriz[1][b])+
                                                                        String.valueOf(matriz[2][c])+
                                                                        String.valueOf(matriz[3][d])+
                                                                        String.valueOf(matriz[4][e])+
                                                                        String.valueOf(matriz[5][f]));
                                key++;
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
    }
    
    public boolean confirma() {
        return confirma;
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
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaConfirmacao dialog = new TelaConfirmacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn09;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btnApagaSenha;
    private javax.swing.JButton btnCancelarSenha;
    private javax.swing.JButton btnConfirmaSenha;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel fundo;
    private javax.swing.JPanel panelConfirmacao;
    // End of variables declaration//GEN-END:variables
}
