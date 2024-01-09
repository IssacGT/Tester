//Estructura base de un programa JAVA

//package apuntes;
//import java.util.Scanner; Scanner entrada = new Scanner(System.in);
//public class Apuntes{
//	public static void main(String[] args) {
//		
//	}
//}
//import java.util.Scanner; // import--va fuera de la clase debajo del package
//----------------------------------------------------------------------------------------------
//	
//	Datos Primitivos
//	byte = 3 //Enteros de rango -128 a +127
//	short = 75092  //Enteros de rango -32768 a +32767
//	int = 369 //Enteros de rango -2,147,483,648 hasta +2,147,483,647
//	long = 4567890 	  // Eteros de rango -9,223,372,854,775,807 hasta +9,223,372,854,775,807
//	double = 24.687 	// Decimales mas largos -4.9e-324 hasta +1.8e+308
//	float = 345.786.87f // Decimales mas cortos -1.4e-045 a +3.4e+038 llevan una f al final
//	boolean = True or False // Condicionales verdadero o falso
//	char = Cualquier caracter // Lleva comillas simples ''
	
//----------------------------------------------------------------------------------------------
// 
//  Datos no primitivos_Empiezan con mayuscula y pueden contener metodos
//	Integer = null o metodos
//	String = "Cadenas de caracter" // Llevan comillas dobles ""
		
//----------------------------------------------------------------------------------------------
//
//   Constantes 
// Tienen un valor constante
// Se declaran con //final//ejemplo//final int numero=369;// y el dato del tipo que elijas
//---------------------------------------------------------------------------------
// 
// Clase Scanner se tiene que importar de la libreria
// import java.util.Scanner;
// System.out.println("cadena")
// Sirve para guardar datos por medio de la consola, 
// El usuario puede digitar los datos en la consola y guardarlos.
// Caracteres, Cadenas y Numeros
//
// Ejemplo con char/caracteres Solo apuntes.
// public class Apuntes{
// public static void main(String[] args) {
// Scanner entrada = new Scanner(System.in);
//	char letra;
//		System.out.println("digite una letra:");
//			letra = entrada.next().charAt(0);
//		System.out.println("La cadena es:"+letra); }
//
// Ejemplo con String/cadena Solo apuntes.
// public static void main(String[] args) {
//	Scanner entrada = new Scanner(System.in);
//	String cadena;
//		System.out.println("digite una cadena:");
//			cadena = entrada.next();
//			
//		System.out.println("La cadena es:"+cadena); }
//
//Ejemplo con numeros int, float y double Solo apuntes.
//public class Apuntes {
//	
//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		
//		int numero;
//		double numero;
//		float numero;
//			System.out.println("Digita el numero:");
//			numero = entrada.nextInt();
//			numero = entrada.nextDouble();
//			numero = entrada.nextFloat();
//			
//			System.out.println("El numero es:"+numero);			
//	}		
//}
//-------------------------------------------------------------------------------------------
// Operadores Aritmeticos. Solo apuntes.
//public class Apuntes {
//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		
//		float numero1,numero2,suma,resta,mult,div,resto;
//		
//	System.out.println("Digite dos numeros: ");
//		numero1 = entrada.nextFloat();
//		numero2 = entrada.nextFloat();
//		
//		suma = numero1+numero2;
//		resta = numero1-numero2;
//		mult = numero1*numero2;
//		div = numero1/numero2;
//		resto = numero1%numero2;
//		
//		System.out.println("La suma es: "+suma);
//		System.out.println("La resta es: "+resta);
//		System.out.println("La multiplicacion es "+mult);
//		System.out.println("La division es: "+div);
//		System.out.println("El resto es: "+resto);
//		
//			// Incremento y Decremento
//		int = 5;
//		
//		x++; //Incremento
//		x--; //Decremento
//	
//		       Prefijo y Sufijo
//		int x = 5, y;
//		
//		y = x--; //Sufijo
//		y = ++x; //Prefijo
//		
//		System.out.println(x);
//		}
//}
//-------------------------------------------------------------------------------------------
	//Ciclos
//	
//		    do 
//			while
//			for      for (int j = 0; j < Matriz.length; j++) {
//			for each
//-------------------------------------------------------------------------------------------
//  //Arrays

//	/* arrays
//	 * Los arrays so una estructura de datos que almacenan un tipo de datos en comun
//	 * y una vez declarado no puede cambiar su tamaño o longitud en ejecucion
//	 */
//int [] numero = new int [5];// array de numeros enteros con tamano de 5 declarado
//	
//	// introducir datos en el array y en la posicion
//numero [0]=101; //numero de la poscision asignada en el array
//numero [1]=102; //numero de la poscision asignada en el array
//numero [2]=103; //numero de la poscision asignada en el array
//numero [3]=104; //numero de la poscision asignada en el array
//numero [4]=105; //numero de la poscision asignada en el array
//
//	// mostrar una poscicion especifica dentro del array
//System.out.println(numero[4]);
//	
//	//Modo de declarar un array o iniciarlo ya con valores
//int [] numeros = {1,2,3,4,5,6,7,8,9};
//
//	/* Imprimir en consola todas los posiciones o valores del array
//	 * utilizando el ciclo for each
//	 */
//	
//for (int i = 0; i < numeros.length; i++) {
//	System.out.println(numeros[i]);
//	
//}
//	
//}
//
//}
//
//Ejemplo 1 Array lineal
//package arrays;
//
//import java.util.Scanner;
//
//public class Array {
//public static void main(String[] args) {
//	
//	int [] Arreglo = new int [10];
//	Arreglo [0] = 1;
//	Arreglo [1] = 2;
//	Arreglo [2] = 3;
//	Arreglo [3] = 4;
//	Arreglo [4] = 5;
//	Arreglo [5] = 6;
//	Arreglo [6] = 7;
//	Arreglo [7] = 8;
//	Arreglo [8] = 9;
//	Arreglo [9] = 10;
//	
//	System.out.print(Arreglo [0]+", ");
//	System.out.print(Arreglo [1]+", ");
//	System.out.print(Arreglo [2]+", ");
//	System.out.print(Arreglo [3]+", ");
//	System.out.print(Arreglo [4]+", ");
//	System.out.println();
//	System.out.print(Arreglo [5]+", ");
//	System.out.print(Arreglo [6]+", ");
//	System.out.print(Arreglo [7]+", ");
//	System.out.print(Arreglo [8]+", ");
//	System.out.print(Arreglo [9]+" ");
//		
//		System.out.println( );
//	
////Ejemplo 2 Array bidimensional Matriz
//	
//	int [][] Array = new int [4][4];
//	Array [0][0] =1;
//	Array [0][1] =2;
//	Array [0][2] =3;
//	Array [0][3] =4;
//	Array [1][0] =5;
//	Array [1][1] =6;
//	Array [1][2] =7;
//	Array [1][3] =8;
//	Array [2][0] =9;
//	Array [2][1] =10;
//	Array [2][2] =11;
//	Array [2][3] =12;
//	Array [3][0] =13;
//	Array [3][1] =14;
//	Array [3][2] =15;
//	Array [3][3] =16;
//	System.out.print(Array [0][0]+", ");
//	System.out.print(Array [0][1]+", ");
//	System.out.print(Array [0][2]+", ");
//	System.out.print(Array [0][3]+", ");
//	System.out.println();
//	System.out.print(Array [1][0]+", ");
//	System.out.print(Array [1][1]+", ");
//	System.out.print(Array [1][2]+", ");
//	System.out.print(Array [1][3]+", ");
//	System.out.println();
//	System.out.print(Array [2][0]+", ");
//	System.out.print(Array [2][1]+", ");
//	System.out.print(Array [2][2]+", ");
//	System.out.print(Array [2][3]+", ");
//	System.out.println();
//	System.out.print(Array [3][0]+", ");
//	System.out.print(Array [3][1]+", ");
//	System.out.print(Array [3][2]+", ");
//	System.out.print(Array [3][3]+" ");
//	
//		System.out.println();
//
////Array bidimensional con valores declarados desde un inicio		
//	int [][] Matriz = {{1,2,3,4},
//			          {5,6,7,8},
//			          {9,10,11,12},
//			          {13,14,15,16}};
////Imprimir valores del Array usando el ciclo for
//	for (int i = 0; i < 4; i++) {
//		for (int j = 0; j < 4; j++) {
//			System.out.print(Matriz[i][j] + " ");
//			
//			}
//		System.out.println();
//		
//		}
//	}
//}
//-------------------------------------------------------------------------------------------------------
//Ejercicio 1 Programa que suma 3 calificaciones
//package apuntes;
//
//import java.util.Scanner;
//
//public class Apuntes {
//		public static void main(String[] args) {
//			Scanner entrada = new Scanner(System.in);
//				float calificación1, calificación2, calificación3, suma;
////			Guardar calificaciones
//				System.out.println("Digite sus tres calificaciones: ");
//					calificación1 = entrada.nextFloat();
//						calificación2 = entrada.nextFloat();
//							calificación3 = entrada.nextFloat();
////			Sumar las calificaciones
//							
//			suma = calificación1+calificación2+calificación3;
//				System.out.println("La suma es: "+suma);
//			
//		}
//	}
//---------------------------------------------------------------------------------------------
//Ejercicio 2 Programa que suma el dinero de 3 saboteado-revisar
//package apuntes;
//
//import java.util.Scanner;
//
//public class Apuntes {
//		public static void main(String[] args) {
//			Scanner entrada = new Scanner (System.in);
//			float Issac, Miguel, Beatriz,Total;
//			System.out.println("Digite la cantidad de $ que tiene Issac: ");
//			Issac = entrada.nextFloat();
//			
//			Miguel = Issac/2; //Miguel tiene la mitad de lo que tiene Issac
//			Beatriz = (Issac+Miguel)/2;
//			Total = Issac+Miguel+Beatriz;
//			
//			System.out.println("La cantidad de $ de los 3 juntos es: "+Total );
//			
//		}
//	}
//---------------------------------------------------------------------------------------------
//Ejercicio 3 Incompleto saboteado
//package apuntes;
//
//import java.util.Scanner;
//
//public class Apuntes {
//	public static void main(String[] args) {
//		Scanner digita = new Scanner(System.in);
//			float pago, salario, comisión, venta;
//				System.out.println("Salario del empleado: ");
//				salario = digita.nextFloat();
//				comisión = digita.nextFloat();
//				venta = digita.nextFloat();
//				
//				pago = salario+comisión+venta;
//				 System.out.println("El salario de este mes es: "+pago);
//	}
//}
//---------------------------------------------------------------------------------------------
//Ejercicio 4 Programa que te dicel el promedio de entre 4 calificaciones
//package apuntes;
//
//import java.util.Scanner;
//
//public class Apuntes{
//	public static void main(String[] args) {
//		Scanner digita = new Scanner(System.in);
//		float participación, primerExamen, segundoExamen, examenFinal, notaFinal;
//
////  Ingreso de datos en consola del usuario		
//		System.out.println("Nota de participación: ");
//		participación = digita.nextFloat();
//		System.out.println("Nota de primer Examen: ");
//		primerExamen = digita.nextFloat();
//		System.out.println("Nota de segundo Examen: ");
//		segundoExamen = digita.nextFloat();
//		System.out.println("Nota de examen Final: ");
//		examenFinal = digita.nextFloat();
//
////   Calculos
//			participación *= 0.10f; // *= sustituye a participaciOn = participación
//			primerExamen *= 0.25f;  // *= sustituye a primerExamen = primerExamen
//			segundoExamen *= 0.25f; // *= sustituye a segundoExamen = segundoExamen
//			examenFinal *= 0.40f;   // *= sustituye a examenFinal = examenFinal
//			
////	  Imprimir resultado  
//			
//			notaFinal = participación + primerExamen + segundoExamen + examenFinal;
//			
//			System.out.println("\nNota Final "+notaFinal);	
//	}
//}
//---------------------------------------------------------------------------------------------
//Ejercicio 5 Programa que te dice el numero de semanas, días y horas
//package apuntes;
//import java.util.Scanner;
//
//public class Apuntes {
//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		int HorasTotales, semanas, dias, horas;
//			System.out.println("Digite el numero de horas ");
//			
//			HorasTotales = entrada.nextInt();
//			
//			semanas = HorasTotales / 168;
//			dias = HorasTotales % 168 / 24;
//			horas = HorasTotales % 24;
//			
//			System.out.println("\nEl equivalente es: ");
//			System.out.println("semanas "+semanas);
//			System.out.println("dias "+dias);
//			System.out.println("horas "+horas);
//		
//	}
//}
//---------------------------------------------------------------------------------------------
//                  Condicionales
// true or false / if / else / operadores de condicionales 
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes {
//	public static void main(String[] args) {
//		int numero, dato = 5; // = operador de asignación
//		
//		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//		
//		if(numero == dato) { 
//   !|   operador not
//// ==  operador de igualdad  (==)
//// !=  operador de diferencia desigualdad para COMPROBAR si un dato es diferente a otro  (!=)
//// >   operador mayor que  (>)
//// >=  operador mayor o igual que  (>=)
//// <   operador menor que  (<)
//// <=  operador menor o igual que  (<=) 		
//		
//			JOptionPane.showInputDialog(null, "El numero es 5");
//		}
//		
//		else {
//			JOptionPane.showInputDialog(null, "El numero es diferente a 5");
//		
//} 
//	}
//}
//-------------------------------------------------------------------------------------------------
// switch / default y condicionales multiples Programa que te dice si el numero esta en el rango de 1 a 5
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes{
//		public static void main(String[] args) {
//			
//			int entero;
//			
//			entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5: "));
//			
//			switch(entero) {
//			case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
//				break; //Termina el proceso o caso
//			case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
//				break; //Termina el proceso o caso
//			case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
//				break; //Termina el proceso o caso
//			case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
//				break; //Termina el proceso o caso
//			case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
//				break; //Termina el proceso o caso
//				
//			default: JOptionPane.showMessageDialog(null,"El numero no esta en el rango");	
//			}
//			
//		}
//	}
//-------------------------------------------------------------------------------------------------
// Ejercicio 6 Condicionales multiples Programa que te dice si el numero es multiplo de 10
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes{
//	public static void main(String[] args) {
//		
//		int numero;
//		
//		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//		
//		if(numero%10 == 0) {
//			JOptionPane.showMessageDialog(null, "El numero " +numero+" Es multiplo de 10");
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
//		}
//		
//		
//	}
//}
//--------------------------------------------------------------------------------------------------
//Ejercico 7 Condicionales multiples Programa que dice que numero es mayor o si son iguales
//package pruebas;
//
//import javax.swing.JOptionPane;
//
//public class pruebas {
//public static void main(String[] args) {
//	  
//	  int numero = 0;
//	  int numero2 = 0;
//	  
//	  numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
//	  numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
//	  
//	  if (numero == numero2) 
//	  	JOptionPane.showMessageDialog(null, "El numero es igual");
//	  
//	  else if (numero < numero2)
//		  JOptionPane.showMessageDialog(null, "El segundo numero es mayor");
//
//	  else
//		JOptionPane.showMessageDialog(null, "El primer numero es mayor");
//		 
//}
//
//}
//--------------------------------------------------------------------------------------------------
//Ejercicio 8 Condicionales Programa que indica si una letra es mayuscula o minuscula
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes {
//	public static void main(String[] args) {
//		char letra;
//		
//		letra = (JOptionPane.showInputDialog("Digite una letra").charAt(0));
//		
//		if(Character.isUpperCase(letra)) {
//			JOptionPane.showMessageDialog(null,"Es una letra mayuscula");
//		}	
//		else {JOptionPane.showMessageDialog(null,"Es una letra minuscula");
//		
//}
//	}
//		}
//--------------------------------------------------------------------------------------------------
// Ejercicio 9 Condicionales Programa que indica un salario con horas extra
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes{
//
//		public static void main(String[] args) {
//			
//			int horasTotales;
//			float salarioTotal;
//			
//			horasTotales = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas totales: "));
//			
//			if (horasTotales <= 40) {
//				salarioTotal = horasTotales * 16;}
//				
//			else {
//				salarioTotal = (40*16) + ((horasTotales-40)*20);
//					
//}
//	JOptionPane.showMessageDialog(null,"El salario total es: "+salarioTotal);
//		
//	}
//}
//--------------------------------------------------------------------------------------------------
//Ejercicio 10 Condicionales Programa que indica si los numeros son par o impar
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes {
//		public static void main(String[] args) {
//			
//		int PrimerNumero;
//		int SegundoNumero;
//		
//		PrimerNumero =  Integer.parseInt(JOptionPane.showInputDialog("Digite el PrimerNumero: "));
//			
//		SegundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite el SegundoNumero: "));
//			
//			
//			
//		if (PrimerNumero % 2 != 0 && SegundoNumero % 2 != 0) {
//			      JOptionPane.showMessageDialog(null,"Ambos numeros son impares");
//			      
//		} else if (SegundoNumero % 2 != 0 && SegundoNumero % 2 != 0) {
//			      JOptionPane.showMessageDialog(null,"Solo el segundo numero es impar");
//			      
//		} else if (PrimerNumero % 2 != 0 && SegundoNumero % 2 == 0) {
//			      JOptionPane.showMessageDialog(null,"Solo el primer numero es impar");
//			      
//		} else {
//			      JOptionPane.showMessageDialog(null,"Ambos numeros son pares");
//	  } 
//} }
//--------------------------------------------------------------------------------------------------
// Ejercicio 11 Condicionales Programa Calculadora
//package apuntes;
//
//import javax.swing.JOptionPane;
//
//public class Apuntes{
//	public static void main(String[] args) {
//		
//		int numero1, numero2, suma, resta, mult, div;
//		char operacion;
//		
//		numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//		numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//		
//		operacion=JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);
//		
//		switch(operacion) {
//			//caracteres se definen con comilla simple '' no String ""
//			case 's' :
//			case 'S' : suma=numero1+numero2;
//					JOptionPane.showMessageDialog(null, "La suma es: "+suma);
//					break;
//			case 'r' :
//			case 'R' : resta=numero1-numero2;
//					JOptionPane.showMessageDialog(null, "La resta es: "+resta);
//					break;
//					
//			case 'p' :
//			case 'P' :
//			case 'm' :
//			case 'M' : mult=numero1*numero2;
//					JOptionPane.showMessageDialog(null, "La multiplicacion es: "+mult);
//					break;
//					
//			case 'd' :
//			case 'D' : div=numero1/numero2;
//					JOptionPane.showMessageDialog(null, "La division es: "+div);
//					break;
//					
//			default: JOptionPane.showMessageDialog(null, "ERROR Operacion Incorrecta");break;
//				
//		}
//		
//		
//		
//	}
//}
//-------------------------------------------------------------------------------------------------------------------------
// Array multidimensional
package apuntes;

import javax.swing.JOptionPane;

public class Apuntes {
	public static void main(String[] args) {
		 
		final int Saldo_inicial = 1000;
		int opcion;
		float ingreso;
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero automatico de Issac \n"
				
				+ "Ingresar dinero a la cuenta\n"
				+ "Retirar dinero de la cuenta\n"
				+ "Salir"
				));
		
		
	}
}