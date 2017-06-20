/**
 * 5. Bucles
 * 
 * 26. Realiza un programa que pida primero un número y a continuación un dígito. El programa nos
 *     debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en
 *     el número introducido.
 * 
 * @author José Ramón Hidalgo
 */
import java.util.Scanner;

public class S05Ejercicio26 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un numero");
		int numero=teclado.nextInt();
		
		System.out.println("Dame un digito para buscarlo en el numero");
		int digito=teclado.nextInt();
		// Averiguo la longitud de la cadena
		String longitud=Integer.toString(numero);
		//Utilizo la cadena como si fuera un array
		int a=0;
		int b=longitud.length()-1;
		//Separo los dígitos y voy comprobando uno a uno desde la derecha
		while(a<=b){
			if (digito==(int)((numero%Math.pow(10, b+1)/Math.pow(10, b)))){
				System.out.println("El numero está en la posición "+(longitud.length()-b)+" desde la izquierda");
				//Con esta operación resto el total de digitos menos los que están a la derecha y me devuelve los que están a la izquierda
			}
			
			b--;
		}
	}
}

