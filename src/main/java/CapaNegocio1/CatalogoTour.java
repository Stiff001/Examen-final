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
public class CatalogoTour {
    public Agencia contiene;
    public ArrayList<Tour> integra = new ArrayList();

    private String cantidadNoches;
    private String lugar;

    public Agencia getContiene() {
        return contiene;
    }

    public void setContiene(Agencia contiene) {
        this.contiene = contiene;
    }

    public ArrayList<Tour> getIntegra() {
        return integra;
    }

    public void setIntegra(ArrayList<Tour> integra) {
        this.integra = integra;
    }

    public String getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(String cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

}
