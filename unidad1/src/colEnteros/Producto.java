/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colEnteros;

import coldinamica.*;

/**
 *
 * @author paveg
 */
public class Producto {
    private int clave;
    private String nombre;
    private float precio;

    public Producto(int clave, String nombre, float precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
    }

    
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
