import java.util.Scanner;
class FrequencyCount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int data[]=new int[n];
		int freq[]=new int[n];
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			boolean found=false;
			for(int j=0;j<cnt;j++)
			{
				if(data[j]==a[i])
				{
					found=true;
					freq[j]++;
					break;
				}
			}
			if(found==false)
			{
				data[cnt]=a[i];
				freq[cnt]++;
				cnt++;
			}
		}
		for(int i=0;i<cnt-1;i++)
		{
			for(int j=i+1;j<cnt;j++)
			{
				if(freq[i]>freq[j])
				{
					int t=freq[i];
					freq[i]=freq[j];
					freq[j]=t;
					
					int q=data[i];
					data[i]=data[j];
					data[j]=q;
				}
			}
		}
		for(int e=0;e<cnt;e++)
			System.out.println(data[e]+"->"+freq[e]);	
				
		
	}
}