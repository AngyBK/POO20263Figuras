package Logica;

public class Esfera extends Figura implements Cuerpo {

    public Esfera(double valor1) {
        super(valor1);
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(this.valor1, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.valor1;
    }

    @Override
    public double volumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.valor1, 3);
    }
}