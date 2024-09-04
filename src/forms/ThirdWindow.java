package forms;

import app.reports.MySQLData;
import app.reports.Util;
import static app.reports.Util.convertStringToString;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
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
import raven.toast.Notifications;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel_DataHoraAtualSistema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_Empresas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Situacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Produto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Preco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Categoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox_Pagamento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextField_MarcaId = new javax.swing.JTextField();
        myButton_NovoCadastro = new customization.Button();
        myButton_CadastrarBoletoBancoDados = new customization.Button();
        myButton_LimparCampos = new customization.Button();
        myButton_ExcluirBoleto = new customization.Button();

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

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Boleto", "Produto", "Preco", "Categoria", "Cedente", "Código Barras", "Data Vencimento", "Valor Pagamento", "Forma Pagamento", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
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

        jLabel5.setText("Data e Hora Atual.:");

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jLabel6.setText("Empresas.:");

        jComboBox_Empresas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Boticário", "Natura", "Eudora", "Avon" }));
        jComboBox_Empresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_EmpresasActionPerformed(evt);
            }
        });

        jLabel7.setText("Situação.:");

        jTextField_Situacao.setEnabled(false);

        jLabel8.setText("Produto.:");

        jTextField_Produto.setEnabled(false);

        jLabel9.setText("Preço.:");

        jTextField_Preco.setEnabled(false);

        jLabel10.setText("Categoria.:");

        jTextField_Categoria.setEnabled(false);

        jLabel11.setText("Forma Pagamento.:");

        jComboBox_Pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a forma de pagamento", "A vista", "1x", "2x", "3x", "4x", "Pix" }));

        jLabel12.setText("Marca.:");
        jLabel12.setEnabled(false);

        jTextField_MarcaId.setEnabled(false);

        myButton_NovoCadastro.setText("Novo Cadastro");
        myButton_NovoCadastro.setColor(new java.awt.Color(204, 0, 0));
        myButton_NovoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_NovoCadastro.setRadius(45);
        myButton_NovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_NovoCadastroActionPerformed(evt);
            }
        });

        myButton_CadastrarBoletoBancoDados.setText("Cadastrar Boleto Banco de Dados");
        myButton_CadastrarBoletoBancoDados.setColor(new java.awt.Color(204, 0, 0));
        myButton_CadastrarBoletoBancoDados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_CadastrarBoletoBancoDados.setRadius(45);
        myButton_CadastrarBoletoBancoDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_CadastrarBoletoBancoDadosActionPerformed(evt);
            }
        });

        myButton_LimparCampos.setText("Limpar Campos");
        myButton_LimparCampos.setColor(new java.awt.Color(204, 0, 0));
        myButton_LimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_LimparCampos.setRadius(45);
        myButton_LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_LimparCamposActionPerformed(evt);
            }
        });

        myButton_ExcluirBoleto.setText("Excluir Boleto");
        myButton_ExcluirBoleto.setColor(new java.awt.Color(204, 0, 0));
        myButton_ExcluirBoleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton_ExcluirBoleto.setRadius(45);
        myButton_ExcluirBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton_ExcluirBoletoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_MarcaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(myButton_NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(myButton_CadastrarBoletoBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(myButton_LimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(myButton_ExcluirBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_CodigoBarras)
                                            .addComponent(jTextField_Cedente, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField_DataVencimento))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField_ValorPagamento)))
                                        .addGap(191, 191, 191))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_MarcaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myButton_ExcluirBoleto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(myButton_LimparCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myButton_CadastrarBoletoBancoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myButton_NovoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_EmpresasActionPerformed
        String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();
        carregarBoletosNaTabela(empresaSelecionada);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jComboBox_EmpresasActionPerformed

    private void myButton_NovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_NovoCadastroActionPerformed
        jTextField_Produto.setEnabled(true);
        jTextField_Preco.setEnabled(true);
        jTextField_Categoria.setEnabled(true);
        jTextField_Cedente.setEnabled(true);
        jTextField_CodigoBarras.setEnabled(true);
        jTextField_DataVencimento.setEnabled(true);
        jComboBox_Pagamento.setEnabled(true);
        jTextField_ValorPagamento.setEnabled(true);
        jTextField_Situacao.setEnabled(true);

        // Limpar os campos ou definir valores padrão
        jTextField_Produto.setText("");
        jTextField_Preco.setText("");
        jTextField_Categoria.setText("");
        jTextField_Cedente.setText("");
        jTextField_CodigoBarras.setText("");
        jTextField_DataVencimento.setText("");
        jComboBox_Pagamento.setSelectedItem(0);
        jTextField_ValorPagamento.setText("");
        jTextField_Situacao.setText("");

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
        System.out.println("Evento executado com sucesso.!");
    }//GEN-LAST:event_myButton_NovoCadastroActionPerformed

    private void myButton_CadastrarBoletoBancoDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_CadastrarBoletoBancoDadosActionPerformed
        try {
            // Verifica se todos os campos obrigatórios estão preenchidos
            if (jTextField_Produto.getText().isEmpty()
                    || jTextField_Preco.getText().isEmpty()
                    || jTextField_Categoria.getText().isEmpty()
                    || jTextField_Cedente.getText().isEmpty()
                    || jTextField_CodigoBarras.getText().isEmpty()
                    || jTextField_DataVencimento.getText().isEmpty()
                    || jTextField_ValorPagamento.getText().isEmpty()
                    || jComboBox_Pagamento.getSelectedItem() == null
                    || jTextField_Situacao.getText().isEmpty()) {

                // Exibe notificação de aviso
                Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, insira as informações necessárias para o cadastro no Banco de Dados.!");
                return; // Interrompe a execução se alguma condição não for atendida
            }

            String produto = jTextField_Produto.getText();
            BigDecimal preco = new BigDecimal(jTextField_Preco.getText().replace(",", "."));
            String categoria = jTextField_Categoria.getText();
            String cedente = jTextField_Cedente.getText();
            String codigoBarras = convertStringToString(Util.extractFormattedNumber(jTextField_CodigoBarras.getText()));
            //Date dataVencimento = Util.convertStringToDate(jTextField_DataVencimento.getText());
            java.sql.Date dataVencimento = Util.convertStringToDate2(jTextField_DataVencimento.getText());
            BigDecimal valorPagamento = new BigDecimal(Util.convertStringToDouble(jTextField_ValorPagamento.getText()));
            String formaPagamento = Util.objectToString(jComboBox_Pagamento.getSelectedItem());
            String situacao = jTextField_Situacao.getText();

            MySQLData mySQLData = new MySQLData();

            // Obter a opção selecionada no jComboBox_Empresas
            String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();

            // Verificar se nenhuma empresa foi selecionada
            if (empresaSelecionada == null || empresaSelecionada.isEmpty()) {
                // Exibir mensagem de erro ao usuário
                Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, Por favor, selecione uma empresa.!");
                //JOptionPane.showMessageDialog(this, "Selecione uma empresa antes de cadastrar o boleto.");
                return;
            }

            // Chamar o método apropriado com base na empresa selecionada
            switch (empresaSelecionada) {
                case "Avon" -> {
                    mySQLData.cadastrarInformacoesAvon(produto, preco, categoria, cedente, codigoBarras, dataVencimento, formaPagamento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaAvon((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Boticário" -> {
                    mySQLData.cadastrarInformacoesBoticario(produto, preco, categoria, cedente, codigoBarras, dataVencimento, formaPagamento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaBoticario((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Eudora" -> {
                    mySQLData.cadastrarInformacoesEudora(produto, preco, categoria, cedente, codigoBarras, dataVencimento, formaPagamento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaEudora((DefaultTableModel) jTable_Tabela.getModel());
                }
                case "Natura" -> {
                    mySQLData.cadastrarInformacoesNatura(produto, preco, categoria, cedente, codigoBarras, dataVencimento, formaPagamento, valorPagamento, situacao);
                    mySQLData.atualizarTabelaNatura((DefaultTableModel) jTable_Tabela.getModel());
                }
            }
            // Exibir mensagem de sucesso ao usuário
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Boleto cadastrado com sucesso.!");
        } catch (ParseException ex) {
            Logger.getLogger(SecondWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField_Produto.setEnabled(false);
        jTextField_Preco.setEnabled(false);
        jTextField_Categoria.setEnabled(false);
        jTextField_Cedente.setEnabled(false);
        jTextField_CodigoBarras.setEnabled(false);
        jTextField_DataVencimento.setEnabled(false);
        jComboBox_Pagamento.setEnabled(false);
        jTextField_ValorPagamento.setEnabled(false);
        jTextField_Situacao.setEnabled(false);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_myButton_CadastrarBoletoBancoDadosActionPerformed

    private void myButton_LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_LimparCamposActionPerformed
        boolean camposPreenchidos = !jTextField_Produto.getText().isEmpty()
                || !jTextField_Preco.getText().isEmpty()
                || !jTextField_Categoria.getText().isEmpty()
                || !jTextField_Cedente.getText().isEmpty()
                || !jTextField_CodigoBarras.getText().isEmpty()
                || !jTextField_DataVencimento.getText().isEmpty()
                || !jTextField_ValorPagamento.getText().isEmpty()
                || !jTextField_Situacao.getText().isEmpty();

        // Se houver campos preenchidos, limpa e exibe a mensagem de sucesso
        if (camposPreenchidos) {
            jTextField_Produto.setText("");
            jTextField_Preco.setText("");
            jTextField_Categoria.setText("");
            jTextField_Cedente.setText("");
            jTextField_CodigoBarras.setText("");
            jTextField_DataVencimento.setText("");
            jTextField_ValorPagamento.setText("");
            jTextField_Situacao.setText("");

            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Dados limpos com sucesso.!");
        } else {
            // Caso contrário, exibe a mensagem informando que não havia dados para limpar
            Notifications.getInstance().show(Notifications.Type.WARNING, "Não há dados para limpar.!");
        }

        // Imprime o ID do evento no console (opcional)
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_myButton_LimparCamposActionPerformed

    private void myButton_ExcluirBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton_ExcluirBoletoActionPerformed
        try {
            // Verifica se a empresa selecionada é válida (diferente da opção padrão)
            String empresaSelecionada = (String) jComboBox_Empresas.getSelectedItem();
            if (empresaSelecionada == null || empresaSelecionada.equals("Selecione uma opção")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, selecione uma empresa primeiro.!");
                return;
            }

            DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();

            // Verifica se a tabela contém dados
            if (tableModel.getRowCount() == 0) {
                Notifications.getInstance().show(Notifications.Type.WARNING, "Não há dados na tabela para serem excluídos.!");
                return;
            }

            int selectedRow = jTable_Tabela.getSelectedRow();
            if (selectedRow == -1) {
                Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, selecione um registro na tabela para excluir.!");
                return;
            }

            int idboleto = (int) tableModel.getValueAt(selectedRow, 0);
            MySQLData mySQLData = new MySQLData();

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
                case "Natura" -> {
                    mySQLData.excluirBoletoNatura(tableModel, idboleto);
                    mySQLData.atualizarTabelaNatura(tableModel);
                }
            }

            // Após a atualização dos dados no tableModel, notifique a tabela para atualizar a exibição
            tableModel.fireTableDataChanged();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Boleto excluído com sucesso.!");
        } catch (HeadlessException ex) {
            Logger.getLogger(ThirdWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_myButton_ExcluirBoletoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_Empresas;
    private javax.swing.JComboBox<String> jComboBox_Pagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_DataHoraAtualSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_Categoria;
    private javax.swing.JTextField jTextField_Cedente;
    private javax.swing.JTextField jTextField_CodigoBarras;
    private javax.swing.JTextField jTextField_DataVencimento;
    private javax.swing.JTextField jTextField_MarcaId;
    private javax.swing.JTextField jTextField_Preco;
    private javax.swing.JTextField jTextField_Produto;
    private javax.swing.JTextField jTextField_Situacao;
    private javax.swing.JTextField jTextField_ValorPagamento;
    private customization.Button myButton_CadastrarBoletoBancoDados;
    private customization.Button myButton_ExcluirBoleto;
    private customization.Button myButton_LimparCampos;
    private customization.Button myButton_NovoCadastro;
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
}
