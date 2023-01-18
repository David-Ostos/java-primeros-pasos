
public class TestIR2 {
//1900.00 hasta 2800.0 IR de 7.5% se pueden deducir 142
//2800.01 hasta 3751.0 el IR es de 15% se puede deducir 350
//3751.01 hasta 4664.00 el IR es de 22.5% se uede dedicir 636
	public static void main(String[] args) {

		double salario = 2;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			
			System.out.println("Su taza es de 7.5%");
			System.out.println("Usted puede deducir hasta $ 142");
			
		}else if(salario>=2800.01 && salario<=3751.0){
			
		System.out.println("Su taza es de 15%");
		System.out.println("Usted puede deducir hasta $ 350");
		
		}else if(salario>=3751.01 && salario <= 4664.0){
		
		System.out.println("Su taza es de 22.5%");
		System.out.println("Usted puede deducir hasta $ 636");
		}
	}
}
