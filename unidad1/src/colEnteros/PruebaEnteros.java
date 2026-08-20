package colEnteros;

import java.util.ArrayList;

public class PruebaEnteros {

    public static void main(String[] args) {

        ColeccionEnteros coleccion = new ColeccionEnteros();
        System.out.println("----------estado inicial-----------------");
        for (int i = 0; i < coleccion.tamanio(); i++) {
            System.out.println(coleccion.obtener(i));
        }
        System.out.println("--------------------------");
        coleccion.agregar(0, 10);
        coleccion.agregar(0, 100);
        System.out.println("----------Insercion inversa-----------------");
        for (int i = 0; i < coleccion.tamanio(); i++) {
            System.out.println(coleccion.obtener(i));
        }
        System.out.println("--------------------------");
        coleccion.sustituir(1, 1000);
        int suma = 0;
        for (int i = 0; i < coleccion.tamanio(); i++) {
            suma += coleccion.obtener(i);
        }
        System.out.println("\n" + suma);

    }
}
