package org.farmacia.repositories;

import org.farmacia.entities.Farmaceutica;
import org.farmacia.entities.Remedio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

// Repositório de Remédios: Armazena remédios em memória em uma ArrayList
public class RemedioRepository {

    private static ArrayList<Remedio> remedios = new ArrayList<>();

    //save(Remedio):void -> Adiciona remédio ao banco de dados
    public static void save(Remedio remedio) {
        remedios.add(remedio);
    }

    //encontrarPorNome(String nome): ArrayList<Remedio> -> Pesquisa por um nome e retorna remédios com este nome
    public static ArrayList<Remedio> encontrarPorNome(String nome) {
        ArrayList<Remedio> remediosPesquisados = new ArrayList<>();
        for (Remedio remedio : remedios) {
            if (Objects.equals(remedio.nome_remedio.toLowerCase(), nome.toLowerCase())) {
                remediosPesquisados.add(remedio);
            }
        }
        return remediosPesquisados;
    }

    // encontrarPorValidade(Date validade): ArrayList<Remedio> -> Pesquisa por uma data e retorna remédios com esta validade
    public static ArrayList<Remedio> encontrarPorValidade(LocalDate validade) {
        ArrayList<Remedio> remediosPesquisados = new ArrayList<>();
        for (Remedio remedio : remedios) {
            if (Objects.equals(remedio.data_vencimento, validade)) {
                remediosPesquisados.add(remedio);
            }
        }
        return remediosPesquisados;
    }

    // encontrarPorFarmaceutica(Strin farmaceutica): ArrayList<Remedio> -> Pesquisa por uma farmaceutica e retorna remédios desta farmaceutica
    public static ArrayList<Remedio> encontrarPorFarmaceutica(String farmaceutica) {
        ArrayList<Remedio> remediosPesquisados = new ArrayList<>();
        for (Remedio remedio : remedios) {
            if (Objects.equals(remedio.farmaceutica.nome_farmaceutica.toLowerCase(), farmaceutica.toLowerCase())) {
                remediosPesquisados.add(remedio);
            }
        }
        return remediosPesquisados;
    }

    // encontrarTodosRemedios(): ArrayList<Remedio> -> Retorna todos remédios cadastrados,
    public static ArrayList<Remedio> encontrarTodosRemedios() {
        return remedios;
    }

    //atualizarRemedio(String nome, String farmaceutica, String novoNome, Date dataVencimento, int quantidade,float concentracao, Farmaceutica novaFarmaceutica): void -> Atualiza remédio x de farmaceutica y com os dados passados.
    public static void atualizarRemedio(String nome, String farmaceutica, String novoNome, LocalDate dataVencimento, int quantidade,
                                 float concentracao, Farmaceutica novaFarmaceutica) {
        ArrayList<Remedio> remediosPesquisados = encontrarPorNome(nome);
        for (Remedio remedio : remediosPesquisados) {
            if (Objects.equals(remedio.farmaceutica.nome_farmaceutica.toLowerCase(), farmaceutica.toLowerCase())) {
                remedio.setNome_remedio(novoNome);
                remedio.setData_vencimento(dataVencimento);
                remedio.setQuantidade(quantidade);
                remedio.setConcentracao(concentracao);
                remedio.setFarmaceutica(novaFarmaceutica);
            } else {
                System.out.println("Remédio não encontrado.");
            }
        }
    }

    //removerRemedio(String nome, String farmaceutica): void -> Remove remédio x de farmaceutica y do sistema.
    public static void removerRemedio(String nome, String farmaceutica) {
        ArrayList<Remedio> remediosPesquisados = encontrarPorNome(nome);
        for (Remedio remedio : remediosPesquisados) {
            if (Objects.equals(remedio.farmaceutica.nome_farmaceutica.toLowerCase(), farmaceutica.toLowerCase())) {
                remedios.remove(remedio);
            } else {
                System.out.println("Remédio não encontrado.");
            }
        }
    }
    public static ArrayList<Remedio> encontrarPorSubstancia(String substancia) {
        ArrayList<Remedio> remediosEncontrados = new ArrayList<>();
        for (Remedio remedio : remedios) {
            if (remedio.getNome().equalsIgnoreCase(substancia)) {
                remediosEncontrados.add(remedio);
            }
        }
        return remediosEncontrados;
    }


}
