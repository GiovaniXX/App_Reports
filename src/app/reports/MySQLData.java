package app.reports;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MySQLData {

    public Connection cnn;

    public MySQLData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/appreports";
            String user = "root";
            String password = "xyx355@$Y";
            cnn = DriverManager.getConnection(dbUrl, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //----------CADASTRAMENTO-----------//
    public void cadastrarInformacoesAvon(String produto, BigDecimal preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, String formaPagamento, BigDecimal valorPagamento, String situacao) {
        String query = "INSERT INTO avon (produto, preco, categoria, cedente, codigo_barras, data_vencimento, forma_pagamento, valor_pagamento, situacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setBigDecimal(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setString(7, formaPagamento);
            statement.setBigDecimal(8, valorPagamento);
            statement.setString(9, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesBoticario(String produto, BigDecimal preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, String formaPagamento, BigDecimal valorPagamento, String situacao) {
        String query = "INSERT INTO boticario (produto, preco, categoria, cedente, codigo_barras, data_vencimento, forma_pagamento, valor_pagamento, situacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setBigDecimal(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setString(7, formaPagamento);
            statement.setBigDecimal(8, valorPagamento);
            statement.setString(9, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesEudora(String produto, BigDecimal preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, String formaPagamento, BigDecimal valorPagamento, String situacao) {
        String query = "INSERT INTO eudora (produto, preco, categoria, cedente, codigo_barras, data_vencimento, forma_pagamento, valor_pagamento, situacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setBigDecimal(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setString(7, formaPagamento);
            statement.setBigDecimal(8, valorPagamento);
            statement.setString(9, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesNatura(String produto, BigDecimal preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, String formaPagamento, BigDecimal valorPagamento, String situacao) {
        String query = "INSERT INTO natura (produto, preco, categoria, cedente, codigo_barras, data_vencimento, forma_pagamento, valor_pagamento, situacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setBigDecimal(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setString(7, formaPagamento);
            statement.setBigDecimal(8, valorPagamento);
            statement.setString(9, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //----------EXCLUSÃO---------//
    public void excluirBoletoAvon(DefaultTableModel tableModel, int idboleto) {
        try (PreparedStatement statement = cnn.prepareStatement("DELETE FROM avon WHERE idboleto = ?")) {
            statement.setInt(1, idboleto);
            statement.executeUpdate();
            // Atualize a tabela após a exclusão do boleto
            atualizarTabelaAvon(tableModel);
        } catch (SQLException e) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void excluirBoletoBoticario(DefaultTableModel tableModel, int idboleto) {
        try (PreparedStatement statement = cnn.prepareStatement("DELETE FROM boticario WHERE idboleto = ?")) {
            statement.setInt(1, idboleto);
            statement.executeUpdate();
            // Atualize a tabela após a exclusão do boleto
            atualizarTabelaBoticario(tableModel);
        } catch (SQLException e) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void excluirBoletoEudora(DefaultTableModel tableModel, int idboleto) {
        try (PreparedStatement statement = cnn.prepareStatement("DELETE FROM eudora WHERE idboleto = ?")) {
            statement.setInt(1, idboleto);
            statement.executeUpdate();
            // Atualize a tabela após a exclusão do boleto
            atualizarTabelaEudora(tableModel);
        } catch (SQLException e) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void excluirBoletoNatura(DefaultTableModel tableModel, int idboleto) {
        try (PreparedStatement statement = cnn.prepareStatement("DELETE FROM natura WHERE idboleto = ?")) {
            statement.setInt(1, idboleto);
            statement.executeUpdate();
            // Atualize a tabela após a exclusão do boleto
            atualizarTabelaNatura(tableModel);
        } catch (SQLException e) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //----------ATUALIZAÇÃO--------//
    public void atualizarTabelaAvon(DefaultTableModel tableModel) {
        // Consulte o banco de dados para obter os registros da tabela avon e atualize o modelo da tabela
        String query = "SELECT * FROM avon";
        atualizarTabela(query, tableModel);
    }

    public void atualizarTabelaBoticario(DefaultTableModel tableModel) {
        // Consulte o banco de dados para obter os registros da tabela boticario
        String query = "SELECT * FROM boticario";
        atualizarTabela(query, tableModel);
    }

    public void atualizarTabelaNatura(DefaultTableModel tableModel) {
        // Consulte o banco de dados para obter os registros da tabela natura
        String query = "SELECT * FROM natura";
        atualizarTabela(query, tableModel);
    }

    public void atualizarTabelaEudora(DefaultTableModel tableModel) {
        // Consulte o banco de dados para obter os registros da tabela eudora
        String query = "SELECT * FROM eudora";
        atualizarTabela(query, tableModel);
    }

    //--------------------------MÉTODOS--------------------------------------//
    private void atualizarTabela(String query, DefaultTableModel tableModel) {
        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            tableModel.setRowCount(0);

            while (resultSet.next()) {
                int idboleto = resultSet.getInt("idboleto");
                String produto = resultSet.getString("produto");
                BigDecimal preco = resultSet.getBigDecimal("preco");
                String categoria = resultSet.getString("categoria");
                String cedente = resultSet.getString("cedente");
                String codigoBarras = resultSet.getString("codigo_barras");
                Date dataVencimento = resultSet.getDate("data_vencimento");
                BigDecimal valorPagamento = resultSet.getBigDecimal("valor_pagamento");
                String formaPagamento = resultSet.getString("forma_pagamento");
                String situacao = resultSet.getString("situacao");

                Object[] rowData = {idboleto, produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, formaPagamento, situacao};
                tableModel.addRow(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void carregarBoletosNaTabela(String query, DefaultTableModel tableModel) {
        try {
            tableModel.setRowCount(0);

            PreparedStatement statement = cnn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idboleto = resultSet.getInt("idboleto");
                String produto = resultSet.getString("produto");
                BigDecimal preco = resultSet.getBigDecimal("preco");
                String categoria = resultSet.getString("categoria");
                String cedente = resultSet.getString("cedente");
                String codigoBarras = resultSet.getString("codigo_barras");
                Date dataVencimento = resultSet.getDate("data_vencimento");
                BigDecimal valorPagamento = resultSet.getBigDecimal("valor_pagamento");
                String formaPagamento = resultSet.getString("forma_pagamento");
                String situacao = resultSet.getString("situacao");

                Object[] rowData = {idboleto, produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, formaPagamento, situacao};
                tableModel.addRow(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //-------------------------CADASTRAMENTO DE CLIENTE---------------------//   
    public void cadastrarCliente(String nome, String telefone) {
        String query = "INSERT INTO clientes (nome, telefone) VALUES (?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, nome);
            statement.setString(2, telefone);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //----------EDIÇÃO DE CLIENTE-----------//
    public void editarCliente(int idCliente, String novoNome, String novoTelefone) {
        String query = "UPDATE clientes SET nome = ?, telefone = ? WHERE idcliente = ?";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, novoNome);
            statement.setString(2, novoTelefone);
            statement.setInt(3, idCliente);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //----------EXCLUSÃO DE CLIENTE-----------//
    public void excluirCliente(int idCliente) {
        String query = "DELETE FROM clientes WHERE idcliente = ?";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setInt(1, idCliente);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String> telefonesClientes() {
        List<String> telefones = new ArrayList<>();

        String query = "SELECT telefone FROM clientes";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String telefone = resultSet.getString("telefone");
                telefones.add(telefone);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return telefones;
    }

    public void atualizarTabelaClientes(String query, DefaultTableModel tableModel) {
        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            tableModel.setRowCount(0);

            while (resultSet.next()) {
                int id = resultSet.getInt("idcliente");
                String nome = resultSet.getString("nome");
                String telefone = resultSet.getString("telefone");

                Object[] rowData = {id, nome, telefone};
                tableModel.addRow(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void carregarClientesNaTabela(String query, DefaultTableModel tableModel) {
        try {
            tableModel.setRowCount(0);

            PreparedStatement statement = cnn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idcliente = resultSet.getInt("idcliente");
                String nome = resultSet.getString("nome");
                String telefone = resultSet.getString("telefone");

                Object[] rowData = {idcliente, nome, telefone};
                tableModel.addRow(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
