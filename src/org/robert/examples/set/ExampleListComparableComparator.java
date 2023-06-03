package org.robert.examples.set;

import org.robert.examples.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 7));
        sa.add(new Alumno("Jano", 8));
        sa.add(new Alumno("Carlos", 9));
        sa.add(new Alumno("Juano", 5));
        sa.add(new Alumno("Zeus", 9));

        Collections.sort(sa);
        /*ordenamos por nora*/
//        sa.sort((a, b) -> a.getNota());
        /*Ordena por nombre*/
        sa.sort(Comparator.comparing((Alumno a) ->a.getNombre()).reversed());
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println("itrenando usando Stream forEach");
        sa.forEach(System.out::println); ///Optimizada for each
        System.out.println("itrenando usando Stream forEach ordena por nota");
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        sa.forEach(System.out::println); ///Optimizada for each

    }
}
