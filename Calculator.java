public class Calculator {

int add(int a,int b) {return a+b;}
int sub(int a,int b) {return a-b;}
int mul(int a,int b) {return a*b;}
double div(int a,int b) {return 0.5+a/b;}

public static void main(String[] args) {
	Calculator calculator=new Calculator();
	System.out.println(calculator.add(10, 20));
	System.out.println(calculator.mul(10, 20));

	System.out.println(calculator.div(10, 20));
}
}
