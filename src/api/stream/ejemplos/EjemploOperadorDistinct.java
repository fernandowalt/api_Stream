package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorDistinct {
    public static void main(String[] args) {

        List<String> usuarios = Stream
                .of("Walter Ramirez", "Fernando Arias", "Edwin Pineda",
                    "Darwin Gallardo", "Luis Tique", "Walter Ramirez", "Walter Ramirez", "Walter Ramirez")
                .distinct().toList();

        System.out.println(usuarios);


    }

}
