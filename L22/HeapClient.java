package L22;

import L21.Car_GenericFxnDemo;

public class HeapClient {

	public static void main(String[] args) {
//		Heap h1= new Heap();
//		h1.add(10);
//		h1.add(20);
//		h1.add(30);
//		h1.add(40);
//		h1.add(50);
//		
//		h1.display();
//		
//		h1.add(7);
//		
//		h1.display();
//		
//		h1.remove();
//		h1.remove();
//		h1.remove();
//		
//		h1.display();
//		
//		System.out.println(h1.getHP());
		
		Car_GenericFxnDemo[] carr = new Car_GenericFxnDemo[5];
		
		carr[0] = new Car_GenericFxnDemo(100, 10, "Black");
		carr[1] = new Car_GenericFxnDemo(400, 20, "Red");
		carr[2] = new Car_GenericFxnDemo(80, 60, "White");
		carr[3] = new Car_GenericFxnDemo(780, 5, "Brown");
		carr[4] = new Car_GenericFxnDemo(34, 100, "Grey");
		
		HeapGeneric<Car_GenericFxnDemo> heapg = new HeapGeneric();
		for(int i = 0; i<5 ; i++) {
			heapg.add(carr[i]);
		}
		
		while(!heapg.isEmpty()) {
			System.out.println(heapg.remove());
		}

	}

}
