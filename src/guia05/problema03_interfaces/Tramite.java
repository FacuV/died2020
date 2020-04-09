package guia05.problema03_interfaces;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tramite implements Comisionable {
    private String descripcion;
    private String domicilio;
    LocalDate fecha;
    LocalTime hora;
    public Tramite(String desc,String dom,LocalDate date, LocalTime hour){
        descripcion = desc;
        domicilio = dom;
        fecha = date;
        hora = hour;
    }

    @Override
    public double precio() {
        return 50;
    }

    @Override
    public double comision() {
         if(fecha.isBefore(LocalDate.now()) && hora.isBefore(LocalTime.now())){return 20;}
         return 0;
    }
}
