package Assess;
import java.util.Scanner;
public class VoterID {
	public int age;
	public void disp() {
		System.out.println("Enter the age of the voter");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		if(age<18 || age>65) {
			System.out.println("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		VoterID ob = new VoterID();
		ob.disp();
	}

}
