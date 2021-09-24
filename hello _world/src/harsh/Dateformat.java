package harsh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d);
		SimpleDateFormat S4= new SimpleDateFormat("dd/MM/yyyy");
		String str=S4.format(d);
		System.out.println(str);	
	}
}
