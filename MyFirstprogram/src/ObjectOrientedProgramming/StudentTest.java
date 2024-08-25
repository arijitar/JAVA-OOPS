package ObjectOrientedProgramming;

class student{
	public String name;
	public int rollno;
	public String Course;
	public int m1,m2,m3;
	
	public int total() {
		return m1+m2+m3;
	}
	public float average() {
		return total()/3;
	}
	public char grade() {
		if(average()>=60) {
			return 'A';
		}
		else
			return 'B';
	}
	public String details() {
		return "Roll no:"+rollno+"\n"+"Name:"+name+"\n"+"Course:"+Course+"\n";
	}
}
public class StudentTest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    student s = new student();
    s.name="Arijit";
    s.rollno=21;
    s.Course="Computer Science Engineering";
    s.m1=100;
    s.m2=71;
    s.m3=89;
    
    System.out.println("Total:"+s.total());
    System.out.println("Average:"+s.average());
    System.out.println("Grade:"+s.grade());
    System.out.println("Student details:\n"+s.details());
	}
}
