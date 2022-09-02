package br.com.uca.ed;

import java.util.Scanner;

public class Testefinal {

    public static void main(String[] args) {

        FilaService filaService = new FilaService();
        PilhaService pilhaService = new PilhaService();
        Boolean system = true;
        Scanner scan = new Scanner(System.in);

        while(system) {
            System.out.println("Qual Acao deseja executar");
            System.out.println("0 - sair");
            System.out.println("1 - Fila");
            System.out.println("2 - Pilha");

            int action = scan.nextInt();
            if(action == 1) {
                filaService.inicial(scan);
            }else if(action == 2) {
                pilhaService.inicial(scan);
            }else {
                system = false;
            }
        }
    }

}

