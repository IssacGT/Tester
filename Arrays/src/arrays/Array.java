//package arrays;
//
//public class Array {
//
//	public static void main(String[] args) {
//		/* arrays
//		 * Los arrays so una estructura de datos que almacenan un tipo de datos en comun
//		 * y una vez declarado no puede cambiar su tamaño o longitud en ejecucion
//		 */
//	int [] numero = new int [5];// array de numeros enteros con tamano de 5 declarado
//		
//		// introducir datos en el array y en la posicion
//	numero [0]=101; //numero de la poscision asignada en el array
//	numero [1]=102; //numero de la poscision asignada en el array
//	numero [2]=103; //numero de la poscision asignada en el array
//	numero [3]=104; //numero de la poscision asignada en el array
//	numero [4]=105; //numero de la poscision asignada en el array
//	
//		// mostrar una poscicion especifica dentro del array
//	System.out.println(numero[4]);
//		
//		//Modo de declarar un array o iniciarlo ya con valores
//	int [] numeros = {1,2,3,4,5,6,7,8,9};
//	
//		/* Imprimir en consola todas los posiciones o valores del array
//		 * utilizando el ciclo for each
//		 */
//		
//	for (int i = 0; i < numeros.length; i++) {
//		System.out.println(numeros[i]);
//		
//	}
//		
//	}
//
//}
//-------------------------------------------------------------------------------------------------------
// Ejercicio 1 Array lineal
package arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		int [] Arreglo = new int [10];
		Arreglo [0] = 1;
		Arreglo [1] = 2;
		Arreglo [2] = 3;
		Arreglo [3] = 4;
		Arreglo [4] = 5;
		Arreglo [5] = 6;
		Arreglo [6] = 7;
		Arreglo [7] = 8;
		Arreglo [8] = 9;
		Arreglo [9] = 10;
		
		System.out.print(Arreglo [0]+", ");
		System.out.print(Arreglo [1]+", ");
		System.out.print(Arreglo [2]+", ");
		System.out.print(Arreglo [3]+", ");
		System.out.print(Arreglo [4]+", ");
		System.out.println();
		System.out.print(Arreglo [5]+", ");
		System.out.print(Arreglo [6]+", ");
		System.out.print(Arreglo [7]+", ");
		System.out.print(Arreglo [8]+", ");
		System.out.print(Arreglo [9]+" ");
			
			System.out.println( );
		
// Ejercicio 2 Array bidimensional matrices
		
		int [][] Array = new int [4][4];
		Array [0][0] =1;
		Array [0][1] =2;
		Array [0][2] =3;
		Array [0][3] =4;
		Array [1][0] =5;
		Array [1][1] =6;
		Array [1][2] =7;
		Array [1][3] =8;
		Array [2][0] =9;
		Array [2][1] =10;
		Array [2][2] =11;
		Array [2][3] =12;
		Array [3][0] =13;
		Array [3][1] =14;
		Array [3][2] =15;
		Array [3][3] =16;
		System.out.print(Array [0][0]+", ");
		System.out.print(Array [0][1]+", ");
		System.out.print(Array [0][2]+", ");
		System.out.print(Array [0][3]+", ");
		System.out.println();
		System.out.print(Array [1][0]+", ");
		System.out.print(Array [1][1]+", ");
		System.out.print(Array [1][2]+", ");
		System.out.print(Array [1][3]+", ");
		System.out.println();
		System.out.print(Array [2][0]+", ");
		System.out.print(Array [2][1]+", ");
		System.out.print(Array [2][2]+", ");
		System.out.print(Array [2][3]+", ");
		System.out.println();
		System.out.print(Array [3][0]+", ");
		System.out.print(Array [3][1]+", ");
		System.out.print(Array [3][2]+", ");
		System.out.print(Array [3][3]+" ");
		
			System.out.println();

// Array bidimensional con valores declarados desde un inicio		
		int [][] Matriz = {{1,2,3,4},
				          {5,6,7,8},
				          {9,10,11,12},
				          {13,14,15,16}};
//Imprimir valores del Array usando el ciclo for
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(Matriz[i][j] + " ");
				
			}
			System.out.println();
			for (int j = 0; j < Matriz.length; j++) {
				
			}
			
		}
	}
}




