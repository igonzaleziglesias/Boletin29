package boletin29;

public class Veleros extends Barco {

    private int nmastiles;

    public Veleros(int dias, int eslora, int nmastiles) {
        super(dias, eslora);
        this.nmastiles = nmastiles;
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo();
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio();
    }

    @Override
    public int parametro() {
        return nmastiles * 8;
    }

}
