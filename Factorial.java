import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static int factorial(int a){
		if(a<=1){
           return a;
		}else{
		     
			return a*factorial(a-1);	
		}
	}
	public static void main(String[] args){
          Scanner scan=new Scanner(System.in);
          System.out.println("enter the number to get factorial of that number");
          int num=scan.nextInt();
          System.out.println("the factorial of the number is: "+factorial(num));
	}
}
