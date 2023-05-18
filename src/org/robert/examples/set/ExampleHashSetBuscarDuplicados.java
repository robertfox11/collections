package org.robert.examples.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSetBuscarDuplicados {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Dorada", "Atun", "Gallo", "Lenguado", "Corvina"};
        /* Comprobamos si existe elemento duplicados*/
        Set<String> unicosPeces = new HashSet<>();
        for (String pez: peces) {
            if (!unicosPeces.add(pez)){
                System.out.println("Elementos Duplicados: "+ pez);
            }
        }
        System.out.println(unicosPeces.size() + " Elementos no duplicados");

    }
}
