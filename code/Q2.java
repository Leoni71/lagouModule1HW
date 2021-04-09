import java.util.Scanner;

public class Q2{
	public static void main(String[] args){
		System.out.println("1000以内的完数有：");
		for(int num = 1; num <= 1000; num++){
			int sum = 0;
			for(int i = 1; i < num; i++){
				if(num%i == 0){
					sum += i;
				}
			}
			if (sum == num){
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
}