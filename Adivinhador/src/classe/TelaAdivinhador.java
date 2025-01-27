/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classe;

import java.util.Random;

/**
 *
 * @author gabri
 */
public class TelaAdivinhador extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdivinhador
     */
    public TelaAdivinhador() {
        initComponents();
        // OBRIGADO GUANABARA, MORRERIA E NÃO SABERIA QUE DÁ PRA COLOCAR TAG HTML EM JAVA!!
        lblCabecalho.setText("<html>Adivinhe o número de 1 a 5 que o Homer está pensando</html>");
        pnlResposta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnNumero = new javax.swing.JSpinner();
        lblCabecalho = new javax.swing.JLabel();
        btnAdivinha = new javax.swing.JButton();
        pnlResposta = new javax.swing.JPanel();
        lblResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhador");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/homer_1.png"))); // NOI18N

        spnNumero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        spnNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        lblCabecalho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCabecalho.setText("<cabeçalho>");
        lblCabecalho.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnAdivinha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdivinha.setText("Adivinhar!");
        btnAdivinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinhaActionPerformed(evt);
            }
        });

        lblResposta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblResposta.setText("<vazio>");

        javax.swing.GroupLayout pnlRespostaLayout = new javax.swing.GroupLayout(pnlResposta);
        pnlResposta.setLayout(pnlRespostaLayout);
        pnlRespostaLayout.setHorizontalGroup(
            pnlRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRespostaLayout.setVerticalGroup(
            pnlRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRespostaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdivinha)
                        .addGap(24, 24, 24)))
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdivinha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinhaActionPerformed
        // gerando número aleatório
        // (achei mais fácil utilizando a própria classe Random, sem ser o método de Math)
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;
        int numeroEscolhido = (int) spnNumero.getValue();
        // double aleatorio = 1 + Math.random() * (5-1);

        pnlResposta.setVisible(true);

        String certa = "Você acertou!";
        String errada = "<html>Você errou, o número certo era: " + numeroAleatorio + "</html>";

        String resposta = (numeroAleatorio == numeroEscolhido) ? certa : errada;
        lblResposta.setText(resposta);

        // fiz dessa forma mas achei interessante deixar com o operador ternário pra criar o hábito de usá-lo
//        if (numeroAleatorio == numeroEscolhido) {
//            lblResposta.setText("Você acertou!");
//        } else {
//            lblResposta.setText("Você errou, o número certo era: " + numeroAleatorio);
//        }

    }//GEN-LAST:event_btnAdivinhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdivinhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdivinhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdivinhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdivinhador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdivinhador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JPanel pnlResposta;
    private javax.swing.JSpinner spnNumero;
    // End of variables declaration//GEN-END:variables
}
