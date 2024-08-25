package ObjectOrientedProgramming;

class subject{
	private String SubId;
	private String name;
	private int MaxMarks;
	private int MarksObt;
	
	
    public subject(String SubId,String name,int MaxMarks){
    	this.SubId=SubId;
    	this.name=name;
    	setMaxMarks(MaxMarks);
    }
    public String getId() {
    	return SubId;
    }
    public String name() {
    	return name;
    }
    public int MaxMarks() {
    	return MaxMarks;
    }
    public int MarksObt() {
    	return MarksObt;
    }
    public void setMaxMarks(int Mm) {
    	MaxMarks=Mm;
    }
    public void setMarksObt(int Mo) {
    	MarksObt=Mo;
    }
    boolean isQualified(int Mo) {
    	return Mo>=MaxMarks/10*4;
    }
    public String toString() {
    	return "\nSubject Id:"+SubId+"\nName:"+name+"\nMarks Obtained:"+MarksObt;
    }
    
}
//class Student{
//	private int rollNo;
//	private String name;
//	private String dept;
//	private String[] subjects;
//	
//	public Student(int rollno,String name,String dept){
//		rollNo=rollno;
//		this.name=name;
//		this.dept=dept;
//		
//	}
//	public Student(String...subjects) {
//		this.subjects=subjects;
//	}
//	public long getrollno() {
//		return rollNo;
//	}
//	public String getname() {
//		return name;
//	}
//	public String getdept() {
//		return dept;
//	}
//	public String[] getsubjects(){
//		return subjects;
//	}
//	public void setsubjects(int start,String... s) {
//		for(int i=0; i<s.length; i++) {
//			   System.out.println(start+1+"."+s[i]);
//			   start++;
//		   }
//	}
//	public String toString() {
//		return "\nRollno:"+rollNo+"\nName:"+name+"\nDepartment:"+dept+"\nSubjects:"+subjects;
//				
//	}
//}
public class SubjectStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     subject subs[] = new subject[3];
     subs[0]=new subject("s101","DS",100);
     subs[1]=new subject("s102","DA",100);
     subs[2]=new subject("s103","OS",100);
     
     for(subject s:subs) {
    	  System.out.println(s);
     }
//     
//     Student s[]=new Student[3];
//     s[0]=new Student(21,"Arijit","Computer Science Enginnering");
//     s[1]=new Student(22,"Arkajyoti","Computer Science Enginnering");
//     s[2]=new Student(23,"Dip","Computer Science Enginnering");
//     
//     for(Student A:s) {
//    	 System.out.println(A);
    // }
//     Student x = new Student();
//     x.setsubjects(1,"DSA","DAA","OS");
     
     
    
     }
     
	}


