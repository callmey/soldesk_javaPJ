package d20180828;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÅÂ¾î³­ ³âµµ 4ÀÚ¸® ÀÔ·Â : ");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		// ÀÚÃàÀÎ¹¦ Áø»ç¿À¹Ì ½ÅÀ¯¼úÇØ
		// Áã¼ÒÈ£Åä ¿ë¹ì¸»¾ç ¿ø´ß°³µÅ
		// 4 5 6 7 8 9 0 1 2 3 4 5
		
		System.out.println(year);
		
		// ÄÜ¼Ö¿¡ ´ç½ÅÀº ~~¶ì ÀÔ´Ï´Ù Ãâ·ÂÇØº¸¼¼¿ä
		/*
		if((year >= 1984 && year < 1996) || (year >= 1996 && year < 2018) || year >= 2018) {
			for(int i = 0; i < 11; i++) {
				if((year == (1984 + i)) || (year == (1996 + i)) || (year == (2018 + i)))  {
					switch(i) {
						case 0: System.out.println("´ç½ÅÀº Áã¶ì ÀÔ´Ï´Ù."); break;
						case 1: System.out.println("´ç½ÅÀº ¼Ò¶ì ÀÔ´Ï´Ù"); break;
						case 2: System.out.println("´ç½ÅÀº È£¶ûÀÌ¶ì ÀÔ´Ï´Ù"); break;
						case 3: System.out.println("´ç½ÅÀº Åä³¢¶ì ÀÔ´Ï´Ù"); break;
						case 4: System.out.println("´ç½ÅÀº ¿ë¶ì ÀÔ´Ï´Ù"); break;
						case 5: System.out.println("´ç½ÅÀº ¹ì¶ì ÀÔ´Ï´Ù"); break;
						case 6: System.out.println("´ç½ÅÀº ¸»¶ì ÀÔ´Ï´Ù"); break;
						case 7: System.out.println("´ç½ÅÀº ¾ç¶ì ÀÔ´Ï´Ù"); break;
						case 8: System.out.println("´ç½ÅÀº ¿ø¼şÀÌ¶ì ÀÔ´Ï´Ù"); break;
						case 9: System.out.println("´ç½ÅÀº ´ß¶ì ÀÔ´Ï´Ù"); break;
						case 10: System.out.println(i);System.out.println("´ç½ÅÀº °³¶ì ÀÔ´Ï´Ù"); break;
						case 11: System.out.println("´ç½ÅÀº µÅÁö¶ì ÀÔ´Ï´Ù"); break;
						}
				}
			}
		}	*/
		
		year %= 12;
		
		if (year==4) {
			System.out.println("´ç½ÅÀº Áã¶ì ÀÔ´Ï´Ù.");
		}
		if (year==5) {
			System.out.println("´ç½ÅÀº ¼Ò¶ì ÀÔ´Ï´Ù.");
		}
		if (year==6) {
			System.out.println("´ç½ÅÀº È£¶ûÀÌ¶ì ÀÔ´Ï´Ù.");
		}
		if (year==7) {
			System.out.println("´ç½ÅÀº Åä³¢¶ì  ÀÔ´Ï´Ù.");
		}
		if (year==8) {
			System.out.println("´ç½ÅÀº ¿ë¶ì ÀÔ´Ï´Ù.");
		}
		if (year==9) {
			System.out.println("´ç½ÅÀº  ¹ì¶ì ÀÔ´Ï´Ù.");
		}
		if (year==10) {
			System.out.println("´ç½ÅÀº ¸»¶ì ÀÔ´Ï´Ù.");
		}
		if (year==11) {
			System.out.println("´ç½ÅÀº ¾ç¶ì ÀÔ´Ï´Ù.");
		}
		if (year==0) {
			System.out.println("´ç½ÅÀº ¿ø¼şÀÌ¶ì ÀÔ´Ï´Ù.");
		}
		if (year==1) {
			System.out.println("´ç½ÅÀº ´ß¶ì ÀÔ´Ï´Ù.");
		}
		if (year==2) {
			System.out.println("´ç½ÅÀº °³¶ì ÀÔ´Ï´Ù.");
		}
		if (year==3) {
			System.out.println("´ç½ÅÀº µÅÁö¶ì ÀÔ´Ï´Ù.");
		}
		
	}
}


