package org.farmacia.repositories;

import org.farmacia.entities.Representante;
import org.farmacia.entities.Substancia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Repositório de Representante: Armazena Representante em memória em uma ArrayList
public class RepresentanteRepository {

     static ArrayList<Representante> representantes = new ArrayList<>();

    //save(Representante):void -> Adiciona Representante ao banco de dados
    public static void save(Representante representante) {
        representantes.add(representante);
    }

    //encontrarPorNome(String nome): ArrayList<Representante> -> Pesquisa por um nome e retorna Representante com este nome
    public ArrayList<Representante> encontrarPorNome(String nome) {
        ArrayList<Representante> representantesPesquisados = new ArrayList<>();
        for (Representante representante : representantes) {
            if (Objects.equals(representante.getNome_representante(), nome)) {
                representantesPesquisados.add(representante);
            }
        }
        return representantesPesquisados;
    }

    //encontrarTodosRepresentantes: ArrayList<Representante> -> retorna toda a lista de representas
    public ArrayList<Representante> encontrarTodosRepresentantes() {
        return this.representantes;
    }

    //atualizar represente - atraves do nome do representante pode-se alterar seu nome e seu telefone
    public void atualizarRepresentante(String nome, String novoNome, int novoTelefone) {
        ArrayList<Representante> representantesPesquisados = encontrarPorNome(nome);
        for (Representante representante : representantesPesquisados) {
            representante.setNome_representante(novoNome);
            representante.setTelefone(novoTelefone);
        }
    }

    //remover represente - do nome do represenate ele pode ser removido
    public void removerRepresentante(String nome) {
        ArrayList<Representante> representantesPesquisados = encontrarPorNome(nome);
        for (Representante representante : representantesPesquisados) {
            representantes.remove(representante);
        }
    }
}
