/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 08/01/2012, 14:02:46
 */
package betonkey;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Celso
 */
public class principal extends javax.swing.JFrame {

    private UIManager.LookAndFeelInfo aparencia[];

    /**
     * Creates new form principal
     */
    public principal() {
        copiarCh ch = new copiarCh();
        aparencia = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo aparencia1 : aparencia) {
            System.out.println("Aparencia: " + aparencia1.getName());
        }
        try {
            UIManager.setLookAndFeel(aparencia[3].getClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        ch1 = new javax.swing.JButton();
        mens = new javax.swing.JLabel();
        ch2 = new javax.swing.JButton();
        ch3 = new javax.swing.JButton();
        ch4 = new javax.swing.JButton();
        ch5 = new javax.swing.JButton();
        ch6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Beton Hard Lock Change v 1.8");
        setResizable(false);

        ch1.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pendrive.png"))); // NOI18N
        ch1.setText("<html>\n<h2>#1 Roxa</h2>\n<center>Basic</center>\n<center>&nbsp;</center>\n</html>");
        ch1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ch1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });

        mens.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ch2.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pendrive.png"))); // NOI18N
        ch2.setText("<html>\n<h2>#2 Branca</h2>\n<center>Basic</center>\n<center>&nbsp;</center>\n</html>");
        ch2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ch2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch2ActionPerformed(evt);
            }
        });

        ch3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pendrive.png"))); // NOI18N
        ch3.setText("<html>\n<h2>#3 Azul</h2>\n<center>Advanced</center>\n<center>Ultimate</center>\n</html>");
        ch3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ch3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch3ActionPerformed(evt);
            }
        });

        ch4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pendrive.png"))); // NOI18N
        ch4.setText("<html>\n<h2>#4 Smile</h2>\n<center>Plus</center>\n<center>&nbsp;</center>\n</html>");
        ch4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ch4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch4ActionPerformed(evt);
            }
        });

        ch5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pendrive.png"))); // NOI18N
        ch5.setText("<html>\n<h2>#5 Preto</h2>\n<center>Basic</center>\n<center>&nbsp;</center>\n</html>");
        ch5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ch5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch5ActionPerformed(evt);
            }
        });

        ch6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pendrive.png"))); // NOI18N
        ch6.setText("<html>\n<h2>#Bridge</h2>\n<center>#3 Azul</center>\n<center>&nbsp;</center>\n</html>");
        ch6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ch6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ch6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mens, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed
    this.setEnabled(false);

    copiarCh chave = new copiarCh();

    chave.bkpChave();
    //chave.copiarChave("1");
    mens.setText( chave.copiarChave("1") );
    //mens.setText("Chave 1 copiada com sucesso!");

    this.setEnabled(true);
}//GEN-LAST:event_ch1ActionPerformed

private void ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch2ActionPerformed
    this.setEnabled(false);

    copiarCh chave = new copiarCh();

    chave.bkpChave();
    //chave.copiarChave("2");
    mens.setText( chave.copiarChave("2") );
    //mens.setText("Chave 2 copiada com sucesso!");

    this.setEnabled(true);
}//GEN-LAST:event_ch2ActionPerformed

private void ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch3ActionPerformed
    this.setEnabled(false);

    copiarCh chave = new copiarCh();

    chave.bkpChave();
    //chave.copiarChave("3");
    mens.setText( chave.copiarChave("3") );
    //mens.setText("Chave 3 copiada com sucesso!");

    this.setEnabled(true);
}//GEN-LAST:event_ch3ActionPerformed

    private void ch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch4ActionPerformed
        this.setEnabled(false);

        copiarCh chave = new copiarCh();

        chave.bkpChave();
        //chave.copiarChave("4");
        mens.setText( chave.copiarChave("4") );
        //mens.setText("Chave 4 copiada com sucesso!");

        this.setEnabled(true);
    }//GEN-LAST:event_ch4ActionPerformed

    private void ch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch5ActionPerformed
        this.setEnabled(false);

        copiarCh chave = new copiarCh();

        chave.bkpChave();
        mens.setText( chave.copiarChave("5") );
        //chave.copiarChave("5");
        //mens.setText("Chave 5 copiada com sucesso!");

        this.setEnabled(true);
    }//GEN-LAST:event_ch5ActionPerformed

    private void ch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch6ActionPerformed
        this.setEnabled(false);

        copiarCh chave = new copiarCh();

        chave.bkpChaveBridge();
        mens.setText( chave.copiarChaveBridge("3") );
        
        
        /*if (chave.copiarChaveBridge("3")) {
            mens.setText("Chave Bridge copiada com sucesso!");
        } else {
            mens.setText("Erro ao tentar copiar chave Bridge!");
        }
        */
        this.setEnabled(true);
    }//GEN-LAST:event_ch6ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ch1;
    private javax.swing.JButton ch2;
    private javax.swing.JButton ch3;
    private javax.swing.JButton ch4;
    private javax.swing.JButton ch5;
    private javax.swing.JButton ch6;
    private javax.swing.JLabel mens;
    // End of variables declaration//GEN-END:variables
}
