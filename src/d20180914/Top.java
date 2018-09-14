package d20180914;

// 자료형 변수를 일반화 : <>
// 제너릭 : 일반화
//		: 설계 시점에 타입을 결정하지 않고 run time 시점에 자료형을 결정해준다.

public class Top<T> {
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
