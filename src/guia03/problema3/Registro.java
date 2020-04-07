package died.lab01.problema03;

import died.lab01.problema02.Temperatura;

public class Registro<i> {
    private int cantTemp;
    private String ciudad;
    private Temperatura[] historico;

    public Registro(){
        ciudad = "-";
        historico = new Temperatura[30];
        cantTemp = 0;
    }
    public Registro(String city){
        ciudad = city;
        historico = new Temperatura[30];
        cantTemp = 0;
    }
    public String getCiudad(){return ciudad;}
    public void agregar(Temperatura t){
        if(cantTemp < 30){historico[cantTemp] = t; cantTemp++;}
    }
    public void imprimir(){
        for(int i=0 ; i<cantTemp;i++){
            System.out.println(historico[i].asCelcius());
        }
    }
    public double mediaAsCelcius(){
        double sum = 0;
        for(int i=0;i<cantTemp;i++){
            sum+=historico[i].asCelcius();
        }
        return (sum/cantTemp);
    }
    public double mediaAsFahrenheit(){
        double sum = 0;
        for(int i=0;i<cantTemp;i++){
            sum+=historico[i].asFahrenheit();
        }
        return (sum/cantTemp);
    }
    public Temperatura maximo(){
        return calcularMayor(cantTemp,historico);
    }
    private Temperatura calcularMayor(int index, Temperatura[] T){
        if(index == 1){return T[index-1];}
        else{
            if(T[0].asCelcius() < T[index-1].asCelcius()){T[0] = T[index-1];}
            return calcularMayor(index-1,T);
        }
    }
}