package boletin29;

public class Yates extends Barco {

    private int cv;
    private int ncamarotes;

    public Yates(int dias, int eslora, int cv, int ncamarotes) {
        super(dias, eslora);
        this.cv = cv;
        this.ncamarotes = ncamarotes;
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }

    @Override
    public int parametro() {
        return 2 * cv + 25 * ncamarotes;
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo();
    }

}
