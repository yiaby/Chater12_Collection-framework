package generics;

public class Point<T,V> { //=> 두 좌표 x,y는 정수일수도 있고 실수일 수도 있기때문에  T와V라는 자료형 매개변수로 표현
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	//제네릭 메서드
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
