/**
 * 5. Bucles
 * 
 * 24. Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
 *     en la siguiente figura: 
 *          1 
 *         121
 *        12321 
 *       1234321
 * 
 * @author Jose Ramon Hidalgo
 */
import java.util.Scanner;
public class Ejercicio24Pagina47 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Dame la altura de la piramide");
		int altura=input.nextInt();
		
		int a=0;
		
		// Este comando for cuenta las filas que se van generando hasta las introducidas 
		for (int i=1;i<=altura;i++){
			//Este otro for generará espacios delante de los numeros que vendrán después
			
			for (int k=0;k<=altura-a;k++){
				System.out.print(" ");
			}
			
			//Este for imprime los numeros hasta el numero mayor, que el el numero de fila en el que está el primer for
			for (int v=1;v<=i;v++){
				System.out.print(v);
			}
			
			/** Este for hace que se impriman los números hasta el 1 y no repitiendo el numero máximo, que es el 
			 * de la fila en que está el programa 
			 */
			
			for (int r=i-1;r>0;r--){
				if (r>0){
					System.out.print(r);
				}
			}
			System.out.println("");
			a++;
		}

	}

}
