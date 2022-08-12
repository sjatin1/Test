package Assess;

public class Studdatatypes {
	
	private int id;
	 String name;
	protected int a;
	public int roll;
	
	
	public void disp() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(a);
		System.out.println(roll);
	}
	
	//Same class so all access modifiers are printed
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studdatatypes ob = new Studdatatypes();
		ob.disp();

	}

}
class Diff extends Studdatatypes{
	public void disp() {
		//System.out.println(id);
		System.out.println(name);
		System.out.println(a);
		System.out.println(roll);
		// Different class so Private access modifiers cannot be printed
	}
	
}
