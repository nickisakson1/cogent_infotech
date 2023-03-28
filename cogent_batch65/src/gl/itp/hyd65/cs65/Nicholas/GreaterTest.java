package gl.itp.hyd65.cs65.Nicholas;

public class GreaterTest {
	
	public static void main(String[] args) {
		Advisor a = new Advisor();
		for(int i=0;i<args.length;i++) {
			Greater g = new Greater(args[i]);
			g.sayHello();
		}
		for(int k=0;k<args.length;k++) {
			System.out.println(a.getAdvice());
		}
		for(int j=0;j<args.length;j++) {
			Greater g = new Greater(args[args.length-j-1]);
			g.sayGoodbye();
		}
	}

}
