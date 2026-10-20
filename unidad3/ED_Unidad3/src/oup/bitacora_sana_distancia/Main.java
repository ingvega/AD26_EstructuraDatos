/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oup.bitacora_sana_distancia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author alexis_guillen
 */
public class Main {

    public static void main(String[] ayjaja) throws IOException{
        BufferedReader lector = new BufferedReader(
                new InputStreamReader(System.in));
//        if (!sn.hasNextInt()) return;
        int N = Integer.parseInt(lector.readLine());
        int[] D = new int[N];
        String lineaDuraciones = lector.readLine();
        String[] duraciones = lineaDuraciones.split(" ");
        for (int i = 0; i < N; i++) {
            D[i] = Integer.parseInt(duraciones[i]);
        }
        String[] P = new String[N];
        for (int i = 0; i < N; i++) {
            P[i] = lector.readLine();
        }
        Pila<String> datos = new Pila<>();
        int minuto = 1, libreEn = 1, llamadas = 0, idx = 0;
        while (llamadas < N) {
            if (minuto <= N) {
                datos.agregar(P[idx++]);
            }
            if (minuto >= libreEn && !datos.estaVacia()) {
                System.out.println(datos.quitar());
                libreEn = minuto + D[llamadas++];
            }
            minuto++;
        }
    }
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
    }

    @Override
    public boolean estaVacia() {
        if (canElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T cima() throws EmptyStackException {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        return (T) elementos[canElementos - 1];
    }
}

interface TDAPila<T> {

    void agregar(T elemento);

    T quitar() throws EmptyStackException;

    boolean estaVacia();

    T cima() throws EmptyStackException;
}