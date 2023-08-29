package com.mycompany.ta10ut3;

public interface IEmpresa {

    public void AgregarSucursal(Nodo<Sucursal> nodo);
    public void BuscarSucursal(String clave);
    public void QuitarSucursal(Nodo<Sucursal> nodo);

    public void Listar();

    public int cantSucursales();

    public boolean esVacio();




}
