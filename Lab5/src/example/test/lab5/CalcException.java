package example.test.lab5;

public class CalcException extends ArithmeticException {
	public CalcException() {
	}
	
	public CalcException(String cause){
		super(cause);
	}
}