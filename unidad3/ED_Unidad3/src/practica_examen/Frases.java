package practica_examen;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author paveg
 */
public class Frases {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase = lector.nextLine();
        String palabras[] = frase.split(" ");
        String simbolos[] = frase.split("\\w+");
        PriorityQueue<String> palabrasPQ = new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);
        Queue<String> simbolosQ = new LinkedList();
        
//        System.out.println(palabras[0].split(",")[0]);
//        String palabra=palabras[0];
//        String palabraSinComa=palabra.replace(",","");
//        String palabraSinComaSinPunto=palabraSinComa.replace(".","");
        
       //palabrasPQ.addAll(Arrays.asList(palabras));
        for (int i = 0; i < palabras.length; i++) {
            palabrasPQ.add(palabras[i].replace(",", "").replace(".", ""));
        }
        
        //simbolosQ.addAll(Arrays.asList(simbolos));
        for (int i = 0; i < simbolos.length; i++) {
            simbolosQ.add(simbolos[i]);
        }

        if (Character.isLetter(frase.charAt(0))) {
            while (!palabrasPQ.isEmpty() || !simbolosQ.isEmpty()) {
                if (!simbolosQ.isEmpty()) {
                    System.out.print(simbolosQ.poll());
                }
                if (!palabrasPQ.isEmpty()) {
                    System.out.print(palabrasPQ.poll());
                }
            }
        } else {
            while (!palabrasPQ.isEmpty() || !simbolosQ.isEmpty()) {
                if (!simbolosQ.isEmpty()) {
                    System.out.print(simbolosQ.poll());
                }
                if (!palabrasPQ.isEmpty()) {
                    System.out.print(palabrasPQ.poll());
                }
            }
        }

    }
}
