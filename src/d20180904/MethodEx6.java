package d20180904;
// 1. 1�̻� 1000������ ���� �߿��� �Ҽ��� ����ϴ� main�޼ҵ�
// 2. ���θ޼ҵ忡�� ���޵� ���� �Ҽ����� �ƴ����� �ľ��ϴ� primeNumber()
// 2-1. primeNumber()���� �Ҽ� ���θ� true, false �Ǵܿ��� ��ȯ
public class MethodEx6 {
	boolean primeNumber(int x) {
		for(int i=2; i<x; i++) {
			if(x % i  == 0) { // 1�� �ڱ� �ڽ� �̿ܿ� ���������� ���� �ִٸ�
				return false; //false ����
			}
		}
	
		return true; // 1�� �ڱ� �ڽŸ� ������ ���ٸ� true ����
	}
	public static void main(String[] args) {
		MethodEx6 me6 = new MethodEx6();
		
		
		for(int i=2; i<=1000; i++) {
			if(me6.primeNumber(i) == true) { // �Ҽ� ���
				System.out.println(i);
			}
		}
	}// main() end
}
