package com.mycompany.ta10ut3;


public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    public void insertar(Nodo<T> nodo){
        if (this.primero == null){
            this.primero = nodo;
        } else{
            Nodo<T> actual = this.primero;
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> actual = this.primero;
                while(actual !=null){
                    if(actual.getEtiqueta().equals(clave)){
                        return actual;
                    }
                    actual=actual.getSiguiente();
                }
                return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public String imprimir(String separador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public int cantElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantElementos'");
    }

    @Override
    public boolean esVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esVacia'");
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrimero'");
    }

    public Nodo<T> getPrimero() {
        return this.primero;
    }

    // implementar los metodos indicados en la interfaz
}
