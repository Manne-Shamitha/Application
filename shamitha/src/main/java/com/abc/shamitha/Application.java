package com.abc.shamitha;
import java.util.*;

public class Application {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value: ");
		int a=sc.nextInt();
		System.out.println("enter b value: ");
		int b=sc.nextInt();
		Add ad=new Add();
		Sub su=new Sub();
		Div di=new Div();
		Mul mu=new Mul();
		System.out.println("Addition is : "+ad.add(a, b));
		System.out.println("Subtraction is : "+su.sub(a, b));
		System.out.println("Division is : "+di.div(a, b));
		System.out.println("Multiplication is : "+mu.mul(a, b));
	}
}
