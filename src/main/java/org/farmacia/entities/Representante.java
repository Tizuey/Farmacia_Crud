package org.farmacia.entities;

// aqui é a classe de Representante no qual se criara o objeto
public class Representante {
    public String nome_representante ;
    public int telefone ;

    // o seu contrutor que cria o objeto
    public Representante(String nome_representante, int telefone) {
        this.nome_representante = nome_representante;
        this.telefone = telefone;
    }
    // os get e setter que são utilizados para manipular os atributos do objeto
    public String getNome_representante() {
        return nome_representante;
    }

    public void setNome_representante(String nome_representante) {
        this.nome_representante = nome_representante;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    // trata a resposta , trazendo  os atributos do objeto
    @Override
    public String toString() {
        return "Representante{" +
                "nome_representante = '" + nome_representante + '\'' +
                ", telefone = " + telefone +
                '}';
    }
}
