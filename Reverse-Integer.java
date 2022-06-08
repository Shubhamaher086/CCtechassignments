class Solution 
{
    public static int reverse(int x) 
    {
       int reversed=0;
        int temp;
        int prev=0;
        
        while(x!=0)
        {
            temp=x%10;
            x/=10;
            
            reversed=(reversed*10)+temp;
            
            if((reversed-temp)/10!=prev)
                return 0;
            
            prev=reversed;
            
        }
       

        return reversed;
    }
    
     public static void main(String[] args)
    {
        
	        Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            System.out.println(reverse(x));
    }
}
