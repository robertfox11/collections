package org.robert.examples.set;

import org.robert.examples.modelo.Alumno;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //se ordena por nota de mayor a menor
        System.out.println("***************Ordena por nota de mayor a menor no coge valores repetidos de nota***********************");

        Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
        sa.add(new Alumno("pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 7));
        sa.add(new Alumno("Jano", 8));
        sa.add(new Alumno("Carlos", 9));
        sa.add(new Alumno("Juano", 5));
        sa.add(new Alumno("Zeus", 9));
        System.out.println(sa);
        /*Formas de iterar un set*/
        System.out.println("Iterando usando un foreach");
        for (Alumno a : sa) {
            System.out.println(a.getNombre());
        }
        System.out.println("iternado usando while y Iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando Stream foreach function lambda");
        sa.forEach(a -> System.out.println(a.getNombre()));
        sa.forEach(System.out::println);//optimizado imprimer nota y jnombre
        System.out.println("***************Ordena por nombre no coge valores repetidos por nombre***********************");
        //se ordena por nombre de mayor a menor
        Set<Alumno> san = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
        san.add(new Alumno("Pato", 5));
        san.add(new Alumno("Cata", 6));
        san.add(new Alumno("Luci", 7));
        san.add(new Alumno("Jano", 8));
        san.add(new Alumno("Carlos", 9));
        san.add(new Alumno("Juano", 5));
        san.add(new Alumno("Zeus", 9));
        System.out.println(san);
        Set<Alumno> snt = new TreeSet<>();
        System.out.println("***************Comparación de nombre y notaas unicos***********************");
        san.add(new Alumno("Pato", 5));
        san.add(new Alumno("Cata", 6));
        san.add(new Alumno("Luci", 7));
        san.add(new Alumno("Jano", 8));
        san.add(new Alumno("Carlos", 9));
        san.add(new Alumno("Juano", 5));
        san.add(new Alumno("Zeus", 9));
        san.add(new Alumno("Zeus2", 9));
        System.out.println(san);
    }
}
