package com.task;
@FunctionalInterface
interface Calcu {
	public abstract int add(int a, int b);
}
public class AbsInterFunc {
	public static void main(String[] args) {
		Calcu Obj = (a, b) -> {
			System.out.println(a + b);
			return a + b;
		};
		Obj.add(5, 1);
	}

}
