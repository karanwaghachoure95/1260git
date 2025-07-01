package com.sandesh;

public class Addition {
	int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	public static void main(String[] args) {
		Addition a =new Addition();
		int num1=23;
		int num2=11;
		int sum=a.add(num1,num2);
		System.out.println("addtion is ="+sum);
	}
}
