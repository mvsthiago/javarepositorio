package primeiroprojetocalculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("digite o primeiro valor");
		a= scan.nextInt();
		System.out.println("digite o segundo valor");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int menos = menos(a,b);
		float dividir = dividir(a,b);
		int vezes = vezes(a,b);
		System.out.println("soma = " + soma);
		System.out.println("subtraçao = " + menos);
		System.out.println("divisao = " + dividir);
		System.out.println("multiplicação = " + vezes);

	}
	public static int soma(int a,int b){
		return (a + b);
	}
	public static int menos(int a,int b){
		return (a - b);
	}
	public static double dividir(int a,int b){
		return (a / b);
	}
	public static int vezes(int a,int b){
		return (a * b);
	}

}
	
