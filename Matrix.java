
public class Matrix implements Multipliable {

	int n,m;
	int[][] numbers;
	Matrix(int nn,int mm)
	{
		n=nn;
		m=mm;
		numbers=new int[n][m];
		
	}

	
	@Override
	public Object mult(Object obj) {
		// TODO Auto-generated method stub
		
		Matrix res=new Matrix(n,((Matrix)obj).m);
		try{
		int sum;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<((Matrix)obj).m;j++)
			{
			
				sum = 0;
				for(int k=0;k<m;k++)
					
					{
					sum = sum +numbers[i][k]*((Matrix)obj).numbers[k][j];
					}
				res.numbers[i][j]=sum;
			}
			
		}
		return res;
		}
		catch(Exception e) {
			  System.out.println("Error out of range "); 
			  return null;
			}

		

		
	}
	public boolean SetNumbers(int[] arr)
	{
		int k=0;
		if (arr.length!=n*m)
			return false;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				numbers[i][j]=arr[k];
				k++;
			}
		}
	
		return true;
		
	}
	public void Print()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.print("\n");
		}
	}


}
