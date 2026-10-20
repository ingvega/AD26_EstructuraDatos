
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author paveg
 */
public class VerificarOrden {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaO = new ArrayList();

        PriorityQueue<String> listaC = new PriorityQueue<>(String.CASE_INSENSITIVE_ORDER);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String nombre = sc.nextLine();
            listaO.add(nombre);
            listaC.add(nombre);
        }
        /*
        7
        Anna
        Bertha
        Carlos 
        Claudia
        Daniel
        Cruz
        Alberto
         */
        String nombre;
        int indice;
        for (int i = 0; i < n; i++) {
            nombre = listaC.poll();
            indice = listaO.indexOf(nombre);
            System.out.println(nombre + " " + (i - indice));
        }

    }
}
