/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_unidad4;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author paveg
 */
public class Autocompletar {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        TreeSet<String> lista=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        lector.nextLine();
        for (int i = 0; i < n; i++) {
            lista.add(lector.nextLine());
        }
         n=lector.nextInt();
         String palabra,palabraSugerida;
         lector.nextLine();
        for (int i = 0; i < n; i++) {
            palabra=lector.nextLine();
//            ceiling  >=
//            floor <=
//            lower <
//            higher >
            palabraSugerida=lista.ceiling(palabra);
            //System.out.println(palabraSugerida);
            if(palabraSugerida!=null && palabraSugerida.toLowerCase().startsWith(palabra.toLowerCase()))
                System.out.println(palabraSugerida);
            else
                System.out.println(palabra);
        }
//        System.out.println(lista.size());
//        for (String string : lista) {
//            System.out.println(string);
//        }
    }
}
