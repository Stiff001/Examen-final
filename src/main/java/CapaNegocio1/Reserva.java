/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio1;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author User
 */
public class Reserva {
 
    public ArrayList<Pasajero> pertenece = new ArrayList();    
    public Tour corresponde;

    private String cantidadPersonas;
    private String precio;
    private String nroReserva;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Pasajero> getPertenece() {
        return pertenece;
    }

    public void setPertenece(ArrayList<Pasajero> pertenece) {
        this.pertenece = pertenece;
    }

    public Tour getCorresponde() {
        return corresponde;
    }

    public void setCorresponde(Tour corresponde) {
        this.corresponde = corresponde;
    }

    public String getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(String cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(String NroReserva) {
        this.nroReserva = NroReserva;
    }

   
}
