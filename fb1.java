import java.util.*;
class fb1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number-");
		int num=sc.nextInt();
		int divider=num;
		String len = Integer.toString(num);
		int arr[]=new int[len.length()];
		int count=0;
		while(divider>0)
		{
			arr[count]=divider%10;
			divider=divider/10;
			count++;
		}
	// Reversing the array	
		for(int i = 0; i < arr.length / 2; i++)
		{
    		int temp = arr[i];
    		arr[i] = arr[arr.length - i - 1];
    		arr[arr.length - i - 1] = temp;
		}
		if(len.length()==2)
		{
			if(arr[0]<arr[1])
			{
				System.out.println(num);
			}
			else
			{
				int temp=0;
				temp=arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
				System.out.println(arr[0]+" "+arr[1]);
			}
		}
		else
		{
			for(int i=arr.length-1;i>0;i--)
			{
				if(arr[i]<arr[i-1])
				{
					int temp=0;
				    temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
					System.out.println(Arrays.toString(arr));
					break;
				}
			}
		}
	}
}