/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_cardex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        ArrayList<Cardex> lista=new ArrayList<>();
                
        int alumnos=l.nextInt();
        l.nextLine();
        for (int i = 0; i < alumnos; i++) {
            Cardex c=new Cardex(l.next(),l.nextInt(),l.next(),l.nextInt(),l.next(),l.next(),l.nextInt());
            lista.add(c);
        }
        
        System.out.println(lista.size());
        
        //Collections.sort(lista);
        lista.sort(Comparator.comparing(Cardex::getPromedio)
                      .thenComparing(Cardex::getOpcion));
        
        for (Cardex cardex : lista) {
            System.out.println(cardex);
        }
        
    }
}
