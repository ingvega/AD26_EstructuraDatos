package oup.ultimosprimeros;


import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String nombre=lector.nextLine();
        Pila<String> nombres = new Pila<>();
        while(!nombre.equals("#")){
            nombres.agregar(nombre);
            nombre=lector.nextLine();
        }
        
        while(!nombres.estaVacia())
            System.out.println(nombres.quitar());
    }
}

interface TDAPila<T> {
    void agregar(T elemento);
    T quitar() throws EmptyStackException;
    boolean estaVacia();
    T cima() throws EmptyStackException;
}

class Pila<T> implements TDAPila<T> {
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