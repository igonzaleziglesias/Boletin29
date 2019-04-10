package boletin29;

public class Boletin29 {

    public static void main(String[] args) {
        Barco b = new Veleros(3, 50, 2);
        System.out.println(b.calcularPrecio() + " " + b.getMatricula());

        Barco d = new Deportivas(3,60, 500);
        System.out.println(d.calcularPrecio() + " " + d.getMatricula());

        Barco y = new Yates(3, 120, 1200, 10);
        System.out.println(y.calcularPrecio() + " " + y.getMatricula());

        Factura factura = new Factura();
        factura.añadir(b);
        factura.añadir(d);
        factura.añadir(y);
        factura.mostrarFactura();
    }

}
