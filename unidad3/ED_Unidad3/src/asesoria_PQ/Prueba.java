/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asesoria_PQ;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        lector.nextLine();
        //Categoria (Ascendente,Alfabética),Vigente (vigente primero),Precio (mas bajo al más alto)
//        boolean a=true,b=false;
//        System.out.println(Boolean.compare(true,false)); //1
//        System.out.println(Boolean.compare(true,true)); //-1
        Orden formaDeOrdenar=new Orden();
        PriorityQueue<Producto> pq=new PriorityQueue<>(formaDeOrdenar);
        for (int i = 0; i < n; i++) {
            String cadenaProducto[]=lector.nextLine().split(",");
            Producto p=new Producto();
            p.producto=cadenaProducto[0];
            p.precio=Float.parseFloat(cadenaProducto[1]);
            p.vigente=Boolean.parseBoolean(cadenaProducto[2]);
            p.categoria=cadenaProducto[3];
            pq.add(p);
        }
        while(!pq.isEmpty()){
            Producto p=pq.poll();
            System.out.println(p.producto+" "+p.precio+" "+p.vigente+" "+p.categoria);
        }
    }
}

/*
8
Coca-Cola 4l,55,true,Bebidas
Audifonos Beat Audio,4000,true,Audio
Tenis Nike Hombre X,1500,true,Calzado
Tenis Puma Dama Y,1000,true,calzado
Coca-Cola 1l,30,false,Bebidas
Bocina JBL Z,15000,true,Audio
Cuerdas Fender,350,true,Instrumentos musicales
Tenis Nike Volver al futuro,30000,false,Calzado
*/

