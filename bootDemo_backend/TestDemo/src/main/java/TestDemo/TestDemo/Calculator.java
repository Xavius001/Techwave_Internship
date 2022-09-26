package TestDemo.TestDemo;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int product(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int total(int a) {
		// TODO Auto-generated method stub
		int tot=0;
		for(int i=1; i<=a; i++) {
			tot+=i;
		}
		return tot;
	}
	
}
