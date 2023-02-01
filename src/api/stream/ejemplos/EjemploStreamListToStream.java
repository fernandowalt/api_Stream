package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> listaDeUsuarios = new LinkedList<>();

        listaDeUsuarios.add(new Usuario("Walter", "Gomez"));
        listaDeUsuarios.add(new Usuario("Edwin", "Santamaria"));
        listaDeUsuarios.add(new Usuario("Darwin", "Pinzon"));
        listaDeUsuarios.add(new Usuario("Victor", "Hugo"));
        listaDeUsuarios.add(new Usuario("Charles", "Baudelaire"));
        listaDeUsuarios.add(new Usuario("Arthur", "Rimbaud"));
        listaDeUsuarios.add(new Usuario("Charles", "Darwin"));

        Stream<Usuario> streamDeUsuarios = listaDeUsuarios.stream();

        Stream<String> nombres = streamDeUsuarios
                .map(usuario -> usuario.getNombre()
                                       .toUpperCase()
                                       .concat(" ")
                                       .concat(usuario.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("CHARLES")) {
                        return Stream.of(nombre);
                    } else {
                        return Stream.empty();
                    }
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());
        ;


    }
}
