package d20180914;

public class GenericEx {
	public static void main(String[] args) {
		
	/*	TopString ts = new TopString();
		ts.setValue("���� �ָ�");
		
		System.out.println(ts.getValue());
		
		TopFloat tf = new TopFloat();
		tf.setValue(3.14f);
		
		System.out.println(tf.getValue());*/
		
		Top<Integer> t1 = new Top<Integer>();
		t1.setValue(100);
		
		System.out.println(t1.getValue());
		
		Top<String> ts = new Top<String>();
		ts.setValue("�ֵ���ũ");
		
		System.out.println(ts.getValue());
		
		
	}
}
