package L14;

public class DynamicQueue_Circular extends Queue_Circular {
	
	@Override
	public void enqueue(int item) throws Exception {
		if(isFull())
		{
			int[] oa= this.data;
			int[] na= new int[2*oa.length];
			
			for(int i=0;i<oa.length;i++)
			{
				int idx= (i+this.front)%this.data.length;
				na[i]=oa[idx];
			}
			
			this.data=na;
			this.front=0;
		}
		super.enqueue(item);
	}
}
