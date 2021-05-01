package collection;

import java.util.ArrayList;

public class StudentData
{
	static int a=5;
	static ArrayList<Student> al=new ArrayList<Student>();
	static
	{
		Student s1=new Student(101,"Vandan");
		al.add(s1);
		Student s2=new Student(102,"Sumit");
		al.add(s2);
	}
	void addNewStudent(int roll,String name)
	{
		
	}
	
}
