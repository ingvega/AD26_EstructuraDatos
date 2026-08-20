package colEnteros;

public interface TDAColeccion {

    boolean existe(int valor);
    int buscar(int valor);
    int obtener(int posicion);
    void agregar(int posicion, int valor);
    void agregar(int valor);
    void sustituir(int posicion, int valor);
    int tamanio();

}
