package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingle {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo", "Julian Pineda");

        Usuario usuarios =
                nombres
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .filter(u -> u.getId().equals(2))
                        .findFirst().orElseGet(() -> new Usuario("Jhon", "Doe"));

                System.out.println(usuarios);


    }

}
