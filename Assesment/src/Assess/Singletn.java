package Assess;

public class Singletn {
	static Singletn obj=null;
	private Singletn() {}
	public static Singletn getob() {
		if(obj==null) {
			obj = new Singletn();
		}
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletn ob1 = Singletn.getob();
		Singletn ob2 = Singletn.getob();
		System.out.println(ob1.hashCode() + " " + ob2.hashCode());


	}

}