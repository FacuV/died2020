package guia05.problema01_sobrecarga;

public class Coordenada {
    double latitud,longitud;

    public Coordenada(){
        latitud = 0;
        longitud = 0;
    }
    public Coordenada(double lat, double lon){
        latitud = lat;
        longitud = lon;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }


    public boolean equals(Coordenada coord){
        boolean rtn = false;
        if(latitud == coord.getLatitud() && longitud == coord.getLongitud()){rtn = true;}
        return rtn;
    }
    public String toString(){
        return "("+ String.valueOf(latitud) +" , "+ String.valueOf(longitud) + ")";
    }
}


