package com.mycompany.ta10ut3;

public class Empresa implements IEmpresa{

    private Lista<Sucursal> sucursales;

    private String nombre;

    public Empresa(String nombre){
        this.nombre=nombre;
    }
    public void AgregarSucursal(Nodo<Sucursal> nodo){
            
          sucursales.insertar(nodo);
    }
    public void BuscarSucursal(String clave){
        sucursales.buscar(clave);
    }
    public void QuitarSucursal(Nodo<Sucursal> nodo){
        
        sucursales.eliminar(nodo.getEtiqueta());
    }

    public void Listar(){
        sucursales.imprimir();

    }

    public int cantSucursales(){
       return  sucursales.cantElementos();

    }

    public boolean esVacio(){
        return sucursales.esVacia();

    }
    



}
