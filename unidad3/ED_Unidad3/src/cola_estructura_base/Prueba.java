/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola_estructura_base;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) throws ColaVaciaException {
        Cola<String> valores=new Cola<>();
        valores.encolar("A");
        valores.encolar("B");
        valores.encolar("C");
        valores.encolar("D");
        while(!valores.estaVacia()){
            System.out.println(valores.desencolar());
        }
        valores.desencolar();
    }
}
