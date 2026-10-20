/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola_estructura_base;

/**
 *
 * @author paveg
 */
public abstract class TDACola<T> {
    Nodo<T> primero;
    Nodo<T> ultimo;
            
    public abstract void encolar(T dato);
    public abstract T desencolar() throws ColaVaciaException;
    public abstract T consultarPrimero() throws ColaVaciaException;
    public abstract boolean estaVacia();
    
    class Nodo<T>{
        T dato;
        Nodo<T> siguiente;
        
        public Nodo(T dato){
            this.dato=dato;
        }
    }
}
