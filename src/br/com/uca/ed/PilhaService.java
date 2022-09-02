package br.com.uca.ed;

import java.util.Scanner;

public class PilhaService {

    private Boolean system = true;
    Pilha pilha = new Pilha();

    public void inicial(Scanner scanner) {
        while (system) {
            System.out.println("Qual acao deseja escolher");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar");
            System.out.println("2 - remover");

            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Digite um numero");
                Integer numero = scanner.nextInt();
                pilha.adiciona(numero);
            } else if (action == 2) {
                if (!pilha.vazia()) {
                    pilha.remove();
                    System.out.println("Numero Removido");
                } else {
                    System.out.println("Nenhum numero na pilha");
                }

            } else {
                system = false;
            }
        }
    }
}