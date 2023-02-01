package api.stream.ejemplos;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;


public class EjemploOperadorRange {
    public static void main(String[] args) {
        /*        range no incluye al 20*/
        /*     IntStream numeros = IntStream.range(5, 20);*/

        /*     rangeClose incluye el 20 en este caso */
        IntStream numeros = IntStream.rangeClosed(5, 20);

        /*        int resultado = numeros.reduce(0, Integer::sum);*/
        /*      int resultado = numeros.sum();*/
        IntSummaryStatistics stats = numeros.summaryStatistics();

        System.out.println("Maximo: " + stats.getMax());
        System.out.println("Minimo: " + stats.getMin());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Nunero De Elementos: " + stats.getCount());
        System.out.println("Suma Total: " + stats.getSum());


    }

}
