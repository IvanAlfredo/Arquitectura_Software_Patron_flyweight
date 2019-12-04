package Clases;

import java.util.HashMap;

public class Fabrica_formas {

    private static final HashMap Circulo_mapa = new HashMap();

    public static Interface_forma getCirculo(String color) {

        Circulo circulo = (Circulo) Circulo_mapa.get(color);

        if (circulo == null) {

            circulo = new Circulo(color);
            Circulo_mapa.put(color, circulo);
            System.out.println("Creando un círculo de color : " + color);

        }

        return circulo;

    }

}
