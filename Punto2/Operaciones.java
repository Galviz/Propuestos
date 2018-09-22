package Punto2;
import java.util.Scanner;
public class Operaciones {
	private Scanner sc;
	private double valor1;
	private double valor2;
	private double sumar;
	private double restar;
	private double multiplicar;
	private double dividir;
	
	public Operaciones() {
		sc = new Scanner (System.in); 
		System.out.println("Ingrese el primer valor");
		valor1 = sc.nextInt();
		System.out.println("Ingrese el segundo valor");
		valor2 = sc.nextInt();
	}
	
	public void suma() {
		sumar = valor1 + valor2;
	}
	
	public void resta() {
		restar = valor1 - valor2;
	}
	
	public void multiplicacion() {
		multiplicar = valor1 * valor2;
	}
	
	public void division() {
		dividir = valor1 / valor2;
	}
	
	public void resultados() {
		System.out.println("La suma de los numeros es:"+sumar);
		System.out.println("La resta de los numeros es:"+restar);
		System.out.println("La multiplicacion de los numeros es:"+multiplicar);
		System.out.println("La division de los numeros es:"+dividir);
	}
	
	public static void main(String[] ar) {
		Operaciones operacion = new Operaciones();
		operacion.suma();
		operacion.resta();
		operacion.multiplicacion();
		operacion.division();
		operacion.resultados();
	}
}