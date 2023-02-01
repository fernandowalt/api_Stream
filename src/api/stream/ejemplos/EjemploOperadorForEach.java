package api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploOperadorForEach {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        /*  nombres.forEach(System.out::println);*/

        String[] arr = { "Pato", "Paco", "Pepa", "Pepe" };
        Stream<String> nombres2 = Arrays.stream(arr);
        /*   nombres2.forEach(System.out::println);*/


        Stream<String> nombres3 = Stream.<String>builder()
                                        .add("pato")
                                        .add("pepe")
                                        .add("paco")
                                        .add("pepa").build();
/*        nombres3.forEach(System.out::println);*/

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Pepe");
        lista.add("Paco");
        lista.add("Pepa");

        lista.forEach(System.out::println);
    }
}