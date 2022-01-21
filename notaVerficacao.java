package fabio.com.exercicios;

import java.util.Scanner;

public class notaVerficacao {
	
	static final Double Nota_Desclassificatoria_Geral = 150.0;
	
	static final Double Nota_Minima = 60.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Verificando se tem nota suficiente para concurso.");
		
		System.out.print("Portugu�s: ");
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Matem�tica: ");
		Double notaDeMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= Nota_Minima;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= Nota_Minima;
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= Nota_Desclassificatoria_Geral;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;
		
		if (passou) {
			System.out.println("Parab�ns ! Voc� passou. ");
		}else {
			System.out.println("Infelizmente, n�o foi dessa vez. ");
		}
		
		scanner.close();

	}

}
