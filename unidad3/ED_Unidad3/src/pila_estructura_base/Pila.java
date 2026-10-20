/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila_estructura_base;

import java.util.EmptyStackException;
import java.util.Arrays;
/**
 *
 * @author paveg
 */
public class Pila<T> implements TDAPila<T> {
    final int capacidad=10;
    Object elementos[]=new Object[capacidad];
    int canElementos=0;
    
    @Override
    public void agregar(T elemento) {
        if(canElementos==elementos.length)
            elementos=Arrays.copyOf(elementos, canElementos+capacidad);
        elementos[canElementos++]=elemento;
    }

    @Override
    public T quitar() throws EmptyStackException {
        if(estaVacia())
            throw new EmptyStackException();
        
        T valorAQuitar=(T)elementos[--canElementos];
        return valorAQuitar;
        
        //return (T)elementos[--canElementos];
    }

    @Override
    public boolean estaVacia() {
        if(canElementos==0)
            return true;
        else
            return false;
       // return canElementos==0;
    }

    @Override
    public T cima() throws EmptyStackException {
        if(estaVacia())
            throw new EmptyStackException();
        
        return (T)elementos[canElementos-1];
    }
    
}












