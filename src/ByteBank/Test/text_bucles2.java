package ByteBank.Test;

public class text_bucles2 {
	
	public static void main(String[] args) {
		
		String palabra = "Colombia";
		String acomula = "";
		
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			acomula += letra;
			System.out.println(acomula);
		}
		
	}

}

