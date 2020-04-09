package guia05.problema02_herenciaYsobrescritura;

import java.time.LocalDate;

public class PedidoPremium extends Pedido{
    private int productosMax = 20;

    public PedidoPremium(LocalDate fecha){
        super(20,fecha);
    }

    public String toString(){return "soy pedido premium";}

    @Override
    public double precio() {
        double rtn = 0;
        for(int i=0;i < productos.size();i++){
            rtn+=productos.get(i).getCosto();
        }
        if(productos.size() > 5){rtn = rtn*1.30;}
        else{rtn = rtn*1.20;}
        return rtn;
    }

    @Override
    public double comision() {
        if(LocalDate.now().isAfter(date)) {
            if (productos.size() > 10) {
                return (precio() * 0.15 + 50);
            } else {
                return precio() * 0.15;
            }
        }else{
            return 0;
        }

    }
}
