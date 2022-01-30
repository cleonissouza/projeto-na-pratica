package dio.meu.projeto;

import java.util.Scanner;

public class Calculadora {
	private int numeroA;
	private int numeroB;

	public static void main(String[] args) {
		Scanner scan = new 	Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();	
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("soma = " + soma);
		System.out.println("sub = " + subtracao);
		System.out.println("mult = " + multiplicacao);
		System.out.println("div = " + divisao);

	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(float a, float b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int dobro(int a) {
		return a * 2;
	}
	
	public int somaNumeros() {
		return this.numeroA + this.numeroB;
	}

	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}

	
}



