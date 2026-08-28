/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_unidad2;

/**
 *
 * @author paveg
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(division(9,2));
        System.out.println(divisionRecursiva(9,2));
    }
    
    public static int division(int dividendo, int divisor){
        int veces=0;
        //Verificar que cabe al menos una vez
        while(divisor<=dividendo){
            //Restas continuas
            dividendo-=divisor;
            veces++;
        }
        return veces;
        
    }
    
//    public static int divisionRecursiva(int queda, int divisor){
//        //Caso base(ya acabe)
//        if(queda==divisor){
//            return 1;
//        }else if(queda<divisor){//Caso base(ya acabe)
//            return 0;
//        }else{
//            queda-=divisor;
//            return divisionRecursiva(queda,divisor)+1;
//        }
//    }
    public static int divisionRecursiva(int queda, int divisor){
        return divisionRecursiva(queda, divisor, 0);
    }
    private static int divisionRecursiva(int queda, int divisor,int veces){
        //Caso base(ya acabe)
        if(queda==divisor){
            return veces+1;
        }else if(queda<divisor){//Caso base(ya acabe)
            return veces;
        }else{
            queda-=divisor;
            veces+=1;
            return divisionRecursiva(queda,divisor,veces);
        }
    }
    
}
