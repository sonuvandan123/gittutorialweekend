package dayone;

public class IfElseExam {
	public static void main(String[] args) {
		int a=5;int b=5;int c=5;int d=10;
		if(a==b)    // a not equal to b
		{
			System.out.println("If block");
			if(c==5)
			{
				System.out.println("If inside if");
			}
			else
			{
				System.out.println("else inside if");
			}
			
		}
		else
		{
			System.out.println("else block");
		}

	}

}
