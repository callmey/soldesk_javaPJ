package d20181004;

import java.util.Calendar;

//��¥ - Calendar
public class UtilEx3 {	
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//get(���)�� �ҷ��� ��
		//ex) �ø��� �ѹ� ���� �� ��� ����
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("������ ���ؿ� "+week + " ��° �� �Դϴ�.");
		
		//API ���� ��, �� ,�� ,��, ��, �� ����غ�����.
		
		//cal.set(year, month, date, hourOfDay, minute);
		
		System.out.println(cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DAY_OF_MONTH)
		+"��"+cal.get(Calendar.HOUR)+"��"+cal.get(Calendar.MINUTE)+"��"+cal.get(Calendar.SECOND)+"��");
	}

}
