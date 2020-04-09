package guia05.problema02_herenciaYsobrescritura;

import guia05.problema03_interfaces.Comisionable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido implements Comisionable{
    protected int productosMax;
    LocalDate date;
    ArrayList<Producto> productos = new ArrayList<Producto>();

    public Pedido(int max,LocalDate fecha){
        productosMax = max;
        date = fecha;
    }

    final public boolean agregarProducto(Producto p){
            if(productos.size() <= this.productosMax){
                productos.add(p);
                return true;
            }
            return false;
    }
    public double precio(){return 0;}
    public double comision(){return 0;}


}
