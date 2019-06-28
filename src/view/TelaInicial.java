/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Perguntas;
import model.Questao;


/**
 *
 * @author Aluno
 */
public final class TelaInicial extends javax.swing.JFrame {

    Perguntas perg;
    private Questao quest;
    private int acertos = 0;
    private int res = 0;
    private int ajuda = 0;
    
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        configuraRadioButtons();
        perg = new Perguntas();
        perg.PreencherArray();
        transparenciaBotao();
        
        //quest = new Questao();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        bgAlternativas = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        Btsair = new javax.swing.JButton();
        Btsala1 = new javax.swing.JButton();
        Btsala2 = new javax.swing.JButton();
        Btsala3 = new javax.swing.JButton();
        Btproxima = new javax.swing.JButton();
        Bttrue = new javax.swing.JRadioButton();
        Btfalse = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tela = new javax.swing.JTextArea();
        resu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Botão Sair.png"))); // NOI18N
        Btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtsairActionPerformed(evt);
            }
        });
        jPanel1.add(Btsair);
        Btsair.setBounds(280, 440, 150, 70);

        Btsala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Botão reciclagem.png"))); // NOI18N
        Btsala1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btsala1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btsala1);
        Btsala1.setBounds(120, 260, 160, 60);

        Btsala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/sustentabilidade.png"))); // NOI18N
        Btsala2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btsala2ActionPerformed(evt);
            }
        });
        jPanel1.add(Btsala2);
        Btsala2.setBounds(300, 260, 150, 60);

        Btsala3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Recursos Naturais.png"))); // NOI18N
        Btsala3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btsala3ActionPerformed(evt);
            }
        });
        jPanel1.add(Btsala3);
        Btsala3.setBounds(480, 260, 150, 60);

        Btproxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Botão Proximo.png"))); // NOI18N
        Btproxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtproximaActionPerformed(evt);
            }
        });
        jPanel1.add(Btproxima);
        Btproxima.setBounds(480, 440, 160, 70);

        Bttrue.setText("Verdadeiro");
        Bttrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttrueActionPerformed(evt);
            }
        });
        jPanel1.add(Bttrue);
        Bttrue.setBounds(640, 80, 90, 23);

        Btfalse.setText("Falso");
        Btfalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtfalseActionPerformed(evt);
            }
        });
        jPanel1.add(Btfalse);
        Btfalse.setBounds(640, 110, 90, 23);

        tela.setEditable(false);
        tela.setColumns(20);
        tela.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        tela.setRows(5);
        tela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                telaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tela);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 70, 510, 180);

        resu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Botão resultado.png"))); // NOI18N
        resu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuActionPerformed(evt);
            }
        });
        jPanel1.add(resu);
        resu.setBounds(120, 440, 150, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Fundo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void transparenciaBotao(){

Btsala1.setOpaque(false);
Btsala1.setContentAreaFilled(false);
Btsala1.setBorderPainted(false);
Btsala2.setOpaque(false);
Btsala2.setContentAreaFilled(false);
Btsala2.setBorderPainted(false);
Btsala3.setOpaque(false);
Btsala3.setContentAreaFilled(false);
Btsala3.setBorderPainted(false);
Btproxima.setOpaque(false);
Btproxima.setContentAreaFilled(false);
Btproxima.setBorderPainted(false);
Btsair.setOpaque(false);
Btsair.setContentAreaFilled(false);
Btsair.setBorderPainted(false);
resu.setOpaque(false);
resu.setContentAreaFilled(false);
resu.setBorderPainted(false);

}
    private void BtsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtsairActionPerformed

    
    private void mostraPergunta() {
        quest = perg.getProximapergunta();
        if (quest == null) {
            JOptionPane.showMessageDialog(null, "Parabéns você terminou esta sala! "
                    + "Escolha outra sala ou finalize o jogo clicando em 'Sair'.");
        }
        else tela.setText(quest.getTexto());
    }
    private void BtproximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtproximaActionPerformed
        // TODO add your handling code here:
        checaResposta();
        mostraPergunta();
    }//GEN-LAST:event_BtproximaActionPerformed

    private void BttrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttrueActionPerformed
        // TODO add your handling code here:
        /*perg.setVerdade(true);
        if(Bttrue.isSelected()){
          quest.getResultado();
        }*/
    }//GEN-LAST:event_BttrueActionPerformed

    private void checaResposta() {
        if (Bttrue.isSelected() && (quest.getResposta()==true)) acertos++;
        if (Btfalse.isSelected() && (quest.getResposta()==false)) acertos++;
    }
    
    

    private void Btsala3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btsala3ActionPerformed
        // TODO add your handling code here:
        //Recursos
        perg.setSala(3);
        mostraPergunta();
    }//GEN-LAST:event_Btsala3ActionPerformed

    private void Btsala1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btsala1ActionPerformed
        // TODO add your handling code here:
        // Reciclagem
        perg.setSala(1);
        mostraPergunta();
        
    }//GEN-LAST:event_Btsala1ActionPerformed

    private void Btsala2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btsala2ActionPerformed
        // TODO add your handling code here:
        //Sustentabilidade
        perg.setSala(2);
        mostraPergunta();
    }//GEN-LAST:event_Btsala2ActionPerformed

    private void telaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_telaAncestorAdded
        // TODO add your handling code here:
        tela.setText(perg.MsgInicial());
    }//GEN-LAST:event_telaAncestorAdded

    private void BtfalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtfalseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtfalseActionPerformed

    private int mostraResultado(){
        res = acertos *100;
        return res;
    }
    private void resuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resuActionPerformed
        // TODO add your handling code here:
        mostraResultado();
        
        tela.setText("Você tem " + mostraResultado() + " pontos.");
    }//GEN-LAST:event_resuActionPerformed

    
    private void configuraRadioButtons() {
        bgAlternativas.add(Bttrue);
        bgAlternativas.add(Btfalse);
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Btfalse;
    private javax.swing.JButton Btproxima;
    private javax.swing.JButton Btsair;
    private javax.swing.JButton Btsala1;
    private javax.swing.JButton Btsala2;
    private javax.swing.JButton Btsala3;
    private javax.swing.JRadioButton Bttrue;
    private javax.swing.ButtonGroup bgAlternativas;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton resu;
    private javax.swing.JTextArea tela;
    // End of variables declaration//GEN-END:variables
}
