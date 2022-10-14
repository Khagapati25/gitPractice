package array;

public class AddingCorrespondingEleInArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4};
		int[] b = {1,2,3};

		int length=a.length;

		if(a.length<b.length)
		{
			length= b.length;
		}

		for(int i=0; i<a.length; i++)
		{
			try
			{
				System.out.print(a[i]+b[i]);
			}
			catch(Exception e)
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
			}

		}

	}
}
