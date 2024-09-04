package app.reports;

public class Cliente {

    private int idclientes;
    private String nome;
    private String telefone;

    public Cliente(int idclientes, String nome, String telefone) {
        this.idclientes = idclientes;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
