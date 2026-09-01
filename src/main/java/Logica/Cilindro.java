package Logica;

public class Cilindro extends Figura implements Cuerpo {

    private double valor2;

    public Cilindro(double valor1, double valor2) {
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
        return 2 * Math.PI * this.valor1 * (this.valor1 + this.valor2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.valor1;
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(this.valor1, 2) * this.valor2;
    }
}