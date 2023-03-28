package cogent_batch65;

public class CalcAverage {
	
	public double avgFirstN(int N) throws IllegalArgumentException{
		double x = 0;
		if(N==0) {
			throw new IllegalArgumentException();
		}
		else {
			for(double i=1;i<=N;i++) {
				x+=i;
			}
		}
		return x/N;
	}

}
