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
public class Agencia {

    public CatalogoTour catalogoAsign;
    public Agencia(){
        catalogoAsign = new CatalogoTour();
    }

    private String nombre;
    private String ubicacion;
    private String contacto;

    public CatalogoTour getCatalogoAsign() {
        return catalogoAsign;
    }

    public void setCatalogoAsign(CatalogoTour catalogoAsign) {
        this.catalogoAsign = catalogoAsign;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

}
