import java.util.Scanner;

public class Fibonacci {
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.
	public static int fib(int a){
        int f1=0;
        int f2=1;
        for(int i=1;i<a;i++){
            int c=f1;
            f1=f2;
            f2=c+f2;
        	if(i==a-1){
        		return f2;
            }
        }
        return 0;
	}
	public static int fibRek(int a){
		if(a<2){
           return a;
		}else{
           // int f1=1;
           return fibRek(a-2)+fibRek(a-1);
		}
	}
	public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         System.out.println("enter the position");
         int input=scan.nextInt();
         System.out.println("the  number at position ["+input+"] is: "+fib(input));
         System.out.println("the position is; "+fibRek(input));
	}

}
