/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author paveg
 */
public class GrafoNietosMatriz {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        int[][] parentesco  =new int[n*2][n*2];
        ArrayList<String> familiares=new ArrayList<>();
        String hijo,padre;
        int posHijo,posPadre;
        for (int i = 0; i < n; i++) {
            hijo=lector.next();
            padre=lector.next();
            if(!familiares.contains(hijo))
                familiares.add(hijo);
            if(!familiares.contains(padre))
                familiares.add(padre);
            posHijo=familiares.indexOf(hijo);
            posPadre=familiares.indexOf(padre);
            parentesco[posPadre][posHijo]=1; 
        }
        TreeMap<String,Integer> conteoNietos=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        //Map<String,Integer> conteoNietos=new HashMap<>();
        int nietos;
        for (int i = 0; i < familiares.size(); i++) {
            nietos=0;
            //Buscar en la fila de ese familiar a los hijos que tiene
            for (int j = 0; j < familiares.size(); j++) {
                if(parentesco[i][j]==1){
                    //Encontre un hijo, buscar si ese hijo tiene a su vez hijos
                    for (int k = 0; k < familiares.size(); k++) {
                        if(parentesco[j][k]==1){
                            nietos++;
                        }
                        //nietos+=parentesco[j][k];
                    }
                }
            }
            conteoNietos.put(familiares.get(i),nietos);
        }
//        for (Map.Entry<String, Integer> entry : conteoNietos.entrySet()) {
//            System.out.println( entry.getKey() + "-"+entry.getValue());
//        }
        //Buscar la cantidad de nietos mas alta
        int mayor=0;
        for (int cantNietos : conteoNietos.values()) {
            if(cantNietos>mayor)
                mayor=cantNietos;
        }
        //Buscar todos los familiares que tienen la cantidad de nietos "mayor"
        for (Map.Entry<String, Integer> entry : conteoNietos.entrySet()) {
            if(entry.getValue()==mayor)
                System.out.print( entry.getKey() + " ");
        }     
        
        
    }
}
