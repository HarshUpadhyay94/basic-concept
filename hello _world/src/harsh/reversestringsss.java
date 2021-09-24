package harsh;

public class reversestringsss {
	public static void main( String []args ) {
	String ho= "harsh upadhyay";
	String hr= "";
	for(int i=ho.length()-1; i>=0; i--)
		hr=hr + ho.charAt(i);
		System.out.println(hr); 
}
}