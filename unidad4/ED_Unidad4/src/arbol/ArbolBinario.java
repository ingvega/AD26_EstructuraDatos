/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author paveg
 */
public class ArbolBinario {

    Nodo raiz;

    public void agregar(int dato) {
        Nodo paquete = new Nodo();
        paquete.valor = dato;
        //Es el primer dato
        if (raiz == null) {
            raiz = paquete;
        } else {
            //Encontrar donde colocar el nuevo paquete
            Nodo raiz = buscarRaiz(dato, this.raiz);
            if (raiz.valor <= dato) {
                raiz.derecha = paquete;
            } else {
                raiz.izquierda = paquete;
            }
        }
    }

    public int contarHijos(Nodo donde) {
        int lol = 0;
        if (donde.derecha != null) {
            lol += contarHijos(donde.derecha) + 1;
        }        
        if (donde.izquierda != null) {
            lol += contarHijos(donde.izquierda) + 1;
        }
        return lol;
    }

    public Nodo buscar(int valor, Nodo donde) {
        if (donde.valor == valor) {
            return donde;
        }
        if (donde.valor < valor) {
            if (donde.derecha != null) {
                //donde = donde.derecha;
                return buscar(valor, donde.derecha);
            }
        } else {
            if (donde.izquierda != null) {
                return buscar(valor, donde.izquierda);
            }
        }
        return null;
    }

    private Nodo buscarRaiz(int valor, Nodo donde) {
        if (donde.valor <= valor) {
            if (donde.derecha != null) {
                //donde = donde.derecha;
                return buscarRaiz(valor, donde.derecha);
            } else {
                return donde;
            }
        } else {
            if (donde.izquierda != null) {
                return buscarRaiz(valor, donde.izquierda);
            } else {
                return donde;
            }
        }
    }

    public void imprimir() {
        imprimir(raiz);
    }

    private void imprimir(Nodo inicio) {

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
//    10
//    20 10 25 9 13 11 10 12 24 26
//    10

//    rh(7)
//    rh(3)
//    rh(1)
//    rh(2)
//     "2 "

//    public String recolectarHojas(Nodo inicio) {
//
//        //Caso base
//        if (inicio.izquierda == null
//                && inicio.derecha == null) {
//            return inicio.valor + " ";
//        } else {
//            String hojas="";
//            //buscar hojas a la izquierda
//            if (inicio.izquierda != null) {
//               hojas+=recolectarHojas(inicio.izquierda);
//            }
//
//            //Buscar hojas a la derecha
//            if (inicio.derecha != null) {
//                hojas+=recolectarHojas(inicio.derecha);
//            }
//            return hojas;
//        }        
//    }
    class Nodo {

        int valor;
        Nodo izquierda;
        Nodo derecha;
    }
}
