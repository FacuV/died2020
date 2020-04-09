package guia05.problema02_herenciaYsobrescritura;

import guia05.problema03_interfaces.Comisionable;

import java.util.ArrayList;

public class Cadete {

    ArrayList<Comisionable> comisionables = new ArrayList<Comisionable>();

    public void agregarComisionable(Comisionable c){comisionables.add(c);}
    public double comisiones(){
        double comision = 0;
        for(int i=0;i < comisionables.size();i++){
            comision += comisionables.get(i).comision();
        }
        return comision;
    }

}
