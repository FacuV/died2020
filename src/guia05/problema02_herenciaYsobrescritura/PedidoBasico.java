package guia05.problema02_herenciaYsobrescritura;

import java.time.LocalDate;

public class PedidoBasico extends Pedido{
    boolean esExpress;
    public PedidoBasico(LocalDate fecha){
        super(5,fecha);
        esExpress = false;
    }
    public PedidoBasico(Boolean express,LocalDate fecha){
        super(5,fecha);
        esExpress = express;
    }
    public String toString(){return "soy pedido basico";}

    @Override
    public double precio(){
        double rtn = 0;
        if(esExpress){
            for(int i=0;i < productos.size();i++){
                rtn += productos.get(i).getCosto();
            }
            rtn = rtn*1.20;
        }
        else{
            for(int i=0;i < productos.size();i++){
                rtn += productos.get(i).getCosto();
            }
        }
        return rtn*1.05;
    }
    @Override
    public double comision(){
        if(LocalDate.now().isAfter(date)){return precio()*0.10;}
        else{return 0;}
    }
}
