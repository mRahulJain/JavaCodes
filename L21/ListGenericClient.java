package L21;

public class ListGenericClient {

	public static void main(String[] args) {
		
		LinkedListGeneric<String> list = new LinkedListGeneric<>();
		
		list.addFirst("abc");
		list.addFirst("def");
		list.addFirst("ghi");
		
		list.display();

	}

}
