package com.test1;

public class Power {

	public static void main(String[] args) {
		int base =3;
		int exp = 2;
		int power =1;
		for(int i=0; i<exp ; i++)
		{
			power = power * base;
			
		}
		System.out.println(power);
	}

}
