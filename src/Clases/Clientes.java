
package Clases;

import java.util.ArrayList;


public class Clientes {
    private String Nombre;
    private String Direccion;
    private ArrayList<Cuentas> cuentas;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void Obtenerbeneficio(){
    
   }

   

    @Override
    public String toString() {
        return Nombre + " " + Direccion ;
    }
    }
    

