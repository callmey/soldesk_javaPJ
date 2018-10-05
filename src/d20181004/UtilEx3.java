package d20181004;

import java.util.Calendar;

//날짜 - Calendar
public class UtilEx3 {	
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//get(상수)로 불러서 씀
		//ex) 시리얼 넘버 생성 시 사용 가능
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("오늘은 올해에 "+week + " 번째 주 입니다.");
		
		//API 보고 년, 월 ,일 ,시, 분, 초 출력해보세요.
		
		//cal.set(year, month, date, hourOfDay, minute);
		
		System.out.println(cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DAY_OF_MONTH)
		+"일"+cal.get(Calendar.HOUR)+"시"+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+"초");
	}

}
