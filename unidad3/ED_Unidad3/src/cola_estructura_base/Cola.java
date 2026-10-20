/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola_estructura_base;

/**
 *
 * @author paveg
 */
public class Cola<T> extends TDACola<T> {

    @Override
    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (estaVacia()) { // Primer elemento de la cola
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // Ya hay al menos un elemento en la cola
            ultimo.siguiente = nuevoNodo; // El último actual apunta al nuevo
            ultimo = nuevoNodo;           // El nuevo nodo ahora es el último oficial
        }

    }

    @Override
    public T desencolar() throws ColaVaciaException {
        if (estaVacia()) {
            throw new ColaVaciaException();
        }

        T datoRetornado = (T) primero.dato; // Respaldamos el dato a devolver antes de perder  // la referencia
        primero = primero.siguiente;       // Avanzamos el primero al siguiente nodo

        // Si el primero pasa a ser null, la cola se vació por completo
        if (primero == null) {
            ultimo = null;
        }

        return datoRetornado;

    }

    @Override
    public T consultarPrimero() throws ColaVaciaException {
        if (estaVacia()) {
            throw new ColaVaciaException();
        }

        return (T) primero.dato;
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

}
