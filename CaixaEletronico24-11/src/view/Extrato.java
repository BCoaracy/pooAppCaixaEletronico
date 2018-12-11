package view;

import banco.DepositaBEAN;
import banco.DepositaDAO;
import banco.ExtratoDAO;
import banco.SaqueBEAN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Extrato extends javax.swing.JFrame {

    public ExtratoDAO extrato = new ExtratoDAO();

    public Extrato() {
        initComponents();
        System.out.println("extrato");
        System.out.println(Login.nconta + "\n" + Login.senha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExtrato = new javax.swing.JTable();
        btnDepositoExtrato = new javax.swing.JToggleButton();
        btnSaqueExtrato = new javax.swing.JToggleButton();
        btnLimpaExtrato = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "valor", "nConta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaExtrato);

        btnDepositoExtrato.setText("Buscar Depositos");
        btnDepositoExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoExtratoActionPerformed(evt);
            }
        });

        btnSaqueExtrato.setText("Buscar Saques");
        btnSaqueExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueExtratoActionPerformed(evt);
            }
        });

        btnLimpaExtrato.setText("LIMPAR");
        btnLimpaExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDepositoExtrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaqueExtrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpaExtrato)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositoExtrato)
                    .addComponent(btnSaqueExtrato)
                    .addComponent(btnLimpaExtrato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositoExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoExtratoActionPerformed
        DepositaBEAN depB = new DepositaBEAN();

        //DepositaDAO depD = new DepositaDAO();
        List<DepositaBEAN> lista = new ArrayList<DepositaBEAN>();
        try {

            lista = extrato.findAllDeposita(Login.nconta);

            DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaExtrato.getModel();
            dtmPrincipal.setNumRows(0);

            for (int i = 0; i < lista.size(); i++) {
                Object[] linha = {
                    lista.get(i).getIdDeposita(),
                    lista.get(i).getValorDeposita(),
                    lista.get(i).getIdConta()
                };
                dtmPrincipal.addRow(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDepositoExtratoActionPerformed

    private void btnSaqueExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueExtratoActionPerformed
        SaqueBEAN saqueB = new SaqueBEAN();

        List<SaqueBEAN> lista = new ArrayList<SaqueBEAN>();
        try {

            lista = extrato.findAllSaques(Login.nconta);

            DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaExtrato.getModel();
            dtmPrincipal.setNumRows(0);

            for (int i = 0; i < lista.size(); i++) {
                Object[] linha = {
                    lista.get(i).getIdSaque(),
                    lista.get(i).getValorSaque(),
                    lista.get(i).getIdConta()
                };
                dtmPrincipal.addRow(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaqueExtratoActionPerformed

    private void btnLimpaExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaExtratoActionPerformed
        DefaultTableModel dtmPrincipal = (DefaultTableModel) tabelaExtrato.getModel();
        dtmPrincipal.setNumRows(0);
    }//GEN-LAST:event_btnLimpaExtratoActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDepositoExtrato;
    private javax.swing.JToggleButton btnLimpaExtrato;
    private javax.swing.JToggleButton btnSaqueExtrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaExtrato;
    // End of variables declaration//GEN-END:variables
}
