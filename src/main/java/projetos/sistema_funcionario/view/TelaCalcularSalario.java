/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetos.sistema_funcionario.view;

import javax.swing.JButton;

/**
 *
 * @author Gabriel Namã
 */
public class TelaCalcularSalario extends javax.swing.JFrame {

    /**
     * Creates new form TelaManterFuncionario
     */
    public TelaCalcularSalario() {
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

        painelBuscarFuncionario = new javax.swing.JPanel();
        tituloJanela = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        campoTextoNome = new javax.swing.JTextField();
        botaoBuscarFuncionario = new javax.swing.JButton();
        tituloJanela1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoCancelar = new javax.swing.JButton();
        botaoCalcularSalario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter funcionários");
        setPreferredSize(new java.awt.Dimension(1224, 684));

        painelBuscarFuncionario.setPreferredSize(new java.awt.Dimension(1224, 684));

        tituloJanela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJanela.setText("CALCULAR SALÁRIOS");

        labelNome.setText("Nome:");

        campoTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNomeActionPerformed(evt);
            }
        });

        botaoBuscarFuncionario.setText("Buscar");
        botaoBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarFuncionarioActionPerformed(evt);
            }
        });

        tituloJanela1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJanela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJanela1.setText("Funcionários:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Funcionário", "Salário inicial", "Bônus", "Salário total", "Data"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoCalcularSalario.setText("Calcular");

        javax.swing.GroupLayout painelBuscarFuncionarioLayout = new javax.swing.GroupLayout(painelBuscarFuncionario);
        painelBuscarFuncionario.setLayout(painelBuscarFuncionarioLayout);
        painelBuscarFuncionarioLayout.setHorizontalGroup(
            painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarFuncionarioLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                            .addComponent(labelNome)
                            .addGap(18, 18, 18)
                            .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoBuscarFuncionario))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(tituloJanela1))
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(tituloJanela))
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(botaoCalcularSalario)
                        .addGap(279, 279, 279)
                        .addComponent(botaoCancelar)))
                .addGap(323, 323, 323))
        );
        painelBuscarFuncionarioLayout.setVerticalGroup(
            painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addComponent(tituloJanela)
                        .addGap(44, 44, 44)
                        .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoBuscarFuncionario))
                        .addGap(26, 26, 26)
                        .addComponent(tituloJanela1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCalcularSalario)
                    .addComponent(botaoCancelar))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoBuscarFuncionarioActionPerformed

    private void campoTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNomeActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalcularSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalcularSalario().setVisible(true);
            }
        });
    }
    
    public JButton getCancelar() {
        return botaoCancelar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscarFuncionario;
    private javax.swing.JButton botaoCalcularSalario;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JTextField campoTextoNome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelBuscarFuncionario;
    private javax.swing.JLabel tituloJanela;
    private javax.swing.JLabel tituloJanela1;
    // End of variables declaration//GEN-END:variables
}
