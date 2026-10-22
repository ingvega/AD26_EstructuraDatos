/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asesoria_PQ;

import java.util.Comparator;

/**
 *
 * @author paveg
 */
public class Orden implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        //Categoria (Ascendente,Alfabética),Vigente (vigente primero),Precio (mas bajo al más alto)
        if(o1.categoria.compareToIgnoreCase(o2.categoria)!=0){
            //La categoría me ayuda a ordenar
            return o1.categoria.compareToIgnoreCase(o2.categoria);
        }else{
            //La categoria es la misma para ambos productos revisar Vigente
            if(Boolean.compare(o1.vigente,o2.vigente)!=0){
                return Boolean.compare(o2.vigente,o1.vigente);
            }else{
                //Vigente de ambos productos fue igual
                return Float.compare(o1.precio,o2.precio);
            }
           
        }
    }
    
}
