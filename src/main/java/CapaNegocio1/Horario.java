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
public class Horario {
    public ArrayList<Tour> tiene = new ArrayList();

    private String horarioSalida;
    private String horarioLLegada;
    private String horarioDescanso;

    public ArrayList<Tour> getTiene() {
        return tiene;
    }

    public void setTiene(ArrayList<Tour> tiene) {
        this.tiene = tiene;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLLegada() {
        return horarioLLegada;
    }

    public void setHorarioLLegada(String horarioLLegada) {
        this.horarioLLegada = horarioLLegada;
    }

    public String getHorarioDescanso() {
        return horarioDescanso;
    }

    public void setHorarioDescanso(String horarioDescanso) {
        this.horarioDescanso = horarioDescanso;
    }
}
