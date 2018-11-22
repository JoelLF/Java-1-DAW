package principal;

import java.util.Random;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import modelo.Persona;

public class Ejercicio {
	public static void main(String[] args) throws InterruptedException {
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
		//13. Crear un método que devuelva el saldo de una cuenta, partiendo de una lista de movimientos y del saldo inicial
		Ejercicio saldo = new Ejercicio();
		float saldoInicial = 1300;
		float[] movimientos = new float [] {50.90f, 20.50f, 250, 10.95f, 5.99f}; 
		float saldoFinal = saldo.calcularSaldoFinal(saldoInicial, movimientos);
		//14. Iterar en la cadena mostrando sus caracteres
		for (int i = 0; i < gc.length(); i++) {
			System.out.println(gc.charAt(i));
		}
		//15. Comparar cadenas
		String cad1 = new String ("abcd");
		String cad2 = new String ("abca");
		System.out.println(cad1.compareTo(cad2));
		//16. Convertir cadenas de un array de entrada a uno de salida
		String[] datos = {"123","8k8","9811","xyz"};
		convertir.convierteCadenas(datos);
		//17. Reloj
		Ejercicio hora = new Ejercicio();
		//hora.reloj();
		//18. Números primos
		Ejercicio primo = new Ejercicio();
		int numb = 12;
		System.out.println(primo.primo(numb));
		//19. Lista de números primos
		int desde = 1;
		int hasta = 100;
		primo.listaPrimos(desde, hasta);
		//20.1 Dada una lista (array) de enteros (int), obtener la lista INVERTIDA sobre si misma
		int[] lista = new int[] {4, 5, 6, 3, 2, 1};
		Ejercicio cadena = new Ejercicio();
		cadena.invertirLista(lista);
			//20.2 Dadas dos listas PREVIAMENTE ORDENADAS,  se pide obtener la lista MEZCLA de ambas
			int[] array1 = {1,2,3,4};
			int[] array2 = {5,6,7,8};
			int[] mezcla = cadena.mezclaListasOrdenadas(array1, array2);
			//20.3 // 3. Dada una cadena, obtener la cadena INVIRTIENDO sus caracteres (char) usar charAt() o toCharArray()
			String cadenaChar = new String("Buenos días");
			String resultado = cadena.invertirCaracteres(cadenaChar);
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
	
	public int[] convierteCadenas (String[] cadenas) {
		int[] resultado = new int[cadenas.length];
		for(int i = 0; i < resultado.length; i++) {
			try {
				resultado[i] = Integer.parseInt(cadenas[i]);
			} catch (NumberFormatException ex) {
				resultado[i] = -1;
			}
		}		
		return resultado;
	}
	
	public float calcularSaldoFinal (float saldoInicial, float[] movimientos) {
		for (int i = 0; i < movimientos.length; i++) {
			saldoInicial -= movimientos[i];
		}
		return saldoInicial;
	}
	
	public void reloj() throws InterruptedException {
		for(int h = 0; h <= 12; h++) {
			for(int m = 0; m <= 60; m++) {
				for (int s = 0; s <= 60; s++) {
					Thread.sleep(1000);
					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}
	}
	
	public boolean primo(int numb) {
		if (numb == 1) {
			return true;
		}
		for (int i = 2; i < numb; i++) {
			if (numb % i == 0) {
				return false;
			}
		} return true;
	}
		
	public void listaPrimos(int desde, int hasta) {
		for(int i = desde; i < hasta; i++) {
			if(primo(i)) {
				System.out.println(i);				
			}
		}
	}
	
	public void ordenarArray(int[] array) {
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++)
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
	}	
	
	public void invertirLista(int[] lista) {
		int[] resultado = new int [lista.length];
		for (int i = 0, j = lista.length - 1; i < lista.length; i++, j--) {
				resultado [j] = lista[i];
		}
	}
	
	public int[] mezclaListasOrdenadas(int[] array1, int[] array2) {
		int[] mezcla = new int[array1.length+array2.length];
		
		for (int i = 0; i < array1.length; i++) {
			mezcla[i] = array1[i];
		}
		
		for (int j = 0; j < array2.length; j++) {
			mezcla[j+array1.length] = array2[j];
		}		
		ordenarArray(mezcla);
		return mezcla;
	}
	
	public String invertirCaracteres (String cadena) {
		String resultado = new String();
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);		
		}
		System.out.println(resultado);
		return resultado;		
	}
}
