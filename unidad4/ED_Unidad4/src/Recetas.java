
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
import java.util.*;
public class Recetas {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> recetario = new HashMap<>();
        HashSet<String> ingredientes=new HashSet<>();
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        String receta,platillo;
        ArrayList<String> ingReceta;
        lector.nextLine();
        for (int i = 0; i < n; i++) {
            receta=lector.nextLine();
            ingReceta=new ArrayList<>();
            ingReceta.addAll(Arrays.asList(receta.split(" ")));
            platillo=ingReceta.remove(0);
//            Arrays.asList("a","b","c");
//            Arrays.asList("a","b");
            
            recetario.put(platillo,ingReceta);
        }
        n=lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < n; i++) {
            ingredientes.add(lector.nextLine());
        }
        platillo=lector.nextLine();
        
//        for (Map.Entry<String, ArrayList<String>> receta2 : recetario.entrySet()) {
//            System.out.println(receta2.getKey());
//            for (String ing:receta2.getValue()) {
//                System.out.println("\t"+ing);
//            }
//            
//        }
        
    }
   
}
