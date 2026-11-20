/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolGenerico;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Arbol<String> cadenas=new Arbol<>();
        cadenas.agregar("ejemplo");
        cadenas.agregar("nuevo");
        cadenas.agregar("alfabeto");
        cadenas.agregar("palabra");
        cadenas.agregar("blanco");
        cadenas.agregar("amarillo");
        cadenas.agregar("ejemplo");
        cadenas.imprimir();
        System.out.println("================================");
        Arbol<Integer> numeros=new Arbol<>();
        numeros.agregar(20);
        numeros.agregar(1);
        numeros.agregar(90);
        numeros.agregar(5);
        numeros.agregar(8);
        numeros.agregar(0);
        numeros.agregar(20);
        numeros.agregar(20);
        numeros.agregar(20);
        numeros.agregar(20);
        numeros.imprimir();
    }
}
