package coldinamica;

import java.util.Arrays;

public class Coleccion<T> implements TDAColeccion<T> {

    private Object[] objetos = new Object[5];
    /**
     * Próxima posición válida para almacenar un nuevo dato (también coincidirá
     * con el tamaño de la colección)
     */
    private int cantidadElementos;

    @Override
    public boolean existe(T valor) {
        for (int i = 0; i < tamanio(); i++) {
            //if(obtener(i)==valor)
            if (objetos[i] == valor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int buscar(T valor) {
        for (int i = 0; i < tamanio(); i++) {
            //if(obtener(i)==valor)
            if (objetos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T obtener(int posicion) throws IndexOutOfBoundsException {

        if (posicion < 0 || posicion >= cantidadElementos) {
            throw new IndexOutOfBoundsException("La posición no se encuentra en la colección");
        }

//        System.out.print("El dato en la posición " + posicion + " es: ");
        return (T)objetos[posicion];

    }

    @Override
    public void sustituir(int posicion, T valor) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion >= this.cantidadElementos) {
            throw new IndexOutOfBoundsException("La posición no se encuentra en la colección");
        }
        objetos[posicion] = valor;
//        System.out.println("Se sustituyó correctamente el valor " + valor + " en la posicion " + posicion);
    }

    /**
     *
     * @param posicion
     * @param valor
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void agregar(int posicion, T valor) throws IndexOutOfBoundsException {
//        [10,3,8,0,0] tamanio=3
//                [5,10,3,8,0]
//                agregar(0,5)
        if (posicion < 0 || posicion > this.cantidadElementos) {
            throw new IndexOutOfBoundsException("La posición no es valida");
        }
        //Verificar si aun tengo espacio
        if (cantidadElementos == objetos.length) {
            objetos = Arrays.copyOf(objetos, objetos.length * 2);
        }
        //Recorrer los datos una posición a la derecha
        for (int i = this.cantidadElementos; i > posicion; i--) {
            objetos[i]=objetos[i-1];
        }
        objetos[posicion] = valor;
        cantidadElementos++;
    }

    /**
     * Añade un nuevo elemento en la siguiente posición disponible
     *
     * @param valor Entero que se añadirá a la colección
     */
    @Override
    public void agregar(T valor) {
        //Verificar si aun tengo espacio
        if (cantidadElementos == objetos.length) {
            objetos = Arrays.copyOf(objetos, objetos.length * 2);
        }
        objetos[cantidadElementos] = valor;
        cantidadElementos++;
    }

    /**
     * Representa la cantidad de valores que estan actualmente almacenados en la
     * colección
     *
     * @return Un entero con la cantidad de elementos
     */
    @Override
    public int tamanio() {
        return cantidadElementos;
    }

}
