package forms;

import app.reports.MySQLData;
import app.reports.Util;
import static app.reports.Util.convertStringToString;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ThirdWindow extends javax.swing.JInternalFrame {

    private final Timer timer;

    public ThirdWindow() {
        initComponents();
        timer = new Timer(1000, (ActionEvent e) -> {
            atualizarDataHoraAtual();
        });
        timer.start();
        atualizarDataHoraAtual();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Cedente = new javax.swing.JTextField();
        jTextField_CodigoBarras = new javax.swing.JTextField();
        jTextField_DataVencimento = new javax.swing.JTextField();
        jTextField_ValorPagamento = new javax.swing.JTextField();
        jButton_CadastrarBoletoBancoDados = new javax.swing.JButton();
        jButton_ExcluirBoleto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel_DataHoraAtualSistema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_Empresas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Situacao = new javax.swing.JTextField();
        jButton_LimparCampos = new javax.swing.JButton();
        Button_NovoCadastro = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Boletos bancários");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));

        jLabel1.setText("Cedente.:");

        jLabel2.setText("Código Barras.:");

        jLabel3.setText("Data Vencimento.:");

        jLabel4.setText("Valor Pagamento.:");

        jTextField_Cedente.setEnabled(false);

        jTextField_CodigoBarras.setEnabled(false);

        jTextField_DataVencimento.setEnabled(false);

        jTextField_ValorPagamento.setEnabled(false);

        jButton_CadastrarBoletoBancoDados.setText("Cadastrar Boleto Banco Dados");
        jButton_CadastrarBoletoBancoDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastrarBoletoBancoDadosActionPerformed(evt);
            }
        });

        jButton_ExcluirBoleto.setText("Excluir Boleto");
        jButton_ExcluirBoleto.setMaximumSize(new java.awt.Dimension(189, 23));
        jButton_ExcluirBoleto.setMinimumSize(new java.awt.Dimension(189, 23));
        jButton_ExcluirBoleto.setPreferredSize(new java.awt.Dimension(189, 23));
        jButton_ExcluirBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirBoletoActionPerformed(evt);
            }
        });

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Cedente", "Código Barras", "Data Vencimento", "Valor Pagamento", "Situação"
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
        jScrollPane1.setViewportView(jTable_Tabela);
        if (jTable_Tabela.getColumnModel().getColumnCount() > 0) {
            jTable_Tabela.getColumnModel().getColumn(0).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(1).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(2).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(3).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(4).setResizable(false);
            jTable_Tabela.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setText("Data e Hora Atual.:");

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jLabel6.setText("Empresas.:");

        jComboBox_Empresas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Boticário", "Natura", "Eudora", "Avon", "Golfran" }));
        jComboBox_Empresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EmpresasActionPerformed(evt);
            }
        });

        jLabel7.setText("Situação.:");

        jTextField_Situacao.setEnabled(false);

        jButton_LimparCampos.setText("Limpar Campos");
        jButton_LimparCampos.setMaximumSize(new java.awt.Dimension(189, 23));
        jButton_LimparCampos.setMinimumSize(new java.awt.Dimension(189, 23));
        jButton_LimparCampos.setPreferredSize(new java.awt.Dimension(189, 23));
        jButton_LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparCamposActionPerformed(evt);
            }
        });

        Button_NovoCadastro.setText("Novo Cadastro");
        Button_NovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NovoCadastroActionPerformed(evt);
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox_Empresas, 0, 400, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_CodigoBarras)
                                    .addComponent(jTextField_Cedente, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_CadastrarBoletoBancoDados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_LimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_ExcluirBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1001, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Cedente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_CodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_ValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CadastrarBoletoBancoDados)
                    .addComponent(jButton_ExcluirBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_LimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_NovoCadastro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CadastrarBoletoBancoDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastrarBoletoBancoDadosActionPerformed
        try {
            String cedente = jTextField_Cedente.getText();
            String codigoBarras = convertStringToString(Util.extractFormattedNumber(jTextField_CodigoBarras.getText()));
            Date dataVencimento = Util.convertStringToDate(jTextField_DataVencimento.getText());
            float valorPagamento = (float) Util.parseFloatWithComma(jTextField_ValorPagamento.getText());
            String situacao = jTextField_Situacao.getText();

            MySQLData mySQLData = new MySQLData();

            // Obter a opção selecionada no jComboBox_Empresas
            String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();

            // Verificar se nenhuma empresa foi selecionada
            if (empresaSelecionada == null || empresaSelecionada.isEmpty()) {
                // Exibir mensagem de erro ao usuário
                JOptionPane.showMessageDialog(this, "Selecione uma empresa antes de cadastrar o boleto.");
                return;
            }

            // Chamar o método apropriado com base na empresa selecionada
            switch (empresaSelecionada) {
                case "Avon" -> {
                    mySQLData.cadastrarInformacoesAvon(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaAvon((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Boticário" -> {
                    mySQLData.cadastrarInformacoesBoticario(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaBoticario((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Eudora" -> {
                    mySQLData.cadastrarInformacoesEudora(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaEudora((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Golfran" -> {
                    mySQLData.cadastrarInformacoesGolfran(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaGolfran((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Natura" -> {
                    mySQLData.cadastrarInformacoesNatura(cedente, codigoBarras, dataVencimento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaNatura((DefaultTableModel) jTable_Tabela.getModel());
                }
            }
            // Exibir mensagem de sucesso ao usuário
            JOptionPane.showMessageDialog(this, "Boleto cadastrado com sucesso!");
        } catch (ParseException ex) {
            Logger.getLogger(SecondWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Cedente.setEnabled(false);
        jTextField_CodigoBarras.setEnabled(false);
        jTextField_DataVencimento.setEnabled(false);
        jTextField_ValorPagamento.setEnabled(false);
        jTextField_Situacao.setEnabled(false);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_CadastrarBoletoBancoDadosActionPerformed

    private void jButton_ExcluirBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirBoletoActionPerformed
        try {
            int selectedRow = jTable_Tabela.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Selecione um boleto na tabela para excluir.");
                return;
            }

            DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();
            int idboleto = (int) tableModel.getValueAt(selectedRow, 0);

            MySQLData mySQLData = new MySQLData();
            String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();

            if (empresaSelecionada == null || empresaSelecionada.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione uma empresa primeiro.");
                return;
            }

            // Chamar o método apropriado com base na empresa selecionada
            switch (empresaSelecionada) {
                case "Avon" -> {
                    mySQLData.excluirBoletoAvon(tableModel, idboleto);
                    mySQLData.atualizarTabelaAvon(tableModel);
                }
                case "Boticário" -> {
                    mySQLData.excluirBoletoBoticario(tableModel, idboleto);
                    mySQLData.atualizarTabelaBoticario(tableModel);
                }
                case "Eudora" -> {
                    mySQLData.excluirBoletoEudora(tableModel, idboleto);
                    mySQLData.atualizarTabelaEudora(tableModel);
                }
                case "Golfran" -> {
                    mySQLData.excluirBoletoGolfran(tableModel, idboleto);
                    mySQLData.atualizarTabelaGolfran(tableModel);
                }
                case "Natura" -> {
                    mySQLData.excluirBoletoNatura(tableModel, idboleto);
                    mySQLData.atualizarTabelaNatura(tableModel);
                }
            }

            // Após a atualização dos dados no tableModel, notifique a tabela para atualizar a exibição
            tableModel.fireTableDataChanged();
            JOptionPane.showMessageDialog(this, "Boleto excluído com sucesso!");
        } catch (HeadlessException ex) {
            Logger.getLogger(ThirdWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_ExcluirBoletoActionPerformed

    private void jButton_LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparCamposActionPerformed
        jTextField_Cedente.setText("");
        jTextField_CodigoBarras.setText("");
        jTextField_DataVencimento.setText("");
        jTextField_ValorPagamento.setText("");
        jTextField_Situacao.setText("");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_LimparCamposActionPerformed

    private void jComboBox_EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EmpresasActionPerformed
        String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();
        carregarBoletosNaTabela(empresaSelecionada);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jComboBox_EmpresasActionPerformed

    private void Button_NovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NovoCadastroActionPerformed
        jTextField_Cedente.setEnabled(true);
        jTextField_CodigoBarras.setEnabled(true);
        jTextField_DataVencimento.setEnabled(true);
        jTextField_ValorPagamento.setEnabled(true);
        jTextField_Situacao.setEnabled(true);

        // Limpar os campos ou definir valores padrão
        jTextField_Cedente.setText("");
        jTextField_CodigoBarras.setText("");
        jTextField_DataVencimento.setText("");
        jTextField_ValorPagamento.setText("");
        jTextField_Situacao.setText("");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_Button_NovoCadastroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_NovoCadastro;
    private javax.swing.JButton jButton_CadastrarBoletoBancoDados;
    private javax.swing.JButton jButton_ExcluirBoleto;
    private javax.swing.JButton jButton_LimparCampos;
    private javax.swing.JComboBox<String> jComboBox_Empresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_DataHoraAtualSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_Cedente;
    private javax.swing.JTextField jTextField_CodigoBarras;
    private javax.swing.JTextField jTextField_DataVencimento;
    private javax.swing.JTextField jTextField_Situacao;
    private javax.swing.JTextField jTextField_ValorPagamento;
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
}
