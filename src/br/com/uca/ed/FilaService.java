package br.com.uca.ed;

import java.util.Scanner;

import br.com.uca.ed.Fila;

public class FilaService {

    private Boolean system = true;
    Fila fila = new Fila();

    public void inicial(Scanner scanner) {
        while (system) {
            System.out.println("Qual acao deseja escolher");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar");
            System.out.println("2 - remover");

            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Digite o numero");
                Integer numero = scanner.nextInt();
                fila.adiciona(numero);
            } else if (action == 2) {
                if (!fila.vazio()) {
                    fila.remove();
                    System.out.println("Numero removido");
                } else {
                    System.out.println("Nenhum numero na fila");
                }

            } else {
                system = false;
            }

        }

    }
}
