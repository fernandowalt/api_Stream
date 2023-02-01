package api.stream.ejemplos;

import java.util.List;
import java.util.stream.Stream;

public class EjemploOperadorReduce {
    public static void main(String[] args) {

        Stream<String> usuarios = Stream
                .of("Walter Ramirez", "Fernando Arias", "Edwin Pineda",
                    "Darwin Gallardo", "Luis Tique", "Walter Ramirez", "Walter Ramirez", "Walter Ramirez")
                .distinct();

        String resultado = usuarios.reduce("Resultado Concatenacion: ", (a, b) -> a + ", " + b);
        System.out.println(resultado);


    }

}
