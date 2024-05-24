package org.farmacia.entities;

import java.time.LocalDate;

// aqui é a classe de remedio no qual se criara o objeto
public class Remedio extends Substancia {
    public String nome_remedio;
    public LocalDate data_vencimento;
    public int quantidade;
    public float concentracao;
    public Farmaceutica farmaceutica;
    // o seu contrutor que cria o objeto
    public Remedio(Tipo tipo, String nome, String nome_remedio, LocalDate data_vencimento, int quantidade, float concentracao, Farmaceutica farmaceutica) {
        super(tipo, nome);
        this.nome_remedio = nome_remedio;
        this.data_vencimento = data_vencimento;
        this.quantidade = quantidade;
        this.concentracao = concentracao;
        this.farmaceutica = farmaceutica;
    }
    // os get e setter que são utilizados para manipular os atributos do objeto
    public String getNome_remedio() {
        return nome_remedio;
    }

    public void setNome_remedio(String nome_remedio) {
        this.nome_remedio = nome_remedio;
    }

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(float concentracao) {
        this.concentracao = concentracao;
    }

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }


    public void setFarmaceutica(Farmaceutica farmaceutica) {
        this.farmaceutica = farmaceutica;
    }
    // trata a resposta , trazendo  os atributos do objeto
    @Override
    public String toString() {
        return "Remedio{" +
                "nome_remedio='" + nome_remedio + '\'' +
                ", data_vencimento=" + data_vencimento +
                ", quantidade=" + quantidade +
                ", concentracao=" + concentracao +
                ", farmaceutica=" + farmaceutica +
                ", meuTipo=" + meuTipo +
                ", nome_substancia='" + nome_substancia + '\'' +
                '}';
    }
}

