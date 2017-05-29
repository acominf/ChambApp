/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos;

import java.io.Serializable;

/**
 *
 * @author Jose Bernardo Bernal Cabrera
 */
public class Proyecto implements Serializable{
    private String nombre;
    private String descripcion;
    private boolean empresa;
    private float monto;
    public Proyecto(){
        nombre = "";
        descripcion ="";
        empresa = false;
        monto = 0;
    }
    public Proyecto(String nombre, String descripcion, boolean empresa,float monto){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.monto = monto;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setEmpresa(){
        this.empresa = true;
    }
    public void setMonto(float monto){
        this.monto = monto;
    }
}
