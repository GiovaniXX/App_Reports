package forms;

import com.formdev.flatlaf.IntelliJTheme;

public final class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        exibirmensagemConexao();
    }

    public void exibirmensagemConexao() {
        jLabel_StatusConexao.setText("Connectado ao banco de dados App reports..!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane_MainWindow = new javax.swing.JDesktopPane();
        jLabel_StatusConexao = new javax.swing.JLabel();
        jMenuBar_MenuPrincipal = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_Reports = new javax.swing.JMenuItem();
        jMenuItem_RegistrationBills = new javax.swing.JMenuItem();
        jMenuItem_Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        DesktopPane_MainWindow.setBackground(new java.awt.Color(60, 63, 65));
        DesktopPane_MainWindow.setLayout(new java.awt.BorderLayout());

        jLabel_StatusConexao.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel_StatusConexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_StatusConexao.setPreferredSize(new java.awt.Dimension(1258, 64));
        DesktopPane_MainWindow.add(jLabel_StatusConexao, java.awt.BorderLayout.CENTER);

        jMenu_File.setText("File");

        jMenuItem_Reports.setText("Reports");
        jMenuItem_Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ReportsActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_Reports);

        jMenuItem_RegistrationBills.setText("Registration of Bills");
        jMenuItem_RegistrationBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegistrationBillsActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_RegistrationBills);

        jMenuItem_Exit.setText("Exit");
        jMenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_Exit);

        jMenuBar_MenuPrincipal.add(jMenu_File);

        setJMenuBar(jMenuBar_MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane_MainWindow)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane_MainWindow)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ReportsActionPerformed
        SecondWindow sw = new SecondWindow();
        DesktopPane_MainWindow.add(sw);
        sw.show();
    }//GEN-LAST:event_jMenuItem_ReportsActionPerformed

    private void jMenuItem_RegistrationBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegistrationBillsActionPerformed
        ThirdWindow tw = new ThirdWindow();
        DesktopPane_MainWindow.add(tw);
        tw.show();
    }//GEN-LAST:event_jMenuItem_RegistrationBillsActionPerformed

    private void jMenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_ExitActionPerformed

    public class main {

        public static void main(String args[]) {
            try {
                IntelliJTheme.setup(MainWindow.class.getResourceAsStream("/Visual_Studio_2019_Dark_Theme.theme.json"));
            } catch (Exception e) {
            }

            java.awt.EventQueue.invokeLater(() -> {
                new MainWindow().setVisible(true);
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane_MainWindow;
    private javax.swing.JLabel jLabel_StatusConexao;
    private javax.swing.JMenuBar jMenuBar_MenuPrincipal;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenuItem jMenuItem_RegistrationBills;
    private javax.swing.JMenuItem jMenuItem_Reports;
    private javax.swing.JMenu jMenu_File;
    // End of variables declaration//GEN-END:variables
}
