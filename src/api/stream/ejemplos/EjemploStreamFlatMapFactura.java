package api.stream.ejemplos;

import api.stream.ejemplos.modelos.Factura;
import api.stream.ejemplos.modelos.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMapFactura {

    public static void main(String[] args) {

        Usuario dickens = new Usuario("Charles", "Dickens");
        Usuario baudelaire = new Usuario("Charles", "Baudelaire");

        dickens.addFactura(new Factura("compra de betun"));
        dickens.addFactura(new Factura("Compra de esperanzas"));

        baudelaire.addFactura(new Factura("Compra de flores"));
        baudelaire.addFactura(new Factura("Compra de vinos"));

        Stream.of(dickens, baudelaire)
              .flatMap(comprador -> comprador.getFacturas().stream())
              .forEach(f -> {
                  System.out.println(f.getDescripcion()
                                      .concat(" -Cliente: ")
                                      .concat(f.getUsuario().toString()));
              });


    }
}
