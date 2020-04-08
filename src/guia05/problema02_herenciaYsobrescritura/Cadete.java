package guia05.problema02_herenciaYsobrescritura;

import java.util.ArrayList;

public class Cadete {

    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void agregarPedido(Pedido p){
        pedidos.add(p);
    }
    public double comisiones() {
        double comision = 0;
        for(int i=0;i < pedidos.size();i++){
            comision += pedidos.get(i).comision();
        }
        return comision;
    }

}
