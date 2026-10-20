package oup.ordenamiento_alfabetico;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Letras {
    public static void main(String[] args) {
        String cadena = "HolA gatito,perrito Adios";
        //AaAd egHiii,loooopr rsttt
        ArrayList <String> letras = new ArrayList<>();
        
        //new ArrayList<>().add("texto");
        
        for(int i = 0; i < cadena.length(); i++){
            if(Character.isLetter(cadena.charAt(i))){
                letras.add(""+cadena.charAt(i));
            }
        }
        
        ComparadorAlfabetico ordenAlfabetico=new ComparadorAlfabetico();
        //letras.sort(String.CASE_INSENSITIVE_ORDER);
        letras.sort(ordenAlfabetico.reversed());
        //Collections.sort(letras);
        
        for(int i = 0; i < cadena.length(); i++){
            if(Character.isLetter(cadena.charAt(i))){
                System.out.print(letras.removeFirst());
            } else{
                System.out.print(cadena.charAt(i));
            }
        }
    }
}

class ComparadorAlfabetico implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2)*-1;
    }
}