/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Main {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        ArbolBinario arbol=new ArbolBinario();
        int n=lector.nextInt();
        for (int i = 0; i < n; i++) {
            arbol.agregar(lector.nextInt());
        }
        System.out.println(
                arbol.recolectarHojas(arbol.raiz));
    }
}
