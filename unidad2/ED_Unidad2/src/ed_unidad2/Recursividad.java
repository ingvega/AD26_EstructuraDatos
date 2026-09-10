/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_unidad2;

/**
 *
 * @author cmare
 */
public class Recursividad {

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Recursividad");
        StringBuilder str2 = new StringBuilder("Hola");
        StringBuilder str3 = new StringBuilder("Este es un EJEMPLO");       
        System.out.println(contadorVocales(str1));
        System.out.println(contadorVocales(str2));
        System.out.println(contadorVocales(str3));
        
        System.out.println("-----------------------");
        
        StringBuilder str12=new StringBuilder("-1234");
        StringBuilder str22=new StringBuilder("45");
        StringBuilder str32=new StringBuilder("2");
        System.out.println(revertirCadena(1234));
        System.out.println(revertirCadena(str22));
        System.out.println(revertirCadena(str32));
    }

    public static int contadorVocales(StringBuilder palabra) {
        int tamanio = palabra.length() - 1;
        String patron = "[AEIOUaeiou]";
        char letra = palabra.charAt(tamanio);
        if (tamanio <= 0) {
            if (palabra.toString().matches(patron)) {
                return 1;
            }
            return 0;
        } else if (Character.toString(letra).matches(patron)) {
            return contadorVocales(palabra.deleteCharAt(tamanio)) + 1;
        }
        return contadorVocales(palabra.deleteCharAt(tamanio));
    }

    public static int revertirCadena(int numero) {
        String valor
                = revertirCadena(new StringBuilder(Integer.toString(numero)));
        int entero = Integer.parseInt(valor);
        return entero;

    }

    private static String revertirCadena(StringBuilder palabra) { // perdon si está de la patada pero no se me ocurrio nada más :( (nose java, javali)
        if (palabra.length() <= 0) {
            return "";
        }
        return palabra.charAt(palabra.length() - 1) + 
                revertirCadena(palabra.deleteCharAt(palabra.length() - 1))
                +palabra.charAt(palabra.length() - 1) ;
    }
}
