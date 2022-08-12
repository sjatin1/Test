package Assess;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		for(int i=0; i<size-1; i++) {
			if(arr[i]+arr[i+1]==target) {
				System.out.println(i + " "+ (i+1));
			}
		}
	}
}
