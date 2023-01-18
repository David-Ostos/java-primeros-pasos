
public class testCondicional {
	public static void main(String[] args) {
		System.out.println("Probando condicionales");
		int edad = 10;
		int cantidad = 3;
		if (edad >= 18) {
			System.out.println("Tienes mas de 18 años");
			System.out.println("Bienvenido");
		} else {
			if(cantidad >=2) {
				System.out.println("No tienes 18 pero estas acompañado");
			}else {
				System.out.println("Lamentablemente no puedes ingresar");
			}
		}
	}
}