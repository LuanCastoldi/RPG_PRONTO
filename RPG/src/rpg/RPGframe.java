/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import static java.lang.Math.random;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author luan.castoldi
 */
public class RPGframe extends javax.swing.JFrame {

    Personagem personagem1;
    Inimigo inimigo1;
    String[] inimigos = {"Godzilla", "Tio Patinhas", "Inimigo Final", ""};

    int countInimigo = 0;

    /**
     * Creates new form RPGframe
     */
    public RPGframe() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        personagem1 = new Personagem();
        inimigo1 = new Inimigo();

        personagem1.setNome("Zeus");
        personagem1.setVida(200);
        personagem1.setAtaque(5);

        exibirPersonagem();
        gerarInimigo();
        exibirInimigo();

    }

    public void exibirPersonagem() {
        lblNomeP1.setText(personagem1.getNome());
        lblVida11.setText(String.valueOf(personagem1.getVida()));
        lblAtaque11.setText(String.valueOf(personagem1.getAtaque()));

    }

    private void exibirInimigo() {

        lblNomeP2.setText(inimigo1.getNome());
        lblVida22.setText(String.valueOf(inimigo1.getVida()));
        lblAtaque22.setText(String.valueOf(inimigo1.getAtaque()));
    }

    private void gerarInimigo() {

        inimigo1 = new Inimigo();
        inimigo1.setNome(inimigos[countInimigo]);
        inimigo1.setVida(1000);
        inimigo1.setAtaque(40);

        if (countInimigo < inimigos.length) {
            countInimigo += 1;
        } else {
            countInimigo = 0;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblP1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblVida1 = new javax.swing.JLabel();
        lblVida2 = new javax.swing.JLabel();
        lblAtaque1 = new javax.swing.JLabel();
        lblAtaque2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblNomeP1 = new javax.swing.JLabel();
        lblNomeP2 = new javax.swing.JLabel();
        lblVida11 = new javax.swing.JLabel();
        lblVida22 = new javax.swing.JLabel();
        lblAtaque22 = new javax.swing.JLabel();
        lblAtaque11 = new javax.swing.JLabel();
        btnManual = new javax.swing.JButton();
        lblDano = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblP1.setText("Personagem:");

        lblP2.setText("Personagem:");

        lblVida1.setText("Vida Atual:");

        lblVida2.setText("Vida Atual:");

        lblAtaque1.setText("Ataque:");

        lblAtaque2.setText("Ataque:");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 11)); // NOI18N
        jButton1.setText("ATACAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNomeP1.setText("...");

        lblNomeP2.setText("...");

        lblVida11.setText("...");

        lblVida22.setText("...");

        lblAtaque22.setText("...");

        lblAtaque11.setText("...");

        btnManual.setBackground(new java.awt.Color(51, 204, 255));
        btnManual.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnManual.setText("REGRAS");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        lblDano.setBackground(new java.awt.Color(0, 0, 0));
        lblDano.setForeground(new java.awt.Color(204, 0, 0));
        lblDano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDano.setText("DANO:");
        lblDano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSair.setBackground(new java.awt.Color(255, 0, 51));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblP1)
                            .addComponent(lblAtaque1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeP1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVida11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAtaque11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAtaque2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblVida22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAtaque22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeP2)))
                        .addGap(143, 143, 143))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(lblDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP1)
                    .addComponent(lblNomeP1)
                    .addComponent(lblP2)
                    .addComponent(lblNomeP2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVida1)
                    .addComponent(lblVida11)
                    .addComponent(lblVida2)
                    .addComponent(lblVida22))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtaque11)
                    .addComponent(lblAtaque1)
                    .addComponent(lblAtaque2)
                    .addComponent(lblAtaque22))
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblDano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        atacar();

        if (inimigo1.getVida() <= 0) { //VERIFICA SE PRECISA GERAR OUTRO INIMIGO
            CaixaDeDialogo.obterinstancia().exibirMensagem("Inimigo derrotado, PARABÉNS!!!", 'i');
            lblDano.setText("+ 20 VIDA");
           personagem1.setAtaque(5);
           personagem1.setVida(personagem1.getVida() + 20);

            gerarInimigo();
        }
        exibirPersonagem();
        exibirInimigo();

        if (personagem1.getVida() <= 0) {
            
             GameOver frame = new GameOver();
            frame.setVisible(true);
            this.dispose();
            //CaixaDeDialogo.obterinstancia().exibirMensagem("*** GAME OVER **", 'i');
            this.dispose();
        }
        if (countInimigo > 3) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("VOCÊ VENCEU O JOGO!!!", 'i');
            // lblDano.setText(String.valueOf(personagem1.getVida()));
            this.dispose();
        }

    }

    /*1,2 = inimigo ataca
        3 = ataque normal
        4 = ataque + 10%
        5 = ataque * 2*/
    private void atacar() {
        int ataque = personagem1.getAtaque();
        int vida = inimigo1.getVida();
        int dado = Funcoes.sortearNumero(8);
        
         DecimalFormat fmt = new DecimalFormat("0.0"); 
        
        if (dado == 1 || dado == 2) {
            lblDano.setText("DANO: LEVE SOFRIDO: " + inimigo1.getAtaque());
            personagem1.setVida(personagem1.getVida() - inimigo1.getAtaque());
        } else if (dado == 3) {
            lblDano.setText("DANO: MÉDIO REALIZADO: " + ataque);
            inimigo1.setVida(inimigo1.getVida() - ataque);
            personagem1.setAtaque((int) (ataque));
        } else if (dado == 4) { //10% a mais
            lblDano.setText("DANO: ALTO REALIZADO: " + fmt.format(ataque * 1.1));
            vida = (int) (inimigo1.getVida() - (ataque * 1.1));
            inimigo1.setVida(vida);
            personagem1.setAtaque((int) (ataque * 1.1));
        } else if (dado == 5) { //ataque x 1.2
            lblDano.setText("DANO: EXTRA REALIZADO: " + fmt.format(ataque * 1.2));
            vida = (int) (inimigo1.getVida() - (ataque * 1.2));
            inimigo1.setVida(vida);
            personagem1.setAtaque((int) (ataque * 1.2));
        } else if (dado == 6) { //ataque x 1.3
            lblDano.setText("DANO: CRÍTICO REALIZADO: " + fmt.format(ataque * 1.3));  
            vida = (int) (inimigo1.getVida() - (ataque * 1.3));
            inimigo1.setVida(vida);
            personagem1.setAtaque((int) (ataque * 1.3));
        } else if (dado == 7) { //ataque x 1.4
            lblDano.setText("DANO: ULTRA REALIZADO: " + fmt.format(ataque * 1.4));
            vida = (int) (inimigo1.getVida() - (ataque * 1.4));
            inimigo1.setVida(vida);
            personagem1.setAtaque((int) (ataque * 1.4));
        } else { //ataque x 3
            lblDano.setText("DANO: LENDÁRIO REALIZADO: " + fmt.format(ataque * 1.5));    
            vida = (int) (inimigo1.getVida() - (ataque * 1.5));
            inimigo1.setVida(vida);
            personagem1.setAtaque((int) (ataque * 1.5));
        }

    }

    private void dano() {
        int vida = personagem1.getVida();

        /* inimigo1.setVida(inimigo1.getVida() - personagem1.getAtaque());
         if(inimigo1.getVida()<=0){
             gerarInimigo();
            JOptionPane.showMessageDialog(this, "INIMIGO MORTO");
         } else {
         exibirInimigo();
         }*/

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        // TODO add your handling code here:
        Regras frame = new Regras();
        frame.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnManualActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(RPGframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPGframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPGframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPGframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPGframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAtaque1;
    private javax.swing.JLabel lblAtaque11;
    private javax.swing.JLabel lblAtaque2;
    private javax.swing.JLabel lblAtaque22;
    private javax.swing.JLabel lblDano;
    private javax.swing.JLabel lblNomeP1;
    private javax.swing.JLabel lblNomeP2;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblVida1;
    private javax.swing.JLabel lblVida11;
    private javax.swing.JLabel lblVida2;
    private javax.swing.JLabel lblVida22;
    // End of variables declaration//GEN-END:variables
}
