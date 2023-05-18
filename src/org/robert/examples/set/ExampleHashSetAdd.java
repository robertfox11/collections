package org.robert.examples.set;

import java.util.*;

public class ExampleHashSetAdd {
    public static void main(String[] args) {
        /*Set no permite elementos duplicados*/
        Set<String> hs = new HashSet<>();
        /**add, agrega un elemento, no garantiza orden devuelve un booolean, si es true lo agrega devuelve
         * un array, */
        System.out.println("**********************Set o HashSet");
        hs.add("uno");
        System.out.println(hs.add("dos"));
        System.out.println(hs);
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);
        /*Para ordenar un set un set no se puede ordenar tendra que convertir en un array lists*/
        List<String> lista = new ArrayList<>(hs); //convertimos ua un array list
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("**********************List");

        /*Con list, permite elementos duplicados */
        List<String> ls = new ArrayList<>();
        ls.add("uno");
        System.out.println(ls.add("dos"));
        System.out.println(ls.add("tres"));
        System.out.println(ls);
        /*Se puede ordenar lista de tipo list*/
        Collections.sort(ls);
        System.out.println("**********************");
    }
}
