package org.farmacia.services;

import org.farmacia.entities.Representante;
import org.farmacia.entities.Substancia;
import org.farmacia.repositories.RepresentanteRepository;
import org.farmacia.repositories.SubstanciaRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class RepresentanteService {

	ArrayList<Representante> representantes = new ArrayList<>();

    public static void  cadastrarRepresentante(Scanner sc) {
        System.out.println("--- CADASTRO DE SUBSTANCIA ---");
        System.out.print("Digite o nome do Representante: ");
        String nome = sc.nextLine();
        System.out.print("Digite o nome do Representante: ");
        int telefone = sc.nextInt();
        Representante representante = new Representante(nome, telefone);
        RepresentanteRepository.save(representante);
        System.out.println("Representante cadastrado com sucesso!");
    }


    public void removerRepresentante(String nome) {
    // Passa pela lista de representantes
     for (int i = 0; i < representantes.size(); i++) {
        Representante representante = representantes.get(i);
        if (representante.getNome_representante().equals(nome)) {
            // Remove o representante com o nome correspondente
            representantes.remove(i);
            break; // Encerra o loop após encontrar o representante
        }
    }
}		

    public ArrayList<Representante> getRepresentantes() {
        return representantes;
    }

    	

    // Esses são os métodos para manipular os representantes, como buscar por nome, excluir representante, etc.
}
