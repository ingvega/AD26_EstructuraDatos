
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Torneo {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String linea;
        //Almacenará los nombres únicos todos sin repetición
        HashMap<String,Integer> nombresUnicos=new HashMap<>();
        //Almacenará los nombres respetanto el orden en el que aparecieron 
        //por primera vez
        ArrayList<String> nombres=new ArrayList<>();
/*
okja
porky
petunia
babe
peggy
Porky
oKJa
#
*/     
        while((linea=lector.nextLine()).equals("#")==false){
            Integer posicion=nombresUnicos.putIfAbsent(linea.toLowerCase(), nombres.size());
            if(posicion!=null){
                //Existe y vamos a reemplazar en la lista su forma de escritura
                //por si acaso cambió
                nombres.set(posicion,linea);
            }else{
                //Añade la primera aparición del nombre
                nombres.add(linea);
            }
        }
      
        //Imprime todos los nombres en el orden en el que aparecieron
        //la primera vez
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        
//        linea=lector.nextLine();
//        do{
//            if(!linea.equals("#"))
//                procesar la linea
//            else
//                break;
//            linea=lector.nextLine();
//        }while(!linea.equals("#"));
    }
}
