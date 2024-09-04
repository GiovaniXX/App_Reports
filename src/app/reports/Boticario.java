package app.reports;

import java.math.BigDecimal;
import java.util.Date;

public class Boticario {

    private int idboleto;
    private String produto;
    private BigDecimal preco;
    private String categoria;
    private String Cedente;
    private double codigoBarras;
    private Date dataVencimento;
    private String formaPagamento;
    private BigDecimal valorPagamento;
    private String situacao;

    public Boticario(int idboleto, String produto, BigDecimal preco, String categoria, String Cedente, double codigoBarras, Date dataVencimento, String formaPagamento, BigDecimal valorPagamento, String situacao) {
        this.idboleto = idboleto;
        this.produto = produto;
        this.preco = preco;
        this.categoria = categoria;
        this.Cedente = Cedente;
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
        this.formaPagamento = formaPagamento;
        this.valorPagamento = valorPagamento;
        this.situacao = situacao;
    }

    public int getIdboleto() {
        return idboleto;
    }

    public void setIdboleto(int idboleto) {
        this.idboleto = idboleto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCedente() {
        return Cedente;
    }

    public void setCedente(String Cedente) {
        this.Cedente = Cedente;
    }

    public double getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(double codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(BigDecimal valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
