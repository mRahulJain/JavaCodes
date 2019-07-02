package L21;

import java.util.Comparator;

public class Client {

	public static void main(String[] args) {
		
		Car_GenericFxnDemo[] carr = new Car_GenericFxnDemo[5];
		display(carr);
		
		carr[0] = new Car_GenericFxnDemo(100, 10, "Black");
		carr[1] = new Car_GenericFxnDemo(400, 20, "Red");
		carr[2] = new Car_GenericFxnDemo(80, 60, "White");
		carr[3] = new Car_GenericFxnDemo(780, 5, "Brown");
		carr[4] = new Car_GenericFxnDemo(34, 100, "Grey");
		
		display(carr);
		
//		Bubble_Sort(carr);
//		display(carr);
		Bubble_Sort(carr, new CarSpeedComparator());
		display(carr);
		Bubble_Sort(carr, new CarPriceComparator());
		display(carr);
		Bubble_Sort(carr, new CarColorComparator());
		display(carr);

	}

	public static <T> void display(T[] arr) {
		for(T val : arr) {
			System.out.println(val);
		}
	}
	
	public static <T extends Comparable<T>> void Bubble_Sort(T[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int i = 0; i < arr.length - counter - 1; i++) {
				if (arr[i].compareTo(arr[i + 1])>0) {
					T temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static <T> void Bubble_Sort(T[] arr, Comparator<T> comparator) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int i = 0; i < arr.length - counter - 1; i++) {
				if (comparator.compare(arr[i], arr[i+1])>0) {
					T temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
