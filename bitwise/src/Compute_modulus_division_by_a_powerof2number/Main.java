package Compute_modulus_division_by_a_powerof2number;

public class Main {

	public static void main(String argv[]){
		int a = 9;
		int b = 2;
		int x = a&(b-1);
		System.out.println(x);
	}
}
