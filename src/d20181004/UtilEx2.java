package d20181004;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class UtilEx2 {
	public static void main(String[] args) {
		/*Date date = new Date(2018,10,4);
		System.out.println(date);*/
		
		Date d = new Date();
		//System.out.println(d);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(d);
		System.out.println(time);
	}
}
