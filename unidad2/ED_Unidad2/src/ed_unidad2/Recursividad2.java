/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_unidad2;

/**
 *
 * @author ozodi
 */
public class Recursividad2 {

    public static int contarVocalesIterativo(String texto){
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'){
                contador++;
            }
        }
        return contador;
    }
public static int contarVocalesRecursivo(String texto){
    return contarVocalesRecursivo(texto.toLowerCase(), 0);
}
    private static int contarVocalesRecursivo(String texto, int indice){
        if (indice >= texto.length()) {
            return 0;
        }
        char c = texto.charAt(indice);
        int contVocal = 0;
        if (c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'){
            contVocal = 1;
        }
        return contVocal + contarVocalesRecursivo(texto, indice + 1);
    }

    public static void main(String[] args) {
        String a="aeiou";
        System.out.println(contarVocalesIterativo(a));
        System.out.println(contarVocalesRecursivo(a, 0));
    }

}
