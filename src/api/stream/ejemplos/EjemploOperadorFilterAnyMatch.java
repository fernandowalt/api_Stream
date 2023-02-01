package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.stream.Stream;

public class EjemploOperadorFilterAnyMatch {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo", "Julian Pineda");

        boolean usuarios =
                nombres
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .peek(System.out::println)
                        .anyMatch(u -> u.getNombre().equals("Walter"));

        System.out.println(usuarios);


    }

}
