package dayone;

public class SwitchCaseExample {

	public static void main(String[] args) {
		int day=8;
		switch(day)
		{
		   case 1:
			   System.out.println("Monday");
		   case 2:
			   System.out.println("Tuesday");
		   case 3:
			   System.out.println("Wednesday");
		    case 4:
			   System.out.println("Thursday");	
			   break;
		    case 6:
			   System.out.println("Saturday");	   
		    default:
		    	System.out.println("Sunday");
			   
		}
	}

}
