package died.lab01.problema02;

public class Temperatura {
    private double grados;
    private Escala escala;

    public Temperatura(){
        grados = 0;
        escala = Escala.CELCIUS;
    }
    public Temperatura(double gra,Escala esc){
        grados = gra;
        escala = esc;
    }
    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }
    public String toString(){
        String rtn;
        if(escala == Escala.CELCIUS){rtn = (Double.toString(grados)) + "C°";}
        else{rtn = (Double.toString(grados)) + "F°";}
        return rtn;
    }
    public Double asCelcius() {
        double rtn;
        if (escala == Escala.CELCIUS) {rtn = grados;
        }else{rtn = (grados - 32) * 5 / 9;}
        return rtn;
    }
    public Double asFahrenheit(){
        double rtn;
        if(escala == Escala.FAHRENHEIT){rtn = grados;}
        else{rtn = grados *9/5 +32;}
        return rtn;
    }
    public void aumentar(Temperatura temp) {
        if (temp.asCelcius() > 0) {
            if (escala == Escala.CELCIUS) {
                grados += temp.asCelcius();
            } else {
                grados += temp.asFahrenheit();
            }
        }
    }
    public void disminuir(Temperatura temp) {
        if (temp.asCelcius() > 0) {
            if (escala == Escala.CELCIUS) {
                grados -= temp.asCelcius();
            } else {
                grados -= temp.asFahrenheit();
            }
        }
    }

}
