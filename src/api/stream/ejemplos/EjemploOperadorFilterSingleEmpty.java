package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingleEmpty {
    public static void main(String[] args) {

        long nombres = Stream
                .of("Walter Ramirez", "", "Edwin Pineda",
                    "Darwin Gallardo", "")
                .filter(String::isEmpty)
                .count();


        System.out.println(nombres);


    }

}
