package guia05.problema02_herenciaYsobrescritura;

public class Producto {
        private String descripcion;
        private double costo;

        public Producto(String desc, double cost){
                descripcion = desc;
                costo = cost;
        }

        public double getCosto() {
                return costo;
        }

        public String getDescripcion() {
                return descripcion;
        }
}
