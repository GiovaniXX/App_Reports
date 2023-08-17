package forms;

import app.reports.MySQLData;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class SecondWindow extends javax.swing.JInternalFrame {

    private final Timer timer;

    public SecondWindow() {
        initComponents();
        timer = new Timer(1000, (ActionEvent e) -> {
            atualizarDataHoraAtual();
        });
        timer.start();
        atualizarDataHoraAtual();

        jTextField_DigiteCodigoBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_DigiteCodigoBarrasFocusGained(evt);
            }
        });
    }

    private void jTextField_DigiteCodigoBarrasFocusGained(java.awt.event.FocusEvent evt) {
        jTextField_DigiteCodigoBarras.setText("");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }

    private void atualizarDataHoraAtual() {
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataHoraAtual = new Date();
        String dataHoraAtualFormatada = formatoDataHora.format(dataHoraAtual);
        jLabel_DataHoraAtualSistema.setText(dataHoraAtualFormatada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_PesquisarBoletoBancario = new javax.swing.JComboBox<>();
        jRadioButton_Data = new javax.swing.JRadioButton();
        jRadioButton_CodigoBarras = new javax.swing.JRadioButton();
        jDateChooser_Data = new com.toedter.calendar.JDateChooser();
        jTextField_DigiteCodigoBarras = new javax.swing.JTextField();
        jCheckBox_Vencer = new javax.swing.JCheckBox();
        jCheckBox_Pagos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();
        jLabel_DataHoraAtualSistema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton_EnviarRegistrosWhatsApp = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox_EnviarMensagemWhatsapp = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);
        setTitle("Pesquisa de Boletos bancários");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setText("Data e Hora Atual.:");

        jLabel2.setText("Boleto.:");

        jComboBox_PesquisarBoletoBancario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma empresa para a pesquisa do boleto", "Boticário", "Natura", "Eudora", "Avon", "Golfran" }));
        jComboBox_PesquisarBoletoBancario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_PesquisarBoletoBancarioActionPerformed(evt);
            }
        });

        jRadioButton_Data.setText("Data");
        jRadioButton_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_DataActionPerformed(evt);
            }
        });

        jRadioButton_CodigoBarras.setText("Código de Barras");
        jRadioButton_CodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CodigoBarrasActionPerformed(evt);
            }
        });

        jDateChooser_Data.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser_Data.setEnabled(false);

        jTextField_DigiteCodigoBarras.setText("Digite o código de barras aqui");
        jTextField_DigiteCodigoBarras.setEnabled(false);

        jCheckBox_Vencer.setText("A Vencer");

        jCheckBox_Pagos.setText("Pagos");
        jCheckBox_Pagos.setEnabled(false);

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Cedente", "Código Barras", "Data de Vencimento", "Valor Pagamento", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Tabela.setSelectionBackground(new java.awt.Color(187, 187, 187));
        jScrollPane1.setViewportView(jTable_Tabela);
        if (jTable_Tabela.getColumnModel().getColumnCount() > 0) {
            jTable_Tabela.getColumnModel().getColumn(0).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable_Tabela.getColumnModel().getColumn(1).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(2).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(3).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable_Tabela.getColumnModel().getColumn(4).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable_Tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jButton_EnviarRegistrosWhatsApp.setText("Enviar Registros para o WhatsApp");
        jButton_EnviarRegistrosWhatsApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EnviarRegistrosWhatsAppActionPerformed(evt);
            }
        });

        jComboBox_EnviarMensagemWhatsapp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um telefone para o envio da mensagem", "+5549999367954", "+5549999573756" }));
        jComboBox_EnviarMensagemWhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EnviarMensagemWhatsappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton_CodigoBarras)
                                            .addComponent(jRadioButton_Data)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jDateChooser_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jCheckBox_Vencer)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBox_Pagos))
                                            .addComponent(jTextField_DigiteCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1896, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBox_PesquisarBoletoBancario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_EnviarMensagemWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_EnviarRegistrosWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jComboBox_PesquisarBoletoBancario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_Data)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox_Vencer)
                        .addComponent(jCheckBox_Pagos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_CodigoBarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_DigiteCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_EnviarMensagemWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_EnviarRegistrosWhatsApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_EnviarRegistrosWhatsAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EnviarRegistrosWhatsAppActionPerformed
        enviarBoletoWhatsApp();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_EnviarRegistrosWhatsAppActionPerformed

    private void jComboBox_PesquisarBoletoBancarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_PesquisarBoletoBancarioActionPerformed
        String empresaSelecionada = (String) jComboBox_PesquisarBoletoBancario.getSelectedItem();

        if (jRadioButton_Data.isSelected()) {
            // Carregar boletos por data
            SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
            String dataSelecionada = formatoData.format(jDateChooser_Data.getDate());

            carregarBoletosNaTabelaPorData(empresaSelecionada, dataSelecionada);

        } else if (jRadioButton_CodigoBarras.isSelected()) {
            // Carregar boletos por código de barras
            String codigoBarras = jTextField_DigiteCodigoBarras.getText().trim();

            carregarBoletosNaTabelaPorCodigoBarras(empresaSelecionada, codigoBarras);
        } else {
            // Carregar todos os boletos da empresa
            carregarBoletosNaTabela(empresaSelecionada);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Pesquisou corretamente.!");
    }

    private void carregarBoletosNaTabelaPorData(String empresaSelecionada, String dataSelecionada) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();
        MySQLData mySQLData = new MySQLData();

        String query = "SELECT * FROM " + empresaSelecionada + " WHERE dataVencimento = '" + dataSelecionada + "'";

        mySQLData.carregarBoletosNaTabela(query, tableModel);
    }

    private void carregarBoletosNaTabelaPorCodigoBarras(String empresaSelecionada, String codigoBarras) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();
        MySQLData mySQLData = new MySQLData();

        String query = "SELECT * FROM " + empresaSelecionada + " WHERE codigoBarras = '" + codigoBarras + "'";

        mySQLData.carregarBoletosNaTabela(query, tableModel);
    }//GEN-LAST:event_jComboBox_PesquisarBoletoBancarioActionPerformed

    private void jRadioButton_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_DataActionPerformed
        jDateChooser_Data.setEnabled(true);
        jTextField_DigiteCodigoBarras.setEnabled(false);
        jTextField_DigiteCodigoBarras.setText("Digite o código de barras aqui");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jRadioButton_DataActionPerformed

    private void jRadioButton_CodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CodigoBarrasActionPerformed
        jDateChooser_Data.setEnabled(false);
        jTextField_DigiteCodigoBarras.setEnabled(true);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jRadioButton_CodigoBarrasActionPerformed

    private void jComboBox_EnviarMensagemWhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EnviarMensagemWhatsappActionPerformed
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jComboBox_EnviarMensagemWhatsappActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_EnviarRegistrosWhatsApp;
    private javax.swing.JCheckBox jCheckBox_Pagos;
    private javax.swing.JCheckBox jCheckBox_Vencer;
    private javax.swing.JComboBox<String> jComboBox_EnviarMensagemWhatsapp;
    private javax.swing.JComboBox<String> jComboBox_PesquisarBoletoBancario;
    private com.toedter.calendar.JDateChooser jDateChooser_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_DataHoraAtualSistema;
    private javax.swing.JRadioButton jRadioButton_CodigoBarras;
    private javax.swing.JRadioButton jRadioButton_Data;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_DigiteCodigoBarras;
    // End of variables declaration//GEN-END:variables

    private void carregarBoletosNaTabela(String empresaSelecionada) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();
        MySQLData mySQLData = new MySQLData();

        String query = "";  // Aqui você definirá a consulta SQL adequada com a cláusula WHERE para a empresa selecionada

        switch (empresaSelecionada) {

            case "Avon" ->
                query = "SELECT * FROM avon";
            case "Boticário" ->
                query = "SELECT * FROM boticario";
            case "Eudora" ->
                query = "SELECT * FROM eudora";
            case "Golfran" ->
                query = "SELECT * FROM golfran";
            case "Natura" ->
                query = "SELECT * FROM natura";
            // Adicione outros casos para outras empresas, se necessário          
        }

        mySQLData.carregarBoletosNaTabela(query, tableModel);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable_Tabela.getColumnCount(); i++) {
            jTable_Tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    //-------------------------WHATSAPP---------------------------------//
    private void enviarMensagemWhatsApp(String numero, String mensagem) {
        try {
            String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + URLEncoder.encode(mensagem, StandardCharsets.UTF_8);
            java.awt.Desktop.getDesktop().browse(URI.create(url));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar mensagem no WhatsApp: " + ex.getMessage());
        }
    }

    private void enviarBoletoWhatsApp() {
        int selectedRow = jTable_Tabela.getSelectedRow();
        if (selectedRow != -1) {
            // Obter os dados do boleto selecionado na tabela
            String idBoleto = jTable_Tabela.getValueAt(selectedRow, 0).toString();
            String cedente = jTable_Tabela.getValueAt(selectedRow, 1).toString();
            String codigoBarras = jTable_Tabela.getValueAt(selectedRow, 2).toString();
            String dataVencimento = jTable_Tabela.getValueAt(selectedRow, 3).toString();
            String valorPagar = jTable_Tabela.getValueAt(selectedRow, 4).toString();

            // Formatar a mensagem a ser enviada
            String mensagem = "Boleto a vencer:\n\n"
                    + "ID do Boleto: " + idBoleto + "\n"
                    + "Cedente: " + cedente + "\n"
                    + "Código de Barras: " + codigoBarras + "\n"
                    + "Data de Vencimento: " + dataVencimento + "\n"
                    + "Valor a Pagar: " + valorPagar;

            // Número de telefone para onde irá mensagem
            String numeroCliente = "+5549999367954";
            //String numeroCliente = "+5549999573756";

            // Enviar a mensagem pelo WhatsApp
            enviarMensagemWhatsApp(numeroCliente, mensagem);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um boleto na tabela.");
        }
    }
}
