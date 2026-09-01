package Logica;

public class Rectangulo extends Figura {

    private double valor2;

    public Rectangulo(double valor1, double valor2) {
        super(valor1);
        this.valor2 = valor2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double area() {
        return this.valor1 * this.valor2;
    }

    @Override
    public double perimetro() {
        return 2 * (this.valor1 + this.valor2);
    }
}