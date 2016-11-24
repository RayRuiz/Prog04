import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase,palabra;
		String espacio;
		espacio=" ";
		System.out.println("Introduzca la frase");
		frase=teclado.nextLine();
		System.out.println("¿Que palabra buscas?");
		
		
		System.out.println(frase.indexOf(palabra=teclado.nextLine()));
			
		

	}

}
