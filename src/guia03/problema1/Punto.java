package died.lab01.problema01;

public class Punto {
    private float x;
    private float y;

    public Punto(float X, float Y) {
        x = X;
        y = Y;
    }
    public float getX(){return x;}
    public float getY(){return y;}
    public void setX(float newX){x = newX;}
    public void setY(float newY){y = newY;}
    public boolean equals(Punto otroP){
        boolean rtn;
        if(x == otroP.getX() && y == otroP.getY()){rtn = true;} else{rtn = false;}
        return rtn;
    }

}
