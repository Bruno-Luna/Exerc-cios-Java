//3-Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual 
//categoria ela se encontra:

// * 10-14 infantil
// * 15-17 juvenil
// * 18-25 adulto

package ExerciciosJava02;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int idade;
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Verificador de idade.");

		System.out.println("\nDigite sua idade: ");
		idade = scan.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Voc� � infantil.");

		}else if(idade >=15 && idade <= 17) {
			System.out.println("Voc� � juvenil. ");

		}else if(idade >=18 && idade <= 25) {
			System.out.println("Voc� � adulto.");

		}else {
			System.out.println("Verificador n�o aceita o valor digitado.");

		}
	}

}
