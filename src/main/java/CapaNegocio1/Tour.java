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
public class Tour {
    public ArrayList<Reserva> corresponde = new ArrayList();
    public CatalogoTour integra;
    public ArrayList<Alojamiento> Dispone = new ArrayList();
    public ArrayList<Horario> tiene = new ArrayList();
    public ArrayList<Guia> posee = new ArrayList();

    private String promociones;
    private String descripcion;

    public ArrayList<Reserva> getCorresponde() {
        return corresponde;
    }

    public void setCorresponde(ArrayList<Reserva> corresponde) {
        this.corresponde = corresponde;
    }

    public CatalogoTour getIntegra() {
        return integra;
    }

    public void setIntegra(CatalogoTour integra) {
        this.integra = integra;
    }

    public ArrayList<Alojamiento> getDispone() {
        return Dispone;
    }

    public void setDispone(ArrayList<Alojamiento> Dispone) {
        this.Dispone = Dispone;
    }

    public ArrayList<Horario> getTiene() {
        return tiene;
    }

    public void setTiene(ArrayList<Horario> tiene) {
        this.tiene = tiene;
    }

    public ArrayList<Guia> getPosee() {
        return posee;
    }

    public void setPosee(ArrayList<Guia> posee) {
        this.posee = posee;
    }

    public String getPromociones() {
        return promociones;
    }

    public void setPromociones(String promociones) {
        this.promociones = promociones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
