/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio1;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Alojamiento {
    public ArrayList<Alojamiento> Dispone = new ArrayList();

    private String ubicacion;
    private String precio;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alojamiento> getDispone() {
        return Dispone;
    }

    public void setDispone(ArrayList<Alojamiento> Dispone) {
        this.Dispone = Dispone;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
