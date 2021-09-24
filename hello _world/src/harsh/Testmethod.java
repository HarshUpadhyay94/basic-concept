package harsh;

public class Testmethod {
	public void division() {
		int a= 20;
		int b=10;
		System.out.println(a/b);
	}
	
	public int sum() {
		int c=10;
		int d=10;
		int f= (c+d);
		return f;
				
	}

	public static void main (String[] args) {
		Testmethod t = new Testmethod();
		
		t.division();
		
		System.out.println(t.sum());
	}
}