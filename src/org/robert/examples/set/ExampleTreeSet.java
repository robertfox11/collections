package org.robert.examples.set;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        /*tiene un costo de rendimiento, por que tiene que ir ordenador en las posiciones*/
        Set<String> ts = new TreeSet<>();
        //Ordnea de forma alfabetica, no acepta alfabetica
        ts.add("uno");
        ts.add("dos");
        ts.add("cinco");
        ts.add("tres");
        ts.add("cuatro");
        System.out.println(ts);
        Set<Integer> nums = new TreeSet<>();
        //ordena los numeros de la interfaz comparable
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(2);
        System.out.println("numeros = " + nums);


    }

}
