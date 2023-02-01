package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorFlatMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo", "Julian Pineda", "Walter Oquendo");

        Stream<Usuario> usuarios = nombres
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))

                .flatMap(usuario -> {

                    if (usuario.getNombre().equals("Walter")) {
                        return Stream.of(usuario);
                    }
                    return Stream.empty();
                });


    }

}
