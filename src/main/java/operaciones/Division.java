package operaciones;

public class Division {

	public int division(int numero1, int numero2) {
		if(numero2==0) {
			throw new IllegalArgumentException("Argumento 'divisor' es 0");
		}else {
			return numero1/numero2;
		}
		
	}
	
}


