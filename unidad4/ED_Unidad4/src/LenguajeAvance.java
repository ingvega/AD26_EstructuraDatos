
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class LenguajeAvance {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String linea[];
        HashMap<String,Integer> variables=new HashMap<>();
        
        while(lector.hasNextLine()){
            linea=lector.nextLine().split(" ");
            switch(linea[0]){
                case "VAR":
                    //Revisar si existe
                    if(variables.containsKey(linea[1])){
                       //Error
                    }else{
                        variables.put(linea[1], 0);
                    }
                case "INC":
                    //Revisar si existe
                    if(variables.containsKey(linea[1])){
                       variables.put(linea[1], variables.get(linea[1])+1);
                    }else{
                        //Error
                    }
                case "PRINT":
                    //Revisar si existe
                default:
                    //Revisar si existe
            }
        }
    }
}
