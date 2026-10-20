/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recompensas;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author paveg
 */
public class Main {
    public static void main(String[] args) {
        /*
        6
        500
        1000
        100
        400
        200
        10000
        5
        M Ofelia
        H Pedro
        M Laura
        H Israel
        H Alberto
*/
        Stack <Integer> sobres=new Stack<>();
        ArrayList<String> registro=new ArrayList<>();
        PriorityQueue< String> hombres=new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);
        PriorityQueue< String> mujeres=new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sobres.add(sc.nextInt()); 
        }
        String sexo,nombre;
        int s=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < s; i++) {
            sexo=sc.next();
            nombre=sc.next();
            registro.add(nombre);
            if (sexo.equals("H")){
                hombres.add(nombre);
            }else{
                mujeres.add(nombre);
            }                 
        }
    } 
}
