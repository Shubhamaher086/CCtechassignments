class Solution {
    public static boolean isPalindrome(int x)
	{
	int r,s=0;
	int temp= x;
	
	while(x>0)
	{
		r=x%10;
		s=s*10+r;
		x=x/10;
	}
	if(s==temp)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	}


public  static void main(String[]arg) 
{

	int n;
	System.out.println("x = ");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	if(isPalindrome(x))
		{
			System.out.println("true");
		}
	else
		{
			System.out.println("false");
		}

}
}
