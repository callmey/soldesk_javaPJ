package d20180906;

public class Medic extends Teran{
	int ġ���, mp;
	
	Medic() {
		//super();
		this.ġ��� = 2;
		this.mp = 50;
	}
	
	void ġ���ϱ�(Teran t) {
		// �׶��� �θ�Ŭ������ �ϴ� ��� �ڽ� Ŭ������ ġ���� �� ����
		t.hp += ġ���;
		this.mp -= 5;
		if(t.hp > 100) {
			t.hp = 100;
		}//if end
		
		System.out.println("ġ�� �Ǿ����ϴ�.");
	}
}
