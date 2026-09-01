package Presentacion;

import Logica.Circulo;
import Logica.Cuadrado;
import Logica.Cubo;
import Logica.Cuerpo;
import Logica.Figura;
import Logica.Triangulo;
import Logica.Rectangulo;
import Logica.Esfera;
import Logica.Cilindro;
import Logica.Piramide;

public class Principal {

    public static void main(String[] args) {

        Figura f;


        f = new Cuadrado(5);
        System.out.println("Cuadrado");
        System.out.println("Area: " + f.area());
        System.out.println("Perimetro: " + f.perimetro());

        f = new Circulo(5);
        System.out.println("\nCirculo");
        System.out.println("Area: " + f.area());
        System.out.println("Perimetro: " + f.perimetro());

        f = new Triangulo(5, 3);
        System.out.println("\nTriangulo");
        System.out.println("Area: " + f.area());
        System.out.println("Perimetro: " + f.perimetro());

        
        f = new Rectangulo(5, 3);
        System.out.println("\nRectangulo");
        System.out.println("Area: " + f.area());
        System.out.println("Perimetro: " + f.perimetro());

        Cuerpo c;

        c = new Cubo(5);
        System.out.println("\nCubo");
        System.out.println("Volumen: " + c.volumen());

        c = new Esfera(5);
        System.out.println("\nEsfera");
        System.out.println("Volumen: " + c.volumen());

        c = new Cilindro(5, 3);
        System.out.println("\nCilindro");
        System.out.println("Volumen: " + c.volumen());

        c = new Piramide(5, 3);
        System.out.println("\nPiramide");
        System.out.println("Volumen: " + c.volumen());
    }
}