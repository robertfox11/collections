package org.robert.examples.modelo;

import java.util.Objects;

/**Comparable para ordenar atributos*/
public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota = " + nota ;
    }

    //compareTo nos permite ordenar con un solo atributo
    @Override
    public int compareTo(Alumno a) {
        //compara nombre
//        if (this.nombre == null){
//            return 0;
//        }
//        return this.nombre.compareTo(a.nombre);
//        comparar nota
//        if (this.nota == a.nota){
//            return 0;
//        }
//        if (this.nota >a.nota){
//            return 1;
//        }
//        return -1;
        /*Tambien de otra manera*/
        if (this.nota == null){
            return 0;
        }
        //solo es de tipo Integer
        return this.nota.compareTo(a.nota);
    }

    /*Comparacion de valores unicos con Set con nombre o nota*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    /**/
    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
