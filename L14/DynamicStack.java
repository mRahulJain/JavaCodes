package L14;

import L13.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] oa = this.data;
			int[] na = new int[2 * (oa.length)];

			for (int i = 0; i < oa.length; i++) {
				na[i] = oa[i];
			}
			this.data = na;
		}

		super.push(item);

	}

//	public int getMin()
//	{
//		
//	}

}
