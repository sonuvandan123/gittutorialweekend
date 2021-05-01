package collection;

public class Student 
{
	int enrollmentID;
	String studentName;
	//float marks;
	public Student(int enrollmentID, String studentName) {
		this.enrollmentID = enrollmentID;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [enrollmentID=" + enrollmentID + ", studentName=" + studentName + "]";
	}
	/*
	 * public void printStudentData() {
	 * 
	 * }
	 */
	
}
