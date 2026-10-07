/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author paveg
 */
public class Lista<T> extends TDALista<T> implements Iterable<T> {

    @Override
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (estaVacia()) { // Primer elemento de la cola
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // Ya hay al menos un elemento en la cola
            ultimo.siguiente = nuevoNodo; // El último actual apunta al nuevo
            nuevoNodo.anterior = ultimo;
            ultimo = nuevoNodo;           // El nuevo nodo ahora es el último oficial
        }

        indice++;

    }

    @Override
    public T quitar() throws ColaVaciaException {
        if (estaVacia()) {
            throw new ColaVaciaException();
        }

        T datoRetornado = (T) primero.dato; // Respaldamos el dato a devolver antes de perder  // la referencia
        primero = primero.siguiente;       // Avanzamos el primero al siguiente nodo

        // Si el primero pasa a ser null, la cola se vació por completo
        if (primero == null) {
            ultimo = null;
        }
        indice--;
        return datoRetornado;

    }

    @Override
    public T consultarPrimero() throws NoSuchElementException {
        if (estaVacia()) {
            throw new NoSuchElementException("Colección vacía");
        }

        return (T) primero.dato;
    }

    @Override
    public T consultarUltimo() throws NoSuchElementException {
        if (estaVacia()) {
            throw new NoSuchElementException("Colección vacía");
        }

        return (T) ultimo.dato;
    }

    @Override
    public boolean estaVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
        //return primero==null;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorLista<>(this);
    }

    @Override
    public int tamanio() {
        return indice;
    }

    @Override
    public T eliminar(int index) {
        if (indice <= index) {
            throw new IndexOutOfBoundsException("El indice  " + index + " no existe ");
        }
        if (index == 0) {
            try {
                return quitar();
            } catch (Exception e) {
                //return null;
            }
        }
        Nodo actual = primero;
        for (int i = 0; i < index - 1; i++) {
            actual = actual.siguiente;
        }
        T dato = (T) actual.siguiente.dato;
        actual.siguiente = actual.siguiente.siguiente;
        return dato;
    }

    @Override
    public boolean eliminar(T objeto) {
        Nodo actual = primero;
        
        for (int i = 0; i < indice; i++) {
            
            if (objeto == null) {
                if (actual.dato == null) {
                    if(indice==1){
                        primero=null;
                        ultimo=null;
                    }
                    if (actual == primero) {
                        primero = actual.siguiente;
                        primero.anterior = null;
                    } else {
                        actual.anterior.siguiente = actual.siguiente;
                    }
                    if (actual == ultimo) {
                        ultimo = actual.anterior;
                        ultimo.siguiente = null;
                    } else {
                        actual.siguiente.anterior = actual.anterior;
                    }
                    return true;
                }
                
            } else {
                if (objeto.equals(actual.dato)) {
                    if(indice==1){
                        primero=null;
                        ultimo=null;
                    }
                    if (actual == primero) {
                        primero = actual.siguiente;
                        primero.anterior = null;
                    } else {
                        actual.anterior.siguiente = actual.siguiente;
                    }
                    if (actual == ultimo) {
                        ultimo = actual.anterior;
                        ultimo.siguiente = null;
                    } else {
                        actual.siguiente.anterior = actual.anterior;
                    }
                    return true;
                }
                
            }
            actual=actual.siguiente;
        }
        return false;
    }

    @Override
    public int ubicacionDe(T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregar(T objeto, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reemplazar(T objeto, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void obtener(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
