package exam_05;

public class SiegeTank {
	// 멤버 변수
			int x, y;
			int hp;
			int 공격력, 방어력, 사거리;
			int 이동속도, 공격속도, 시야;
			
			// 생성자
			SiegeTank() {
				x=0; y=0;
				hp = 100;
				공격력 = 5; 방어력 = 0; 사거리 =1;
				이동속도 = 3; 공격속도 = 2; 시야 = 2;
			}			
			
			//멤버 메소드
			void 이동하기(int a, int b) {
				x = a;
				y = b;
				System.out.println("같이 가자 (" + x + " : " + y + ")");
			}
			
			//마린 공격하기 추가
			void 공격하기(SiegeTank s, Marine x) {
				System.out.println("공격하는 시즈탱크 주소 : " + s);
				System.out.println("공격받는 마린 주소 : " + x); //객체의 주소정보를 가져옴
				x.hp -= 공격력;
				System.out.println("탕!");
			}
			
			//시즈탱크 공격하기 추가
			void 공격하기(SiegeTank s1, SiegeTank s2) {
				System.out.println("공격하는 시즈탱크 주소 : " + s1);
				System.out.println("공격받는 시즈탱크 주소 : " + s2); //객체의 주소정보를 가져옴
				s2.hp -= 공격력;
				System.out.println("탕!");
			}
			
			
			void 패트롤() {
				System.out.println("순찰 중 이상 무");
			}
			
			void 홀드() {
				System.out.println("근무 중 이상 무");
			}
			
			void status() {
				System.out.println("------ 시즈탱크 상태보기 ------");
				System.out.println("hp : " + hp);
				System.out.println("공속 : " + 공격속도);
				System.out.println("이속 : " + 이동속도);
				System.out.println();
			}
}
