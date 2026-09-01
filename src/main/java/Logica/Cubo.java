package Logica;

public class Cubo extends Cuadrado implements Cuerpo {

	public Cubo(double valor1) {
		super(valor1);
	}

	@Override
	public double volumen() {
		return Math.pow(this.valor1, 3);
	}

}