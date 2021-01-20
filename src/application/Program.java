package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
		 * salario) de N funcion�rios. N�o deve haver repeti��o de id. Em seguida,
		 * efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o
		 * existir, mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a
		 * listagem atualizada dos funcion�rios, conforme exemplos. Lembre-se de aplicar
		 * a t�cnica de encapsulamento para n�o permitir que o sal�rio possa ser mudado
		 * livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
		 * aumento por porcentagem dada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			if (condition) {
				
			} else {

			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		
		
		
		sc.close();
	}

}
