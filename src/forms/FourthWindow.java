package forms;

import app.reports.MySQLData;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

public class FourthWindow extends javax.swing.JInternalFrame {

    private final Timer timer;
    public Connection cnn;
    private final MySQLData mysqlData;

    public FourthWindow() {
        initComponents();
        timer = new Timer(1000, (ActionEvent e) -> {
            atualizarDataHoraAtual();
        });
        timer.start();
        atualizarDataHoraAtual();

        // Adicione ouvintes de eventos aos campos de texto
        jTextField_Nome.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                habilitarBotaoCadastrar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                habilitarBotaoCadastrar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                habilitarBotaoCadastrar();
            }
        });

        jTextField_Telefone.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                habilitarBotaoCadastrar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                habilitarBotaoCadastrar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                habilitarBotaoCadastrar();
            }
        });
        // Inicializa a instância da classe MySQLData
        mysqlData = new MySQLData();

        // Chama o método para preencher a tabela no construtor
        carregarClientesNaTabela();
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

        jLabel5 = new javax.swing.JLabel();
        jLabel_DataHoraAtualSistema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Telefone = new javax.swing.JTextField();
        jButton_CadastrarCliente = new javax.swing.JButton();
        jButton_EditarCliente = new javax.swing.JButton();
        jButton_DeletarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel5.setText("Data e Hora Atual.:");

        jLabel_DataHoraAtualSistema.setPreferredSize(new java.awt.Dimension(0, 16));

        jLabel8.setText("ID.:");
        jLabel8.setEnabled(false);

        jTextField_ID.setEnabled(false);

        jLabel9.setText("Nome.:");

        jLabel10.setText("Telefone.:");

        jButton_CadastrarCliente.setText("Cadastrar Cliente");
        jButton_CadastrarCliente.setEnabled(false);
        jButton_CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastrarClienteActionPerformed(evt);
            }
        });

        jButton_EditarCliente.setText("Editar Cliente");
        jButton_EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarClienteActionPerformed(evt);
            }
        });

        jButton_DeletarCliente.setText("Deletar Cliente");
        jButton_DeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeletarClienteActionPerformed(evt);
            }
        });

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Cliente", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable_Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_DataHoraAtualSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addGap(1387, 1387, 1387))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Nome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_CadastrarCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_DeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE)
                    .addContainerGap()))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CadastrarCliente)
                    .addComponent(jButton_EditarCliente)
                    .addComponent(jButton_DeletarCliente))
                .addContainerGap(864, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(209, 209, 209)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastrarClienteActionPerformed
        // Obtem o nome e telefone dos campos de texto
        String nome = jTextField_Nome.getText();
        String telefone = jTextField_Telefone.getText();

        // Verifica o formato do telefone
        String regex = "\\(\\d{2}\\) \\d \\d{4}-\\d{4}";
        if (!telefone.matches(regex)) {
            // Mostra uma notificação se o formato estiver incorreto
            Notifications.getInstance().show(Notifications.Type.WARNING, "Formato de telefone inválido. Use o formato (xx) x xxxx-xxxx");
            // Interrompe o processo de cadastro
            return;
        }

        // Verifica se os campos não estão vazios antes de cadastrar no banco de dados
        if (!nome.isEmpty() && !telefone.isEmpty()) {
            // Chama o método cadastrarCliente da instância mysqlData
            mysqlData.cadastrarCliente(nome, telefone);

            // Limpa os campos após o cadastro
            jTextField_Nome.setText("");
            jTextField_Telefone.setText("");

            // Atualiza a tabela com os novos registros
            String query = "SELECT idcliente, nome, telefone FROM clientes";
            DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();
            mysqlData.atualizarTabelaClientes(query, tableModel);
        } else {
            // Trate o caso em que os campos estão vazios ou exiba uma mensagem de erro           
            Notifications.getInstance().show(Notifications.Type.WARNING, "Mensagem aqui.!");
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_CadastrarClienteActionPerformed

    private void jButton_EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarClienteActionPerformed
        // Obtem a linha selecionada na tabela
        int selectedRow = jTable_Tabela.getSelectedRow();

        if (selectedRow >= 0) {
            // Obtem o ID do cliente a partir da tabela
            int idCliente = Integer.parseInt(jTable_Tabela.getValueAt(selectedRow, 0).toString());

            // Obtem os novos valores de nome e telefone dos campos de texto
            String novoNome = jTextField_Nome.getText();
            String novoTelefone = jTextField_Telefone.getText();

            // Verifica se os campos não estão vazios
            if (!novoNome.isEmpty() && !novoTelefone.isEmpty()) {
                // Verifica o formato do telefone antes de atualizar
                String regex = "\\(\\d{2}\\) \\d \\d{4}-\\d{4}";
                if (!novoTelefone.matches(regex)) {
                    // Mostra uma notificação se o formato estiver incorreto
                    Notifications.getInstance().show(Notifications.Type.WARNING, "Formato de telefone inválido. Use o formato (xx) x xxxx-xxxx.");
                    // Interrompa o processo de edição
                    return;
                }

                // Chama o método para atualizar os dados no banco de dados
                mysqlData.editarCliente(idCliente, novoNome, novoTelefone);

                // Atualiza a tabela com os novos registros
                String query = "SELECT idcliente, nome, telefone FROM clientes";
                DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();
                mysqlData.atualizarTabelaClientes(query, tableModel);

                // Mostra uma notificação de sucesso
                Notifications.getInstance().show(Notifications.Type.SUCCESS, "Cliente atualizado com sucesso.!");
            } else {
                // Notifica o usuário caso os campos estejam vazios
                Notifications.getInstance().show(Notifications.Type.WARNING, "Por favor, preencha os campos de nome e telefone.!");
            }
        } else {
            // Notifica o usuário caso nenhuma linha esteja selecionada
            Notifications.getInstance().show(Notifications.Type.WARNING, "Nenhum cliente selecionado para edição.!");
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_EditarClienteActionPerformed

    private void jButton_DeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletarClienteActionPerformed
        int idClienteParaExcluir = obterIDDoClienteASerExcluido();
        if (idClienteParaExcluir > 0) {
            MySQLData mysqlData = new MySQLData();
            mysqlData.excluirCliente(idClienteParaExcluir);
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Cliente excluído com sucesso.!");
        } else {
            Notifications.getInstance().show(Notifications.Type.WARNING, "Nenhum registro selecionado para a exclusão.!");
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jButton_DeletarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CadastrarCliente;
    private javax.swing.JButton jButton_DeletarCliente;
    private javax.swing.JButton jButton_EditarCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_DataHoraAtualSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Telefone;
    // End of variables declaration//GEN-END:variables

    private void habilitarBotaoCadastrar() {
        String nome = jTextField_Nome.getText();
        String telefone = jTextField_Telefone.getText();

        boolean camposPreenchidos = !nome.isEmpty() && !telefone.isEmpty();
        jButton_CadastrarCliente.setEnabled(camposPreenchidos);
    }

    private void carregarClientesNaTabela() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_Tabela.getModel();

        // Chama o método da instância mysqlData para preencher a tabela com registros de clientes
        mysqlData.carregarClientesNaTabela("SELECT idcliente, nome, telefone FROM clientes", tableModel);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable_Tabela.getColumnCount(); i++) {
            jTable_Tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private int obterIDDoClienteASerExcluido() {
        int selectedRow = jTable_Tabela.getSelectedRow();
        if (selectedRow >= 0) {
            try {
                int idCliente = Integer.parseInt(jTable_Tabela.getValueAt(selectedRow, 0).toString());
                return idCliente;
            } catch (NumberFormatException e) {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Erro ao obter o ID do cliente no Banco de Dados.!");
            }
        }
        return -1;
    }
}
