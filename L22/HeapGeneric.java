package L22;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

	ArrayList<T> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.data.size() == 0;
	}

	public void add(T item) {
		this.data.add(item);
		upHeapify(this.data.size() - 1);
	}

	private void upHeapify(int ci) {
		int pi = (ci - 1) / 2;

		if (this.data.get(ci).compareTo(this.data.get(pi))>0) {
			swap(pi, ci);
			upHeapify(pi);
		}
	}

	public void swap(int i, int j) {
		T ith = this.data.get(i);
		T jth = this.data.get(j);

		this.data.set(i, jth);
		this.data.set(j, ith);
	}

	public T remove() {
		swap(0, this.data.size() - 1);
		T rv = this.data.remove(this.data.size() - 1);

		downHeapify(0);

		return rv;
	}

	private void downHeapify(int pi) {
		int mini = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		if (lci < this.data.size() && this.data.get(lci).compareTo(this.data.get(mini))>0) {
			mini = lci;
		}
		
		if (rci < this.data.size() && this.data.get(rci).compareTo(this.data.get(mini))>0) {
			mini = rci;
		}
		
		if(mini!=pi) {
			swap(pi, mini);
			downHeapify(mini);
		}
	}
	
	public T getHP() {
		return this.data.get(0);
	}

	public void display() {
		for (T val : this.data) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}
	
}
