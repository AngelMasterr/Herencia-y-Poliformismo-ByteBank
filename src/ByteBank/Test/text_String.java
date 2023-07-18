package ByteBank.Test;

public class text_String {
	
	public static void main(String[] args) {
		
		// String: es un objeto, no es un tipo de dato como: int, double, byte, boolean etc.
		String curso = "alura";
		String nombre = new String("santander"); // ejemplo de que string se comporta como objeto
		// string pertenece al paquete de java.lang el cual importa en todos los archivos.
		System.out.println(nombre);
		
		nombre = nombre.replace("a", "A"); // remplazar caracteres
		System.out.println(nombre);
		nombre = nombre.concat(" departamento de Colombia"); // concatenar un string
		System.out.println(nombre);
		nombre = nombre.toUpperCase(); // transforma todo el string en mayuscula
		System.out.println(nombre);
		nombre = nombre.toLowerCase(); // transforma todo el string en minuscula
		System.out.println(nombre);
		char letra = nombre.charAt(3); // seleccionar un caracter especifico
		System.out.println(letra);
		nombre = nombre.substring(2,8); // seleccionar una tramo del string
		System.out.println(nombre);
		int indice = nombre.indexOf("d"); // imprimir la posicion del caracter
		System.out.println(indice);
		System.out.println();
		
		printLine(curso);
		printLine(letra);
		printLine(indice);
	}
	// Object: engloba todo los tipos de datos por si no conocemos el tipo de dato a imprimir ej: string, int, double, char, etc..
	public static void printLine(Object valor) {
		System.out.println(valor);		
	}
	
}

