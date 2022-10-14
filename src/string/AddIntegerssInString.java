package string;

public class AddIntegerssInString {
	
	public static void main(String[] args) {
		
		String s = "11b21c3";    //o/p- 35
		int sum=0;
		int tsum=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;
				tsum= tsum*10+n;  //3
			}
			
			else
			{
				sum=sum+tsum;   //11+21=32
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);   //32+3
	}

}
