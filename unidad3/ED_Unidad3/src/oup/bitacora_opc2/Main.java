/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oup.bitacora_opc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        Pila<String> pila = new Pila<>();
        int n = Integer.parseInt(br.readLine());
        int cont = 0;
        int duraciones[] = new int[n];
        String strDuraciones[] = br.readLine().split(" ");
        int i = 0;
        for (String strDuracion : strDuraciones) {
            duraciones[i] = Integer.parseInt(strDuracion);
            i++;
        }
        StringBuilder concatenador = new StringBuilder();
        for (i = 0; i < n; i++) {
            for (int j = 0; j < duraciones[i]; j++) {
                try {
                    if (j == 0 && !(cont >= n)) {
                        concatenador.append(br.readLine());
                        concatenador.append("\n");
                        cont++;
                    } else if (!(cont >= n)) {
                        pila.agregar(br.readLine());
                        cont++;
                    }
                } catch (Exception e) {

                }
            }
        }
        while (!pila.estaVacia()) {
            concatenador.append(pila.quitar());
            concatenador.append("\n");
        }
        System.out.println(concatenador);

    }
}

interface TDAPila<T> {

    void agregar(T elemento);

    T quitar() throws EmptyStackException;

    boolean estaVacia();

    T cima() throws EmptyStackException;
}

class Pila<T> implements TDAPila<T> {

    final int capacidad = 10;
    Object elementos[] = new Object[capacidad];
    int canElementos = 0;

    @Override
    public void agregar(T elemento) {
        if (canElementos == elementos.length) {
            elementos = Arrays.copyOf(elementos, canElementos + capacidad);
        }
        elementos[canElementos++] = elemento;
    }

    @Override
    public T quitar() throws EmptyStackException {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        T valorAQuitar = (T) elementos[--canElementos];
        return valorAQuitar;

        //return (T)elementos[--canElementos];
    }

    @Override
    public boolean estaVacia() {
        if (canElementos == 0) {
            return true;
        } else {
            return false;
        }
        // return canElementos==0;
    }

    @Override
    public T cima() throws EmptyStackException {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        return (T) elementos[canElementos - 1];
    }

}
