package Assess;
import java.util.Scanner;
public class Rotate {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int []arr = new int[size];
		int []narr = new int[size];
		System.out.println("Enter the values");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of d for rotation");
		int d=sc.nextInt();
		int k=0;
		for(int i=d; i<size; i++) {
			narr[k]=arr[i];
			k++;
		}
		for(int i=0; i<d; i++) {
			narr[k]=arr[i];
			k++;
		}
		for(int i=0; i<size;i++) {
			System.out.print(narr[i] + " ");
		}
	}
}
