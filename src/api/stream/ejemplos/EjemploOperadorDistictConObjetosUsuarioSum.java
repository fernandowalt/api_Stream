package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploOperadorDistictConObjetosUsuarioSum {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of(
                "Walter Ramirez",
                "Fernando Gonzales",
                "Edwin Pineda",
                "Darwin Gallardo",
                "Julian Pineda",
                "Fernando perez",
                "Fernando perez");

        IntStream largoDelNombreYelApellido = nombres
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(usuario -> usuario.getNombre().length() + usuario.getApellido().length());

        IntSummaryStatistics stadistica = largoDelNombreYelApellido.summaryStatistics();

        System.out.println("Mayor numero de caracteres: " + stadistica.getMax());
        System.out.println("Menor numero de caracteres: " + stadistica.getMin());
        System.out.println("Promedio de caracteres: " + stadistica.getAverage());
        System.out.println("Numero de elementos: " + stadistica.getCount());
        System.out.println("Suma de todos los caracteres: " + stadistica.getSum());


    }

}
