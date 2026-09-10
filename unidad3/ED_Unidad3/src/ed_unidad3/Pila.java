/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_unidad3;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean estaVacia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T cima() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}












