package string;

public class maxStringInArray {
	
	public static void main(String[] args) {
		
		String[] s = {"abcdef","avbc","qfq","ab","ewree", };
		
		int maxlength = s[0].length();
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()>maxlength)
			{
				maxlength = s[i].length();    
				
			}
		}
		
		for(int i=0; i<s.length; i++)
		{
			if(maxlength==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
	}

}
