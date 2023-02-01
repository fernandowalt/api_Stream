package api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploOperadorReduceEnteros {
    public static void main(String[] args) {

        Stream<Integer> usuarios = Stream
                .of(5, 10, 15, 20, 25, 30, 35)
                .distinct();

        Integer resultado = usuarios.reduce(0, Integer::sum);
        System.out.println(resultado);


    }

}
