package dayone;

public class NestedForLoop {
public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=3;i--)
		{
			for(j=1;j<=3;j=j+2)
			{
				System.out.println("*");
				if(i==2)
				{
					break;
				}
			}	
		}

	}

}
