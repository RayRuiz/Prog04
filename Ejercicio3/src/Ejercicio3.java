import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase,palabra;
		
		System.out.println("Introduzca la frase");
		frase=teclado.nextLine();
		System.out.println("¿Que palabra buscas?");
		palabra=teclado.nextLine();
		
		
		System.out.println("longitud f: " + frase.length());
		System.out.println("longitud p: " + palabra.length());
		
		if (frase.indexOf(" "+palabra+" ") !=-1){
			System.out.println(frase.indexOf(" "+palabra+" "));
		}else if (frase.indexOf(palabra+" ") ==0) {
			System.out.println(0);
		} else  if (frase.indexOf(" "+palabra) == frase.length() - palabra.length() -1 ) {
			System.out.println( frase.length() - palabra.length() - 1);
		}
		
		
		
		
		

	}

}
