package died.lab01.problema01;

public class Recta {
    private Punto P1;
    private Punto P2;

    public Punto getP1() {
        return P1;
    }

    public void setP1(Punto p1) {
        P1 = p1;
    }

    public Punto getP2() {
        return P2;
    }

    public void setP2(Punto p2) {
        P2 = p2;
    }

    public Recta(Punto punto1, Punto punto2){
        P1 = punto1;
        P2 = punto2;
    }
    public Recta(){
        P1 = new Punto(1.0f,1.0f);
        P2 = new Punto(2.0f,2.0f);
    }
    public float pendiente(){
        float m = (P2.getY()-P1.getY())/(P2.getX()-P1.getX());
        return m;
    }
    public boolean paralelas(Recta otraR){
        boolean rtn;
        if(this.pendiente()==otraR.pendiente()){rtn=true;}else{rtn=false;}
        return rtn;
    }
    public boolean equals(Recta otraR){
        boolean rtn = false;
        Recta R3;
        if((this.getP1()==otraR.getP1() && this.getP2()==otraR.getP2()) || (this.getP1()==otraR.getP2() && this.getP2()==otraR.getP1())){rtn = true;}
        else{
            if(this.getP1() != otraR.getP2()){
                R3 = new Recta(this.getP1(), otraR.getP2());
            }else{
                R3 = new Recta(this.getP1(), otraR.getP2());
            }
            if(otraR.pendiente() == R3.pendiente()){rtn = true;}
        }
        return rtn;
    }

}
