// 2-Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
package ExerciciosJava02;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� n�mero: ");
		num1 = scan.nextInt();
		
		System.out.println("2� n�mero: ");
		num2 = scan.nextInt();
		
		System.out.println("3� n�mero: ");
		num3 = scan.nextInt();
		
		
		if ( num1 < num2) {
			 if(num2 < num3) {
					System.out.println(num1 + " - " + num2 + " - " + num3);
			 }
		
		else if(num1 < num2){
			System.out.println(num1 + " - " + num3 + " - " + num2);

		}
		else {
			System.out.println(num3 + " - " + num1 + " - " + num2);

		}
	}
		else if(num2 < num3) {
			if(num1 < num3) {
				System.out.println(num2 + " - " + num1 + " - " + num3);
			}
			else {
				System.out.println(num2 + " - " + num3 + " - " + num1);

			}
		}
		else {
			System.out.println(num3 + " - " + num2 + " - " + num1);

		}
		
	}

}
