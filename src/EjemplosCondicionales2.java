public class EjemplosCondicionales2 {

	public static void main(String[] args) {
		System.out.println("hello work");

		int edad = 17;
		int cantidadPersonas = 2 ; 
		boolean esPareja= cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 || esPareja;
		System.out.println(esPareja);
		if (puedeEntrar){
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("No puede entrar");
		}
	}
}