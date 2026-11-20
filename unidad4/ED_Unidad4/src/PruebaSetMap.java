//6964
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class PruebaSetMap {
    public static void main(String[] args) {
//        ClaveProducto, Nombre
//        TreeMap<Integer,String> 
//        
//        TreeMap<Integer,Producto> 
        
        //TreeMap<LocalTime,String> registros=new TreeMap<>();
        //HashMap<LocalTime,String> registros=new HashMap<>();
        ArrayList<String> integrantesE1=new ArrayList();
        integrantesE1.add("Alexis");
        integrantesE1.add("Lesly");
        ArrayList<String> integrantesE2=new ArrayList();
        integrantesE2.add("Uriel");
        integrantesE2.add("Samuel");
        ArrayList<String> integrantesE3=new ArrayList();
        integrantesE3.add("Damian");
        integrantesE3.add("Ayari");
        //HashMap<String,ArrayList>
        HashMap<ArrayList,Integer> calificacionesEquipos=
                new HashMap<>();
        calificacionesEquipos.put(integrantesE1,90);
        System.out.println("--"+integrantesE1.hashCode());
        integrantesE1.add("Dana");
        System.out.println("--"+integrantesE1.hashCode());
        calificacionesEquipos.put(integrantesE2,93);
        calificacionesEquipos.put(integrantesE3,95);
        
        System.out.println();
        System.out.println(calificacionesEquipos.get(integrantesE1));
        
        HashMap<LocalTime,String> registros=new HashMap<>();
        registros.put(LocalTime.of(7,0,0), "Alexis");
        registros.put(LocalTime.of(19,0,0), "Alexis Gabriel");
        registros.put(LocalTime.of(7,0,10), "Lesly");
        registros.put(LocalTime.of(9,50,50), "Uriel");
        registros.put(null, "Patricia");
        
        for (Map.Entry<LocalTime, String> entry : registros.entrySet()) {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
                
        
//        TreeSet<Integer> conjunto=new TreeSet<>();
//        HashSet<Integer> conjunto2=new HashSet<>();
//        conjunto.add(5);
//        conjunto.add(20);
//        conjunto.add(67);
//        conjunto.add(3);
//        conjunto.add(10);
//        conjunto.add(20);
//        
//        
//        System.out.println(conjunto.size());
//        
//        conjunto2.addAll(conjunto);
////        System.out.println(conjunto2.add(20));
////        System.out.println(conjunto2.add(null));
////        System.out.println(conjunto2.add(null));
//        System.out.println(conjunto2.size());
//        
//        for (Integer numero : conjunto) {
//            System.out.println(numero);
//        }
//        System.out.println("----------");
//        for (Integer numero : conjunto2) {
//            System.out.println(numero);
//        }
    }
}
