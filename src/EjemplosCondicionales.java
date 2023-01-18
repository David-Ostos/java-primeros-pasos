
public class EjemplosCondicionales {

	public static void main(String[] args) {
		System.out.println("hello work");

		int edad = 17;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero esta acompañado, puede entrar");
			} else {
				System.out.println("No puede entrar");
			}
		}
	}
}
