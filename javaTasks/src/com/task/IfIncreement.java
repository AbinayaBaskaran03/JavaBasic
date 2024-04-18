package com.task;

import java.util.Scanner;

public class IfIncreement {

	public static void main(String args[]) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter num1");
		int num = value.nextInt();
        printNumbers(num);

	}
	public static void printNumbers(int num) {
        if (num <= 10) {
            System.out.println(num);
            num++;
            printNumbers(num);
        }
    }

}
