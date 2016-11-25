import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String [] args){
		Scanner teclado=new Scanner (System.in);
		String frase;
		int par,impar;
		System.out.println("Introduzca una frase que contenga como maximo 80 caracteres");
		frase=teclado.nextLine();
		
		for (int i=1; i <= frase.length();i++){
			if (i%2 !=0){
				 impar=frase.charAt(i-1);
				
			}else {
				par=frase.charAt(i-1);
			}
		}System.out.println(impar);
		System.out.println();
	}
}
