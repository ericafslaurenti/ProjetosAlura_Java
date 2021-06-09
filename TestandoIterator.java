package br.com.alura;

import java.util.*;

public class TestandoIterator {
    public static void main(String[] args) {

        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

        Iterator<String> it = letras.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}