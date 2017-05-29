package elementos;

import java.io.Serializable;


/**
 *
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
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public boolean getEmpresa(){
        return empresa;
    }
    public float getMonto(){
        return monto;
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
