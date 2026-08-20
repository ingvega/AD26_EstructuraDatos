/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colEnteros;

import coldinamica.*;
import java.util.Arrays;
/**
 *
 * @author paveg
 */
public class ColeccionEnteros implements TDAColeccion {
    private int[] enteros=new int[5];
    /**
     * Próxima posición válida para almacenar 
     * un nuevo dato (también coincidirá con el tamaño
     * de la colección)
     */
    private int posicion;
            
    @Override
    public boolean existe(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int buscar(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int obtener(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * 
     * @param posicion
     * @param valor
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public void agregar(int posicion, int valor) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
/**
 * Añade un nuevo elemento en la siguiente posición disponible
 * @param valor Entero que se añadirá a la colección
 */
    @Override
    public void agregar(int valor) {
        //Verificar si aun tengo espacio
        if(posicion==enteros.length)
            enteros=Arrays.copyOf(enteros,enteros.length*2);
        enteros[posicion]=valor;
        posicion++;
    }

    @Override
    public void sustituir(int posicion, int valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /** 
     * Representa la cantidad de valores
     * que estan actualmente almacenados
     * en la colección
     * @return Un entero con la cantidad de elementos
     */
    @Override
    public int tamanio() {
        return posicion;
    }
    
}
