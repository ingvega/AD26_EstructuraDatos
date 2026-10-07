/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author paveg
 */
public class PruebaLista {
    public static void main(String[] args) {
        Lista<Integer> numeros=new Lista<>();
        for (int i = 1; i <= 10; i++) {
            numeros.agregar(i);
        }
        
//        for (Integer numero : numeros) {
//            System.out.println(numero);
//        }
        numeros.eliminar(3); //public T eliminar(int index) {
        numeros.eliminar(new Integer(3)); // public boolean eliminar(T objeto) {
        numeros.forEach(numero->System.out.println(numero));
        
        
    }
}
