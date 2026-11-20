/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author paveg
 */
public class Productos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String producto;
        TreeMap<String, Integer> cubetas = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        while (!(producto = lector.nextLine()).equals("#")) {
            //cubetas.put(producto, cubetas.getOrDefault(producto,0)+1);
            if (cubetas.get(producto) != null) {
                cubetas.put(producto, cubetas.get(producto) + 1);
            } else {
                cubetas.put(producto, 1);
            }
        }

        for (Map.Entry<String, Integer> par : cubetas.entrySet()) {
            System.out.println(par.getKey() + " " + par.getValue());

        }

    }

}
