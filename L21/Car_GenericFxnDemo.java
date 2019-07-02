package L21;

public class Car_GenericFxnDemo implements Comparable<Car_GenericFxnDemo> {
	int speed;
	int price;
	String color;
	
	public Car_GenericFxnDemo(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "S: "+this.speed+" P: "+this.price+" C: "+this.color;
	}

	@Override
	public int compareTo(Car_GenericFxnDemo other) {
//		return this.speed - other.speed;
//		return other.price - this.price;
		
		return this.color.compareTo(other.color);
	}
	
	
}
