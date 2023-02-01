package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                                           "Darwin Gallardo");
/*        a diferencia de foreach que utiliza un consumer el operador map usa un funcion
        que transforma los elementos;

        nombres.map(String::toUpperCase)
               .forEach(System.out::println);*/


        /*        transformar a una lista de strings*/

/*        List<String> listaDeNombres = nombres
                .filter(m -> m.charAt(0) == 'F')
                .map(String::toUpperCase)
                .toList();

        System.out.println(listaDeNombres);*/

        /*        transformar un stream de string en un tipo Usuario*/

        Stream<Usuario> usuarios =
                nombres
                        .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .peek(usuario -> {
                            usuario.setNombre(usuario.getNombre().toUpperCase());
                            usuario.setApellido(usuario.getApellido().toUpperCase());
                        });

        usuarios.forEach(System.out::println);


    }
}
