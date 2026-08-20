/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coldinamica;

/**
 *
 * @author paveg
 */
public class PruebaProducto {
    public static void main(String[] args) {
        Coleccion<Producto> productos=new Coleccion<>();
        Producto agua=new Producto(1,"Agua",15);
        productos.agregar(agua);
        //Instancia anonima
        productos.agregar(new Producto(5,"Galletas",18));
        
        Producto galletas=new Producto(5,"Galletas",18);
        System.out.println(productos.existe(galletas));
        for (int i = 0; i < productos.tamanio(); i++) {
            System.out.println(productos.obtener(i));
        }
    }
}
