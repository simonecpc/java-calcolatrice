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
}
