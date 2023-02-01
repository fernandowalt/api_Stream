package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingleConOptional {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Walter Ramirez", "Fernando Gonzales", "Edwin Pineda",
                    "Darwin Gallardo", "Julian Pineda")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Walter"));


        Optional<Usuario> usuario = nombres.findFirst();
        /*      System.out.println(usuario.orElse(new Usuario("Daniel", "Defoe")));*/
        /*        System.out.println(usuario.orElseGet(() -> new Usuario("Victor", "Hugo")));*/
 /*       if (usuario.isPresent()) {
            System.out.println(usuario.get().getApellido());
        } else {
            System.out.println("No se Encontró el objeto!");
        }*/
        if (usuario.isEmpty()) {
            System.out.println("No se Encontró el objeto!");
        } else {
            System.out.println(usuario.get().getApellido());

        }


    }

}
