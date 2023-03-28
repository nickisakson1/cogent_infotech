package cogent_batch65;

public class Number {
	
	int a;
	int b;
	double result;
	
	public Number(int a, int b) throws IllegalArgumentException{
		if(b==0) {
			throw new IllegalArgumentException();
		}
		else {
			this.a = a;
			this.b = b;
		}
	}
	
	public void add() {
		result = a+b;
	}
	
	public void sub() {
		result = a-b;
	}
	
	public void mul() {
		result = a*b;
	}
	
	public void div() {
		result = (float)a/(float)b;
	}

}
