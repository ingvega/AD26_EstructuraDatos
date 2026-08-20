package coldinamica;

public interface TDAColeccion<T> {

    boolean existe(T valor);
    int buscar(T valor);
    T obtener(int posicion);
    void agregar(int posicion, T valor);
    void agregar(T valor);
    void sustituir(int posicion, T valor);
    int tamanio();

}
