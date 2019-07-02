package L22;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> data = new ArrayList<>();

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.data.size() == 0;
	}

	public void add(int item) {
		this.data.add(item);
		upHeapify(this.data.size() - 1);
	}

	private void upHeapify(int ci) {
		int pi = (ci - 1) / 2;

		if (this.data.get(ci) < this.data.get(pi)) {
			swap(pi, ci);
			upHeapify(pi);
		}
	}

	public void swap(int i, int j) {
		int ith = this.data.get(i);
		int jth = this.data.get(j);

		this.data.set(i, jth);
		this.data.set(j, ith);
	}

	public int remove() {
		swap(0, this.data.size() - 1);
		int rv = this.data.remove(this.data.size() - 1);

		downHeapify(0);

		return rv;
	}

	private void downHeapify(int pi) {
		int mini = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		if (lci < this.data.size() && this.data.get(lci) < this.data.get(mini)) {
			mini = lci;
		}
		
		if (rci < this.data.size() && this.data.get(rci) < this.data.get(mini)) {
			mini = rci;
		}
		
		if(mini!=pi) {
			swap(pi, mini);
			downHeapify(mini);
		}
	}
	
	public int getHP() {
		return this.data.get(0);
	}

	public void display() {
		for (Integer val : this.data) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
