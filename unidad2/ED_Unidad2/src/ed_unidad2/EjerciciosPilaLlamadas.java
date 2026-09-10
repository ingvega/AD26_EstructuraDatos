/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_unidad2;

/**
 *
 * @author paveg
 */
public class EjerciciosPilaLlamadas {
    public static void main(String[] args) {
        System.out.println(m(25));
    }
    
    public static String m(int n){
        if(n<2){
            return n+"";
        }
        return m(n/2)+n%2;
    }
    
    
    
    
    
    
    //e("Hola")
    public static String e(String c){
        if(c.length()==0){
            return "";
        }
        char l=c.charAt(0);
        return Character.toString(l-1)+
                e(c.substring(1))+
                Character.toString(l+1);
    }
}
