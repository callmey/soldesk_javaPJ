package exam_05;

public class SiegeTank {
	// ��� ����
			int x, y;
			int hp;
			int ���ݷ�, ����, ��Ÿ�;
			int �̵��ӵ�, ���ݼӵ�, �þ�;
			
			// ������
			SiegeTank() {
				x=0; y=0;
				hp = 100;
				���ݷ� = 5; ���� = 0; ��Ÿ� =1;
				�̵��ӵ� = 3; ���ݼӵ� = 2; �þ� = 2;
			}			
			
			//��� �޼ҵ�
			void �̵��ϱ�(int a, int b) {
				x = a;
				y = b;
				System.out.println("���� ���� (" + x + " : " + y + ")");
			}
			
			//���� �����ϱ� �߰�
			void �����ϱ�(SiegeTank s, Marine x) {
				System.out.println("�����ϴ� ������ũ �ּ� : " + s);
				System.out.println("���ݹ޴� ���� �ּ� : " + x); //��ü�� �ּ������� ������
				x.hp -= ���ݷ�;
				System.out.println("��!");
			}
			
			//������ũ �����ϱ� �߰�
			void �����ϱ�(SiegeTank s1, SiegeTank s2) {
				System.out.println("�����ϴ� ������ũ �ּ� : " + s1);
				System.out.println("���ݹ޴� ������ũ �ּ� : " + s2); //��ü�� �ּ������� ������
				s2.hp -= ���ݷ�;
				System.out.println("��!");
			}
			
			
			void ��Ʈ��() {
				System.out.println("���� �� �̻� ��");
			}
			
			void Ȧ��() {
				System.out.println("�ٹ� �� �̻� ��");
			}
			
			void status() {
				System.out.println("------ ������ũ ���º��� ------");
				System.out.println("hp : " + hp);
				System.out.println("���� : " + ���ݼӵ�);
				System.out.println("�̼� : " + �̵��ӵ�);
				System.out.println();
			}
}
