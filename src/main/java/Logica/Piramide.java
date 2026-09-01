package Logica;

public class Piramide extends Figura implements Cuerpo {

    private double valor2;

    public Piramide(double valor1, double valor2) {
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
        double apotema = Math.sqrt(
            Math.pow(this.valor2, 2) +
            Math.pow(this.valor1 / 2, 2)
        );

        return Math.pow(this.valor1, 2) +
               2 * this.valor1 * apotema;
    }

    @Override
    public double perimetro() {
        return 4 * this.valor1;
    }

    @Override
    public double volumen() {
        return (Math.pow(this.valor1, 2) * this.valor2) / 3;
    }
}