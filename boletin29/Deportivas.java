package boletin29;

public class Deportivas extends Barco {

    private int cv;

    public Deportivas(int dias, int eslora, int cv) {
        super(dias, eslora);
        this.cv = cv;
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }

    @Override
    public int parametro() {
        return 2 * cv;
    }

    @Override
    public int calcularModulo() {

        return super.calcularModulo();
    }

}
