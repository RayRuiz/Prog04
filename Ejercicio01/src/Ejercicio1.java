import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frases;
		
		System.out.println("Ingrese una frase");
		frases=teclado.nextLine();
		for (int i=0;i<frases.length();i++){
			System.out.println(frases.substring(0,i+1));
		
		}
		
		
		
			
		}
		
		

	}


