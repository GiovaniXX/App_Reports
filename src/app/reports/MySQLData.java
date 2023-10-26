package app.reports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
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
            String password = "xyx387@$$gVc";
            cnn = DriverManager.getConnection(dbUrl, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //----------CADASTRAMENTO-----------//
    public void cadastrarInformacoesAvon(String produto, float preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, float valorPagamento, String situacao) {
        String query = "INSERT INTO avon (produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, situacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setFloat(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setFloat(7, valorPagamento);
            statement.setString(8, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesBoticario(String produto, float preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, float valorPagamento, String situacao) {
        String query = "INSERT INTO boticario (produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, situacao) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setFloat(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setFloat(7, valorPagamento);
            statement.setString(8, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesEudora(String produto, float preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, float valorPagamento, String situacao) {
        String query = "INSERT INTO eudora (produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, situacao) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setFloat(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setFloat(7, valorPagamento);
            statement.setString(8, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesGolfran(String produto, float preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, float valorPagamento, String situacao) {
        String query = "INSERT INTO golfran (produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, situacao) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setFloat(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setFloat(7, valorPagamento);
            statement.setString(8, situacao);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarInformacoesNatura(String produto, float preco, String categoria, String cedente, String codigoBarras, Date dataVencimento, float valorPagamento, String situacao) {
        String query = "INSERT INTO natura (produto, preco, categoria, cedente, codigoBarras, dataVencimento, valorPagamento, situacao) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = cnn.prepareStatement(query);
            statement.setString(1, produto);
            statement.setFloat(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, cedente);
            statement.setString(5, codigoBarras);
            statement.setDate(6, new java.sql.Date(dataVencimento.getTime()));
            statement.setFloat(7, valorPagamento);
            statement.setString(8, situacao);
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

    public void excluirBoletoGolfran(DefaultTableModel tableModel, int idboleto) {
        try (PreparedStatement statement = cnn.prepareStatement("DELETE FROM golfran WHERE idboleto = ?")) {
            statement.setInt(1, idboleto);
            statement.executeUpdate();
            // Atualize a tabela após a exclusão do boleto
            atualizarTabelaGolfran(tableModel);
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

    public void atualizarTabelaGolfran(DefaultTableModel tableModel) {
        // Consulte o banco de dados para obter os registros da tabela golfran
        String query = "SELECT * FROM golfran";
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
                String cedente = resultSet.getString("cedente");
                String codigoBarras = resultSet.getString("codigoBarras");
                Date dataVencimento = resultSet.getDate("dataVencimento");
                float valorPagamento = resultSet.getFloat("valorPagamento");
                String situacao = resultSet.getString("situacao");

                Object[] rowData = {idboleto, cedente, codigoBarras, dataVencimento, valorPagamento, situacao};
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
                String cedente = resultSet.getString("cedente");
                String codigoBarras = resultSet.getString("codigoBarras");
                Date dataVencimento = resultSet.getDate("dataVencimento");
                float valorPagamento = resultSet.getFloat("valorPagamento");
                String situacao = resultSet.getString("situacao");

                Object[] rowData = {idboleto, cedente, codigoBarras, dataVencimento, valorPagamento, situacao};
                tableModel.addRow(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public DefaultTableModel pesquisarNoBanco(String tabela, String coluna, String valor) {
//        DefaultTableModel tableModel = new DefaultTableModel();
//
//        String query = "SELECT * FROM " + tabela;
//        boolean hasCondition = false;
//
//        if (!coluna.isEmpty() && !valor.isEmpty()) {
//            if (coluna.equals("dataVencimento") && valor.equals("A vencer")) {
//                // Adicionar condição para boletos a vencer
//                query += " WHERE dataVencimento <= ?";
//                hasCondition = true;
//            } else if (coluna.equals("status") && valor.equals("Pagos")) {
//                // Adicionar condição para boletos pagos (data de pagamento um dia após a data de vencimento)
//                query += " WHERE dataVencimento <= DATE_ADD(CURDATE(), INTERVAL 1 DAY)";
//                hasCondition = true;
//            } else {
//                query += " WHERE " + coluna + " = ?";
//                hasCondition = true;
//            }
//        }
//
//        try {
//            try (PreparedStatement statement = cnn.prepareStatement(query)) {
//                if (hasCondition) {
//                    if (coluna.equals("dataVencimento") && valor.equals("A vencer")) {
//                        // Definir o valor com a data de vencimento atual
//                        Date dataVencimento = new Date();
//                        statement.setDate(1, new java.sql.Date(dataVencimento.getTime()));
//                    } else {
//                        statement.setString(1, valor);
//                    }
//                }
//
//                ResultSet resultSet = statement.executeQuery();
//
//                // Obtenha os metadados do ResultSet para criar as colunas do modelo da tabela
//                ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
//                int columnCount = metaData.getColumnCount();
//                for (int column = 1; column <= columnCount; column++) {
//                    tableModel.addColumn(metaData.getColumnLabel(column));
//                }
//
//                // Preencha o modelo da tabela com os dados do ResultSet
//                while (resultSet.next()) {
//                    Object[] rowData = new Object[columnCount];
//                    for (int column = 1; column <= columnCount; column++) {
//                        rowData[column - 1] = resultSet.getObject(column);
//                    }
//                    tableModel.addRow(rowData);
//                }
//
//                resultSet.close();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MySQLData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return tableModel;
//    }
}
