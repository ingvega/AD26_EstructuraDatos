package practica_examen;


import java.util.LinkedList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Misiones {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        LinkedList<String> astronautas=new LinkedList<>();
        boolean inicio=true;
        
        String tipo="",nombre="";
        for (int i = 0; i < 1; i++) {
            tipo=lector.next();
            nombre=lector.next();
            if(tipo.equals("A")){
                astronautas.add(tipo);
            }else{
                System.out.print(nombre+" ");
                if(inicio){
                    System.out.println(astronautas.removeFirst());
                    inicio=false;
                }else{
                    System.out.println(astronautas.removeLast());
                    inicio=true;
                }
                //inicio=!inicio;
            }
        }
        
    }
}
