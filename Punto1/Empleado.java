package Punto1;
import java.util.Scanner;
public class Empleado {
	private Scanner sc;
	private String nombre;
	private int sueldo;
	
	public Empleado() {
		sc = new Scanner (System.in);
		System.out.println("Ingrese el nombre del empleado");
		nombre = sc.next();
		System.out.println("Ingrese el sueldo del empleado");
		sueldo = sc.nextInt();
	}
	
	public void imprimir() {
		System.out.println("El nombre del empleado es: "+nombre);
		System.out.println("El sueldo del empleado es: "+sueldo);
	}
	
	public void impuestos() {
		if(sueldo > 1500000) {
			System.out.println("El empleado debe pagar impuestos");
		}else {
			System.out.println("El empleado no debe pagar impuestos");
		}
	}
	
	public static void main(String[] ar) {
		Empleado empleados = new Empleado();
		empleados.imprimir();
		empleados.impuestos();
	}
}