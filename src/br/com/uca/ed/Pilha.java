package br.com.uca.ed;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

private List<Integer> numeros = new LinkedList();

    public void adiciona (int numero) {
        numeros.add(numero);
        numeros.forEach(System.out::println);
    }

    public Integer remove() {
    Integer remove = numeros.remove(numeros.size()-1);
    numeros.forEach(System.out::println);
    return remove;
}

    public boolean vazia() { return numeros.isEmpty() ; }



@Override
public String toString() { return "Pilhaa" + numeros ; }

}
