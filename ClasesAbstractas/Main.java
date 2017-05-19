import Figura;
import Circulo;
import Cuadrado;

public class Abstraccion {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(2,4,2);
		Cuadrado cuadrado = new Cuadrado(8,7,6);


		circulo.verXY();
		System.out.println("Area de circulo: " + circulo.area());
		cuadrado.verXY();
		System.out.println("Area de circulo: " + cuadrado.area());
	}
}