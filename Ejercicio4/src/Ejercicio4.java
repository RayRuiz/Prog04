import java.util.Scanner;
public class Ejercicio4 {
	public static void main (String[]args){
		Scanner teclado=new Scanner (System.in);
		String frase;
		String pedido;
		System.out.println("Introduzca una frase que contenga como maximo 80 caracteres");
		frase=teclado.nextLine();
		System.out.println("¿Lo quieres convertir en mayusculas o minusculas?");
		pedido=teclado.nextLine();
		switch (pedido){
		case "mayusculas":
			System.out.println(frase.toUpperCase()); break;
		case "minusculas":
			System.out.println(frase.toLowerCase()); break;
		}
		
	}
}
