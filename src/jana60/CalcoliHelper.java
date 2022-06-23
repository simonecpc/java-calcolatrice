package jana60;

public class CalcoliHelper {

	private CalcoliHelper() {
		
	}
	
	public static int somma(int a, int b){
		return a+b;
	}
	
	public static int differenza(int a, int b){
		return a-b;
	}
	
	public static int moltiplicazione(int a, int b){
		return a*b;
	}
	
	public static int vAssoluto (int a){
		if (a<0) {
			return -a;}
		else {
			return a;}
		
	}
	
	public static int minimo(int a, int b){
		if(b<a) {
			return b;}
		else {
			return a;}
		}
	
	public static int massimo(int a, int b){
		if(b>a) {
			return b;}
		else { 
			return a;}
	}
		// Bonus 1 utilizzando metodo overload cambiando int in double
		
		public static double somma(double a, double b){
			return a+b;
		}
		
		public static double differenza(double a, double b){
			return a-b;
		}
		
		public static double moltiplicazione(double a, double b){
			return a*b;
		}
		
		public static double vAssoluto (double a){
			if (a<0) {
				return -a;}
			else {
				return a;}
			
		}
		
		public static double minimo(double a, double b){
			if(b<a) {
				return b;}
			else {
				return a;}
			}
		
		public static double massimo(double a, double b){
			if(b>a) {
				return b;}
			else {
				return a;}
		
	}
}
