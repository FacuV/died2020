package guia05.ejecucion;

import guia05.problema01_sobrecarga.Camino;
import guia05.problema01_sobrecarga.Coordenada;
import java.util.ArrayList;

public class PruebaGuia05 {
    public void ejecutarPrueba(){
        //pruebas ejercicio01
        Camino camino = new Camino();
        Coordenada no = new Coordenada(10,-10);
        Coordenada se = new Coordenada(-10,10);
        Coordenada centro = new Coordenada(10,10);
        for(int i=0;i < 10;i++){
            camino.agregar(Math.random()*10,Math.random()*10);
            System.out.println(camino.getCoordenadas().get(i).toString());
        }
        System.out.println(" ");
        camino.agregar(111000,111000);
        System.out.println(camino.getCoordenadas().get(camino.getCoordenadas().size()-1).toString());
            //ArrayList<Coordenada> dentroLimite = camino.buscar(no,se);
            //System.out.println(" ");
            //for(int i=0;i<dentroLimite.size();i++){
            //    System.out.println(dentroLimite.get(i).toString());
            //}
        System.out.println(" ");
        ArrayList<Coordenada> dentroLimite = camino.buscar(centro,500000);
        for(int i=0;i<dentroLimite.size();i++){
            System.out.println(i+" "+dentroLimite.get(i).toString());
        }
    }

    }

