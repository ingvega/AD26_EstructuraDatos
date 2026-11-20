/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author paveg
 */
public class GrafoNietosListaAdy {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        HashMap<String, ArrayList<String>> genealogia
                = new HashMap<>();

        String hijo, padre;
        int posHijo, posPadre;
        for (int i = 0; i < n; i++) {
            hijo = lector.next();
            padre = lector.next();
            ArrayList<String> hijos;
            if (!genealogia.containsKey(padre)) {
                hijos = new ArrayList<>();
            } else {
                hijos = genealogia.get(padre);
            }
            //Se deben añadir los hijos, ya que al parecer en los casos de prueba
            //esisten casos donde 
            genealogia.putIfAbsent(hijo, new ArrayList<>());
            
            hijos.add(hijo);
            genealogia.put(padre, hijos);

        }
        
        TreeMap<String, Integer> conteoNietos = 
                new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        
        //Map<String,Integer> conteoNietos=new HashMap<>();
        
        for (String papa : genealogia.keySet()) {
            int nietos=0;
            for (int i = 0; i<genealogia.get(papa).size(); i++) {
                hijo=genealogia.get(papa).get(i);
                if(genealogia.containsKey(hijo)){
                    nietos+=genealogia.get(hijo).size();
                }
            }
            conteoNietos.put(papa, nietos);
        }
//        for (Map.Entry<String, Integer> entry : conteoNietos.entrySet()) {
//            System.out.println( entry.getKey() + "-"+entry.getValue());
//        }
        //Buscar la cantidad de nietos mas alta
        int mayor = 0;
        for (int cantNietos : conteoNietos.values()) {
            if (cantNietos > mayor) {
                mayor = cantNietos;
            }
        }
        //Buscar todos los familiares que tienen la cantidad de nietos "mayor"
        for (Map.Entry<String, Integer> entry : conteoNietos.entrySet()) {
            if (entry.getValue() == mayor) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
