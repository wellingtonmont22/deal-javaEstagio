package main.java.entity;

public class Clientes {

    private String nome;
    // private String endereco;
    private String rg;
    private String cpf;
    private int id;

    public Clientes( String nome, String rg, String cpf, int id) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.id= id;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getRg() { return rg; }

    public void setRg(String rg) { this.rg = rg; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public int getid() {return id;}
    
    public void setId(int id) {this.id = id;}

}
