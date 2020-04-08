package guia05.problema02_herenciaYsobrescritura;

import java.time.LocalDate;

public class App {
    public static void app(){

        Producto[] productos = {new Producto("jabon", 10), new Producto("cerveza1",50),new Producto("papel higienico",20),new Producto("cerveza2",50),new Producto("cerveza3",50),new Producto("agua",5)};
        Pedido pedido1 = new PedidoBasico(LocalDate.parse("2020-04-07"));
        Pedido pedido2 = new PedidoBasico(true,LocalDate.parse("2018-10-30"));
        Pedido pedido3 = new PedidoPremium(LocalDate.parse("2020-10-30"));
        Pedido pedido4 = new PedidoPremium(LocalDate.parse("2020-10-15"));
        Cadete cadete = new Cadete();
        for(int i = 0; i < 5;i++) {
            System.out.println(pedido1.agregarProducto(productos[i]));
        }
        System.out.println("");
        for(int i = 0; i < 5;i++) {
            System.out.println(pedido2.agregarProducto(productos[4 - i]));
        }
        System.out.println("");
        for(int i = 0; i < 6;i++) {
            System.out.println(pedido3.agregarProducto(productos[i]));
        }
        System.out.println("");
        for(int i = 0; i < 20;i++) {
            if(i < 6){System.out.println(pedido4.agregarProducto(productos[i]));}
            else if(i < 12){System.out.println(pedido4.agregarProducto(productos[i-6]));}
            else if(i < 18){System.out.println(pedido4.agregarProducto(productos[i-12]));}
            else if(i < 20){System.out.println(pedido4.agregarProducto(productos[i-18]));}
        }
        System.out.println("");
        cadete.agregarPedido(pedido1);
        cadete.agregarPedido(pedido2);
        cadete.agregarPedido(pedido3);
        cadete.agregarPedido(pedido4);
        System.out.println("Precios:");
        System.out.println(pedido1.precio());
        System.out.println(pedido2.precio());
        System.out.println(pedido3.precio());
        System.out.println(pedido4.precio());
        System.out.println("comisiones:");
        System.out.println(pedido1.comision());
        System.out.println(pedido2.comision());
        System.out.println(pedido3.comision());
        System.out.println(pedido4.comision());
        System.out.println("cadete:");
        System.out.println(cadete.comisiones());
    }
}
