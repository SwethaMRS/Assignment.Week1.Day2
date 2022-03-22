package week1.day2;

public class Calculator {
	
//	public int addNum(int a, int b)
//	{
//		return a+b;
//	}
//	
//	public double subNum(double x,double y)
//	{
//		return x-y;
//	}
//
//	public double mulNum(double p, double r)
//	{
//		double s= p*r;
//		return s;
//	}
	
	
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		int add = calc.add(5, 6,7);
		System.out.println("The sum is " + add);
		
		int sub = calc.sub(10, 7);
		System.out.println("The sub is " +sub);
		
		double mul = calc.mul(1023, 576);
		System.out.println("The value is "+mul);
		
		float div=calc.div(12.4f, 13.7f);
		System.out.println("The value is "+div);
	}
	
}
