package harsh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformatqutions {
	
	public static void main(String[] args) {
		Date d= new Date();
		SimpleDateFormat S5 = new SimpleDateFormat("dd/MM/yyyy");
		String strr=S5.format(d);
		System.out.println();
		
//		int b=Integer.parseInt(strr);
//		int a=2022;
//		System.out.println(Math.subtractExact(b, a));
		
	}
}
