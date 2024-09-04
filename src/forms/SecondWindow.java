package forms;

import java.sql.Connection;
import app.reports.MySQLData;
import app.reports.Util;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class SecondWindow extends javax.swing.JInternalFrame {

    public Connection cnn;
    private final Timer timer;
    public String formaPagamento;
    private final DateTimeFormatter formatter;

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
        preencherComboBoxTelefonesClientes();

        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    }
    //---------SOMENTE PARA FINS DO SECONDWINDOWTEST------------
    // Adicionando os métodos getter e setter para formaPagamento

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    //----------------FIM SECONDWINDOWTEST-----------------------

    private void preencherComboBoxTelefonesClientes() {
        MySQLData mysqlData = new MySQLData();
        List<String> telefones = mysqlData.telefonesClientes();

        // Limpar o jComboBox para evitar duplicatas
        jComboBox_SelecioneNumeroTelefone.removeAllItems();

        // Adicione a mensagem padrão
        jComboBox_SelecioneNumeroTelefone.addItem("Selecione um número de telefone para o envio da mensagem");
        // Adicionar os telefones dos clientes ao JComboBox
        for (String telefone : telefones) {
            jComboBox_SelecioneNumeroTelefone.addItem(telefone);
        }
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox_SelecioneNumeroTelefone = new javax.swing.JComboBox<>();
        jButton_EnviarRegistrosWhatsApp = new customization.Button();

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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Produto", "Preco", "Categoria", "Cedente", "Código Barras", "Data de Vencimento", "Valor Pagamento", "Forma de Pagamento", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Tabela.setSelectionBackground(new java.awt.Color(0, 102, 51));
        jScrollPane1.setViewportView(jTable_Tabela);
        if (jTable_Tabela.getColumnModel().getColumnCount() > 0) {
            jTable_Tabela.getColumnModel().getColumn(0).setMinWidth(70);
            jTable_Tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable_Tabela.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable_Tabela.getColumnModel().getColumn(2).setMinWidth(100);
            jTable_Tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable_Tabela.getColumnModel().getColumn(3).setMinWidth(100);
            jTable_Tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable_Tabela.getColumnModel().getColumn(6).setMinWidth(200);
            jTable_Tabela.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTable_Tabela.getColumnModel().getColumn(6).setMaxWidth(200);
            jTable_Tabela.getColumnModel().getColumn(7).setMinWidth(100);
            jTable_Tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(7).setMaxWidth(100);
            jTable_Tabela.getColumnModel().getColumn(8).setMinWidth(150);
            jTable_Tabela.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable_Tabela.getColumnModel().getColumn(8).setMaxWidth(150);
            jTable_Tabela.getColumnModel().getColumn(9).setMinWidth(100);
            jTable_Tabela.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable_Tabela.getColumnModel().getColumn(9).setMaxWidth(100);
        }

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jComboBox_SelecioneNumeroTelefone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um telefone para o envio da mensagem", " " }));

        jButton_EnviarRegistrosWhatsApp.setText("Enviar Registros no WhatsApp");
        jButton_EnviarRegistrosWhatsApp.setColor(new java.awt.Color(204, 0, 0));
        jButton_EnviarRegistrosWhatsApp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_EnviarRegistrosWhatsApp.setRadius(45);
        jButton_EnviarRegistrosWhatsApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EnviarRegistrosWhatsAppActionPerformed(evt);
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
                                            .addComponent(jTextField_DigiteCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton_EnviarRegistrosWhatsApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                .addComponent(jComboBox_SelecioneNumeroTelefone, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_SelecioneNumeroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_EnviarRegistrosWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        System.out.println("Pegou os dados do banco corretamente.!");
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

    private void jButton_EnviarRegistrosWhatsAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EnviarRegistrosWhatsAppActionPerformed
        String empresaSelecionada = (String) jComboBox_PesquisarBoletoBancario.getSelectedItem();

        // Verifica se a opção padrão está selecionada
        if ("Selecione uma empresa para a pesquisa do boleto".equals(empresaSelecionada)) {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, selecione uma empresa válida para a pesquisa do boleto.");
            return;
        }

        // Verifica se foi selecionado um número de telefone
        int selectedTelefoneIndex = jComboBox_SelecioneNumeroTelefone.getSelectedIndex();
        if (selectedTelefoneIndex == 0) {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, selecione um telefone válido para o envio da mensagem.");
            return;  // Sai do método se o número de telefone não estiver selecionado
        }

        // Verifica se foi selecionado um boleto na tabela
        int selectedRow = jTable_Tabela.getSelectedRow();
        if (selectedRow
                == -1) {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, selecione um boleto na tabela para o envio da mensagem.");
            return;  // Sai do método se nenhum boleto estiver selecionado
        }

        // Chama o método enviarBoletoWhatsApp() se todas as verificações passarem
        //calcularDataParcela();
        enviarBoletoWhatsApp();

        int id = evt.getID();

        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_EnviarRegistrosWhatsAppActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customization.Button jButton_EnviarRegistrosWhatsApp;
    private javax.swing.JCheckBox jCheckBox_Pagos;
    private javax.swing.JCheckBox jCheckBox_Vencer;
    private javax.swing.JComboBox<String> jComboBox_PesquisarBoletoBancario;
    private javax.swing.JComboBox<String> jComboBox_SelecioneNumeroTelefone;
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
            // Remova qualquer formatação do número, se necessário
            numero = numero.replaceAll("[^\\d]", ""); // Remove tudo que não for dígito
            String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + URLEncoder.encode(mensagem, StandardCharsets.UTF_8.toString());
            java.awt.Desktop.getDesktop().browse(URI.create(url));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao enviar mensagem no WhatsApp: " + ex.getMessage());
        }
    }

    private void enviarBoletoWhatsApp() {
        int selectedRow = jTable_Tabela.getSelectedRow();
        if (selectedRow != -1) {
            // Obter o número de telefone selecionado no JComboBox
            String numeroCliente = (String) jComboBox_SelecioneNumeroTelefone.getSelectedItem();

            if (numeroCliente != null && !numeroCliente.isEmpty()) {
                // Obter os dados do boleto selecionado na tabela
                String idBoleto = jTable_Tabela.getValueAt(selectedRow, 0).toString();
                String produto = jTable_Tabela.getValueAt(selectedRow, 1).toString();
                String preco = jTable_Tabela.getValueAt(selectedRow, 2).toString();
                String categoria = jTable_Tabela.getValueAt(selectedRow, 3).toString();
                String cedente = jTable_Tabela.getValueAt(selectedRow, 4).toString();
                String codigoBarras = jTable_Tabela.getValueAt(selectedRow, 5).toString();
                String dataVencimento = jTable_Tabela.getValueAt(selectedRow, 6).toString();
                String valorPagamento = jTable_Tabela.getValueAt(selectedRow, 7).toString();
                String formaPagamento = Util.objectToString(jTable_Tabela.getValueAt(selectedRow, 8));
                //formaPagamento = Util.objectToString(jTable_Tabela.getValueAt(selectedRow, 8));
                String situacao = jTable_Tabela.getValueAt(selectedRow, 9).toString();

                // Formatar a mensagem a ser enviada
                String mensagem = "Relatório da venda:\n\n"
                        + "Cedente: " + cedente + "\n"
                        + "Número da venda: " + idBoleto + "\n"
                        + "Produto: " + produto + "\n"
                        + "categoria: " + categoria + "\n"
                        + "Preço do Produto: " + preco + "\n"
                        + "Código de Barras: " + codigoBarras + "\n"
                        + "Data da venda: " + dataVencimento + "\n"
                        + "Forma Pagamento: " + formaPagamento + "\n"
                        + "Valor a pagar: " + valorPagamento + "\n"
                        + "Situação: " + situacao + "\n";

                // Verificar a forma de pagamento e formatar a mensagem adequadamente
                switch (formaPagamento) {
                    case "1x", "2x", "3x", "4x" -> {
                        mensagem += "Forma de Pagamento: Parcelado em " + formaPagamento + "\n";
                        // Obtem o número de parcelas (1, 2, 3, 4)
                        int numParcelas = Integer.parseInt(formaPagamento.substring(0, 1));
                        for (int i = 1; i <= numParcelas; i++) {
                            //mensagem += i + "° Pagamento\n" + calcularDataParcela(dataVencimento, i) + "\n";
                            mensagem += i + "° Pagamento\n" + DataParcelaCalculator(dataVencimento, i) + "\n";
                        }
                    }
                    default -> {
                        mensagem += "Forma de Pagamento: " + formaPagamento + "\n";
                    }
                }

                mensagem += "Valor a Pagar: " + formaPagamento;

                // Enviar a mensagem pelo WhatsApp
                enviarMensagemWhatsApp(numeroCliente, mensagem);
            }
        }
    }

    public String DataParcelaCalculator(String dataVencimento, int i) {
        return null;
    }

    public class DataParcelaCalculator {

        private static final Logger LOGGER = Logger.getLogger(DataParcelaCalculator.class.getName());
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        public String calcularDataParcela(String dataVencimento, int parcela, String formaPagamento) {
            LocalDate localDate;
            try {
                localDate = parseDataVencimento(dataVencimento);
            } catch (DateTimeParseException e) {
                LOGGER.log(Level.SEVERE, "Erro ao analisar a data: " + dataVencimento, e);
                return "Erro ao calcular data da parcela";
            }

            LocalDate dataParcela;
            try {
                dataParcela = calcularDataParcela(localDate, parcela, formaPagamento);
            } catch (IllegalArgumentException e) {
                LOGGER.log(Level.SEVERE, "Forma de pagamento desconhecida: " + formaPagamento, e);
                return "Erro ao calcular data da parcela";
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Erro inesperado ao calcular data da parcela", e);
                return "Erro ao calcular data da parcela";
            }

            return formatarData(dataParcela);
        }

        private LocalDate parseDataVencimento(String dataVencimento) {
            return LocalDate.parse(dataVencimento, FORMATTER);
        }

        private LocalDate calcularDataParcela(LocalDate dataVencimento, int parcela, String formaPagamento) {
            switch (formaPagamento) {
                case "1x" -> {
                    return dataVencimento;
                }
                case "2x", "3x", "4x" -> {
                    return dataVencimento.plusMonths(parcela - 1);
                }
                default ->
                    throw new IllegalArgumentException("Forma de pagamento desconhecida: " + formaPagamento);
            }
        }

        private String formatarData(LocalDate data) {
            return data.format(FORMATTER);
        }
    }
}
