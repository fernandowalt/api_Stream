package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.stream.Stream;

public class EjemploOperadorDistictConObjetosUsuario {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo", "Julian Pineda", "Fernando perez",
                                           "Fernando perez");

        Stream<Usuario> usuarios = nombres
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();


        usuarios.forEach(System.out::println);


    }

}
