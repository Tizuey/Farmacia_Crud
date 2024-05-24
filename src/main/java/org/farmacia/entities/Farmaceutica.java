package org.farmacia.entities;

// aqui é a classe de Farmaceutica no qual se criara o objeto
public class Farmaceutica extends Representante{

    public String nome_farmaceutica;
// o seu contrutor que cria o objeto
    public Farmaceutica(String nome_representante, int telefone, String nome_farmaceutica) {
        super(nome_representante, telefone);
        this.nome_farmaceutica = nome_farmaceutica;
    }
    // os get e setter que são utilizados para manipular os atributos do objeto
    public String getNome_farmaceutica() {
        return nome_farmaceutica;
    }

    public void setNome_farmaceutica(String nome_farmaceutica) {
        this.nome_farmaceutica = nome_farmaceutica;
    }

    // trata a resposta , trazendo  os atributos do objeto
    @Override
    public String toString() {
        return "Farmaceutica{" +
                "nome_farmaceutica='" + nome_farmaceutica + '\'' +
                ", nome_representante='" + nome_representante + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
