package api.stream.ejemplos;
import api.stream.ejemplos.modelos.Usuario;
import java.util.stream.Stream;

public class EjemploOperadorFilter {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo", "Julian Pineda");

        Stream<Usuario> usuarios =
                nombres
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .filter(u -> u.getApellido().equals("Pineda"));


        usuarios.toList().forEach(System.out::println);


    }

}
