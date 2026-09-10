/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_unidad3;

import java.util.EmptyStackException;

/**
 *
 * @author paveg
 */
public interface TDAPila<T> {
    void agregar(T elemento);
    T quitar() throws EmptyStackException;
    boolean estaVacia();
    T cima() throws EmptyStackException;
}
