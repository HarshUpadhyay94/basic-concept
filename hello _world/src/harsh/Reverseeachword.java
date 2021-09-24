
package harsh;

public class Reverseeachword {

	public static void main(String[] args) {
		
		String input= "dinanath chouhan";
		String[] output= input.split(" ");
		for(int i=0; i<output.length; i++) {
			String outputs=output[i];
		for(int j=outputs.length()-1; j>=0;j--){
			System.out.print(outputs.charAt(j));
		}
		System.out.print(" ");
		}
}
}
		

//for (String string : s) {
//	for(int i=string.length();i>0;i--) {
//		
//		System.out.print(string.charAt(i-1));
//	}
//	System.out.print(" ");
//	
//}	
//		
//		
	
		
		
		
	
		
				
	