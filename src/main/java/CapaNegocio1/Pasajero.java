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
public class Pasajero {
    
    public ArrayList<Reserva> pertenece = new ArrayList();    

    
    private String dniOpasaporte;
    private String contactoCelular;

    public ArrayList<Reserva> getPertenece() {
        return pertenece;
    }

    public void setPertenece(ArrayList<Reserva> pertenece) {
        this.pertenece = pertenece;
    }

    public String getDniOpasaporte() {
        return dniOpasaporte;
    }

    public void setDniOpasaporte(String dniOpasaporte) {
        this.dniOpasaporte = dniOpasaporte;
    }

    public String getContactoCelular() {
        return contactoCelular;
    }

    public void setContactoCelular(String contactoCelular) {
        this.contactoCelular = contactoCelular;
    }
}
