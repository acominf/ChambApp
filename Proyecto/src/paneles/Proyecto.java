package paneles;

import java.io.Serializable;


/**
 * Clase encargada de la creación del objeto proyecto
 */
public class Proyecto implements Serializable{
    private String nombre;
    private String descripcion;
    private boolean empresa;
    private float monto;
    /**
     * Constructor de un proyecto vacío
     */
    public Proyecto(){
        nombre = "";
        descripcion ="";
        empresa = false;
        monto = 0;
    }
    /**
     * Constructor objeto proyecto con parametros específicos
     * @param nombre
     * @param descripcion
     * @param empresa
     * @param monto 
     */
    public Proyecto(String nombre, String descripcion, boolean empresa,float monto){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.monto = monto;
    }
    /**
     * Método de acceso atributo nombre
     * @return El nombre del proyecto;
     */
    public String getNombre(){
        return nombre;
    }/**
     * Método de acceso atributo descripción
     * @return Descripción del proyecto
     */
    public String getDescripcion(){
        return descripcion;
    }
    /**
     * Método de accesos empresa
     * @return Empresa consolidada o no
     */
    public boolean getEmpresa(){
        return empresa;
    }
    /**
     * Método de acceso atributo monto
     * @return El monto total del proyecto
     */
    public float getMonto(){
        return monto;
    }
    /**
     * Método de modificación atributo nombre
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método de modificación atributo descripción
     * @param descripcion 
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    /**
     * Método de modificación atributo empresa
     */
    public void setEmpresa(){
        this.empresa = true;
    }
    /**
     * Método de modificación atributo monto
     * @param monto 
     */
    public void setMonto(float monto){
        this.monto = monto;
    }
}
