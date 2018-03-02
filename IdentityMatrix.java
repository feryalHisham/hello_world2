
public class IdentityMatrix extends Matrix {

	public IdentityMatrix(int nn, int mm) {
		super(nn, mm);
		// TODO Auto-generated constructor stub
		//editing by feryal
		//super(nn,mnm);
	}

	public boolean SetNumbers(int[] arr)
	{
		boolean a=true;
		if(n!=m)
		{
			System.out.println("not identity");
			return false;
		}
		if(a==true)
		{
			int k=0;
			for(int i=0;i<arr.length;i++)
			{
				if(i==k)
				{
					if(arr[i]!=1)
					{
					System.out.println("not identity");
					return false;
					}
					k+=(super.n+1);
					
				}
				else
				{
					if(arr[i]!=0)
					{
					System.out.println("not identity");
					return false;
					}
				}
				
				
			}
		}
		else
			return false;
		
		
		System.out.println("identity");
		return super.SetNumbers(arr);
		
		
	}
}
