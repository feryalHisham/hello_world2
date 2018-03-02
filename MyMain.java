
public class MyMain {

	public MyMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world!");
		Matrix x=new Matrix(2,2);
		int[] arr={1,2,3,4};
		System.out.println(x.SetNumbers(arr));
		x.Print();
		Matrix x1=new Matrix(2,3);
		int[] arr3={1,1,1,0,0,0};
		System.out.println(x1.SetNumbers(arr3));
		x1.Print();
	    
		IdentityMatrix y=new IdentityMatrix(3,3);
		int[] arr2={1,0,0,0,1,0,2,0,1};
		y.SetNumbers(arr2);
		y.Print();
		
		Matrix res=(Matrix)x.mult(x1);
		if(res!=null)
		res.Print();
	}

}
