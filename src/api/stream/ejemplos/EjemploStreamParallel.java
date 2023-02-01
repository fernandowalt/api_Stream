package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
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

        long t1 = System.currentTimeMillis();

        String nombres = streamDeUsuarios
                .parallel()
                .map(usuario -> usuario.toString().toUpperCase())
                .peek(nombre -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName() + "-" + nombre);
                })
                .flatMap(nombre -> {

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (nombre.contains("CHARLES")) {
                        return Stream.of(nombre);
                    } else {
                        return Stream.empty();
                    }
                })
                .findAny()
                .orElse("");

        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo Total: " + (t2 - t1) + " Milisegundos");
        System.out.println(nombres);


    }
}
