package principal;

import java.util.Random;

import modelo.Persona;

public class Ejercicio {
	public static void main(String[] args) {
		//1. Imprimir por consola el valor de 2 elevado a 3
		System.out.println(Math.pow(2.0, 3.0));
		//2. Imprime un valor aleatorio entre 1 y 100
		Random random = new Random();
		int numero = random.nextInt(100) + 1;
		System.out.println(numero);
		//3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		String gc = new String ("LAS PALMAS DE GRAN CANARIA");
		System.out.println(gc.substring(14,18));
		//4. Mostrar por consola los números comprendidos
		//entre dos enteros, a y b.
		int a = 20;
		int b = 30;
		Ejercicio ejercicio = new Ejercicio();
		ejercicio.listaIntervaloEnteros(a, b);
		//5. Convertir una cadena a valores enteros
		//String cadenaUno = new String();
		String cadenaDos = new String();
		//cadenaUno = "ab95f1";
		cadenaDos = "350";
		Ejercicio convertir = new Ejercicio();
		//convertir.convertirCadenaAEnteros(cadenaUno);
		convertir.convertirCadenaAEnteros(cadenaDos);
		//6. Sucesiones de Fibonacci
		Ejercicio fibo = new Ejercicio();
		fibo.fibonacci();
		//7. Devolver string de números aleatorios
		int n = random.nextInt(10) + 1;
		Ejercicio string = new Ejercicio();
		int[] res = string.generaAleatorio(n);
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}
		//8. Lanzar un dado
		Ejercicio tirar = new Ejercicio();
		System.out.println("El dado ha resultado en " + tirar.dado());
		//9. Devolver menor
		Ejercicio menor = new Ejercicio();
		int x = 6;
		int y = 5;
		int z = 9;
		int k = 3;
		int minus = Ejercicio.calNumMenor(x, y, z, k);
		System.out.println(minus);
		//System.out.println(menor.calNumMenor(x, y, z, k));
		//10. Imprime por consola n números enteros aleatorios entre 1 y 100
		Ejercicio aleatorio = new Ejercicio();
		aleatorio.imprimeAleatorios(n);
		//11. Tirar múltiples dados y contar cuantas veces sale cada número
		int tiradas = random.nextInt(10)+1;
		//12. Devolver una lista de personas
		int personas = 10;
		Ejercicio listado = new Ejercicio();
		listado.crearListaPersonas(personas);
	}
	
	public void listaIntervaloEnteros(int a, int b) {
		for (int i=a; i <= b; i++) {
			System.out.println(i);
		}
	}
	
	public int convertirCadenaAEnteros (String cadena) {
		int resultado = Integer.parseInt(cadena);
		return resultado;	
	} 
	
	public void fibonacci () {
		int cero = 0;
		int uno = 1;
		//int cuenta;
		for (int i = 0; i <= 8; i++) {
			System.out.println(cero + " ");
			uno = cero + uno;
			cero = uno - cero;
			/*cuenta = cero;
			cero = uno;
			uno = cero + cuenta;*/
			
		}
	}
	
	public int [] generaAleatorio(int n) {
		int[] resultado = new int [n];
		for (int i = 0; i < n; i++) {
			Random random = new Random();
			int num = random.nextInt(1000) + 1;
			resultado[i] = num;
		}
		return resultado;
	}
	
	public int dado () {
		Random rand = new Random();
		int resDado = rand.nextInt(6) + 1;
		return resDado;
	}
	
	public static int calNumMenor(int x, int y, int z, int k) {
		if (x < y)
			if (x < z)
				if (x < k)
					return x;
				else 
					return k;
		else if (z < k)
			return z;
		else
			return k;
	else
		if (y < z)
			if ( y < k)
				return y;
			else
				return k;
		else
			if (z < k)
				return z;
			else
				return k;
	}
	
	public void imprimeAleatorios (int n) {
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			int num = rand.nextInt(400) + 101; 
			System.out.println(i+1 + ".- " + num);
		}
	}
	
	Persona[] crearListaPersonas (int personas) {
		Persona[] lista = null;
		lista = new Persona[personas];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = new Persona();
		}
		return lista;
	}
	
}
