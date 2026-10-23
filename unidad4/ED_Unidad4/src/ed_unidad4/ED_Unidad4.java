/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_unidad4;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author paveg
 */
public class ED_Unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        TreeSet t=new TreeSet();
//                
//        t.add("Alvarez");
//        t.add("Nambo");
//        t.add("1");
//        //t.add(1);
//        t.add(null);

        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt(),edad;
        /*
        10
        28 19 30 18 25 19 32 30 19 19
        */
        TreeSet<Integer> edades=new TreeSet<>();
        //edades=(TreeSet<Integer>)edades.reversed();
        for (int i = 0; i < n; i++) {
            edad=lector.nextInt();
            edades.add(edad);
        }
        
        System.out.println(edades.last() + " " + edades.first());
        
        for (Integer valor : edades) {
            System.out.println(valor);
        }
                
        
    }
    
}
