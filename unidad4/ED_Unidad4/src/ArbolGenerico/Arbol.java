/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolGenerico;

/**
 *
 * @author paveg
 */
public class Arbol<T> {

    private Nodo<T> raiz;

    public boolean agregar(T valor) {
        //No aceptar null
        if (valor == null) {
            return false;
        }

        //El arbol esta vacio
        Nodo<T> nuevo = new Nodo<>();
        nuevo.valor = valor;
        if (raiz == null) {
            raiz = nuevo;
            return true;
        } else {
            Nodo<T> ubicacion = buscar(valor, raiz);
            Comparable comparable = (Comparable) valor;
            if (ubicacion == null) //Si está repetido no añadirlo
            {
                return false;
            }
            if (comparable.compareTo(ubicacion.valor) > 0) {
                //Añadir a la derecha del nodo encontrado
                //Ya que el valor a añadir es más grande que el nodo encontrado
                ubicacion.derecha = nuevo;
            } else {
                ubicacion.izquierda = nuevo;
            }
            return true;
        }
    }

    private Nodo<T> buscar(T valor, Nodo<T> nodo) {
        Comparable comparable = (Comparable) valor;

        //Encontramos un nodo con el mismo valor a agregar
        if (comparable.compareTo(nodo.valor) == 0) {
            return null;
        }
        //Encontramos un antecesor y no puede moverse mas
        if (comparable.compareTo(nodo.valor) < 0) {
            if (nodo.izquierda == null) {
                return nodo;
            } else {
                return buscar(valor, nodo.izquierda);
            }
        } else {
            if (nodo.derecha == null) {
                return nodo;
            } else {
                return buscar(valor, nodo.derecha);
            }
        }
    }
    
    public void imprimir() {
        imprimir(raiz);
    }
    private void imprimir(Nodo<T> inicio) {
        //Imprimir el izquierdo
        if (inicio.izquierda != null) {
            imprimir(inicio.izquierda);
        }
        //Imprimir la raiz(inicio)
        System.out.println(inicio.valor);
        //Imprimir el derecho
        if (inicio.derecha != null) {
            imprimir(inicio.derecha);
        }

    }
}
