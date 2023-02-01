package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.stream.Stream;

public class EjemploOperadorFilterCount {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo", "Julian Pineda");

        long cantidad =
                nombres
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .peek(System.out::println)
                        .count();

        System.out.println(cantidad);


    }

}
