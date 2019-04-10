package boletin29;

public abstract class Barco {
    private int matricula=0;
    public static int contador=0;
    private int dias;
    private int eslora;

    public Barco(int dias, int eslora) {
        this.dias = dias;
        this.eslora = eslora;
        contador++;
        this.matricula=contador;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int calcularModulo() {
        return this.eslora * 10;
    }

    public int parametro() {
        return 0;
    }

    public int calcularPrecio() {
        return this.dias * (this.calcularModulo() + this.parametro());
    }
}
