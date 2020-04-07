package guia05.problema01_sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class Camino {
    ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();

    public ArrayList<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void agregar(Coordenada x){
        coordenadas.add(x);
    }
    public void agregar(double lat, double lon) {
        Coordenada coord = new Coordenada(lat,lon);
        coordenadas.add(coord);
    }
    public void agregar(int lat,int lon){
        double latitud,longitud;
        Coordenada coordPrevia;
        coordPrevia = coordenadas.get(coordenadas.size()-1);
        latitud = coordPrevia.getLatitud() + (double) (lat/1000)/(111*Math.cos(coordPrevia.getLatitud()*3.14159265359/180)) ;
        longitud = coordPrevia.getLongitud() + (double) (lon/1000)/111;

        Coordenada coord = new Coordenada(latitud,longitud);
        coordenadas.add(coord);
    }
    public ArrayList<Coordenada> buscar(Coordenada no, Coordenada se){
        ArrayList<Coordenada> coordEnLimite = new ArrayList<Coordenada>();
        for(int i=0;i < coordenadas.size();i++){
            if(coordenadas.get(i).getLatitud() <= no.getLatitud() && coordenadas.get(i).getLongitud() >= no.getLongitud()) {
                if(coordenadas.get(i).getLatitud() >= se.getLatitud() && coordenadas.get(i).getLongitud() <= se.getLongitud()){
                    coordEnLimite.add(coordenadas.get(i));
                }
            }
        }
        return coordEnLimite;
    }
    public ArrayList<Coordenada> buscar(Coordenada central,int radio){
        ArrayList<Coordenada> coordEnLimite = new ArrayList<Coordenada>();
        Coordenada no,se;
        no = new Coordenada(central.getLatitud()+(double)((radio/1000)/111),central.getLongitud()-(double)((radio/1000)/111));
        se = new Coordenada(central.getLatitud()-(double)((radio/1000)/111),central.getLongitud()+(double)((radio/1000)/111));
        for(int i=0;i < coordenadas.size();i++){
            if(coordenadas.get(i).getLatitud() <= no.getLatitud() && coordenadas.get(i).getLongitud() >= no.getLongitud()) {
                if(coordenadas.get(i).getLatitud() >= se.getLatitud() && coordenadas.get(i).getLongitud() <= se.getLongitud()){
                    coordEnLimite.add(coordenadas.get(i));
                }
            }
        }
        return coordEnLimite;
    }

}

