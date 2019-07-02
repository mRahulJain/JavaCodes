package L24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vtces = new HashMap<>();

	public int noOfVertex() {
		return this.vtces.size();
	}

	public boolean containVertex(String vname) {

		for (String key : vtces.keySet()) {
			if (key == vname) {
				return true;
			}
		}
		return false;
	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();

		vtces.put(vname, vtx);
	}

	public int noOfEdges() {
		int sum = 0;
		for (String key : vtces.keySet()) {
			Vertex vtx = vtces.get(key);
			sum = sum + vtx.nbrs.size();

		}
		return sum / 2;
	}

	public boolean containEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}

		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void removeVertex(String vname) {
		Vertex vtx = vtces.get(vname);
		for (String key : vtx.nbrs.keySet()) {
			Vertex vtx1 = vtces.get(key);
			vtx1.nbrs.remove(vname);
		}

		vtces.remove(vname);
	}

	public void display() {
		System.out.println("----------------------");
		for (String key : vtces.keySet()) {
			Vertex vtx = vtces.get(key);
			String str = key + " -> " + vtx.nbrs;
			System.out.println(str);
		}
		System.out.println("----------------------");
	}

	public boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {
		processed.put(src, true);

		if (containEdge(src, dst)) {
			return true;
		}

		Vertex svtx = vtces.get(src);

		for (String nbr : svtx.nbrs.keySet()) {

			if (!processed.containsKey(nbr) && hasPath(nbr, dst, processed)) {
				return true;
			}

		}

		return false;
	}

	private class Pair {
		String vname;
		String psf;
		
		String color;
	}

	public boolean bfs(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> queue = new LinkedList<>();

		// make a starting pair and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		queue.addLast(sp);

		// work till queue is not empty
		while (!queue.isEmpty()) {

			// remove the pair from the queue
			Pair rp = queue.removeFirst();

			// ignore the second C
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst); // psf: PathSoFar
				return true;
			}

			Vertex vtx = vtces.get(rp.vname);

			for (String nbr : vtx.nbrs.keySet()) {
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}
			}
		}

		return false;
	}

	public boolean dfs(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> stack = new LinkedList<>();

		// make a starting pair and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		stack.addFirst(sp);

		// work till queue is not empty
		while (!stack.isEmpty()) {

			// remove the pair from the queue
			Pair rp = stack.removeFirst();

			// ignore the second C
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			processed.put(rp.vname, true);

			if (containEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			Vertex vtx = vtces.get(rp.vname);

			for (String nbr : vtx.nbrs.keySet()) {
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;

					stack.addFirst(np);
				}
			}
		}

		return false;
	}

	public void bft() {
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				// remove the pair from the queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}
		}

	}

	public void dft() {
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> stack = new LinkedList<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			stack.addFirst(sp);

			while (!stack.isEmpty()) {

				// remove the pair from the queue
				Pair rp = stack.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						stack.addFirst(np);
					}
				}
			}
		}

	}

	static int flag = 0;

	public boolean isConnected() {
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			flag++;
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				// remove the pair from the queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);

//				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}
		}

		if (flag > 1) {
			return false;
		}
		
		return true;

	}

	public boolean isCyclic() {
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				// remove the pair from the queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					return true;
				}

				processed.put(rp.vname, true);

//				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}

		}
		return false;
	}
	
	public boolean isTree() {
		if(isConnected() && !isCyclic()) {
			return true;
		}
		return false;
	}
	
	public ArrayList<ArrayList<String>> getCC() {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		
		HashMap<String, Boolean> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {
			ArrayList<String> subans = new ArrayList<>();
			
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				// remove the pair from the queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				processed.put(rp.vname, true);
				
				subans.add(rp.vname);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}
			}
			ans.add(subans);
		}
		return ans;
	}

	public boolean isBipartite() {
		HashMap<String, String> processed = new HashMap<>();

		// make queue using LinkedList
		LinkedList<Pair> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			sp.color = "r";
			queue.addLast(sp);

			while (!queue.isEmpty()) {

				// remove the pair from the queue
				Pair rp = queue.removeFirst();

				// ignore the second C
				if (processed.containsKey(rp.vname)) {
					if(processed.containsKey(rp.vname)) {
						String oc = processed.get(rp.vname);
						String nc = rp.color;
						
						if(!oc.equals(nc)) {
							return false;
						}
					}
					
					continue;
				}

				processed.put(rp.vname, rp.color);

//				System.out.println(rp.vname + " via " + rp.psf);

				Vertex vtx = vtces.get(rp.vname);

				for (String nbr : vtx.nbrs.keySet()) {
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						
						String color = rp.color == "r" ? "g" : "r";
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						np.color = color;

						queue.addLast(np);
					}
				}
			}
		}
		return true;
	}
}
