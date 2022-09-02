package br.com.uca.ed;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<Integer> numeros = new LinkedList<Integer>();

    public void adiciona(int numero) {

        numeros.add(numero);
        numeros.forEach(System.out::println);

    }

    public Integer remove() {
        Integer remove = numeros.remove(0);
        numeros.forEach(System.out::println);
        return remove;

    }

    public boolean vazio() {
        return numeros.isEmpty();
    }

    @Override
    public String toString() {
        return numeros.toString();
    }

}
