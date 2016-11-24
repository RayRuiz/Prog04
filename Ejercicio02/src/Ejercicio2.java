import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		int numeroMayus=0,numeroMinus=0;
		
		System.out.println("Ingrese una frase");
		frase=teclado.nextLine();
		for (int i=0; i<frase.length();i++){ //i  lo uso como contador para las vueltas
			if (Character.isUpperCase(frase.charAt(i))){
				numeroMayus++;
			}else if (Character.isLowerCase(frase.charAt(i))){
				numeroMinus++;
			}
			
			}System.out.println("En esta frase hay "+numeroMayus+" mayusculas" );
			System.out.println("En esta frase ha "+numeroMinus+" minusculas");
		}
		
		

	}


