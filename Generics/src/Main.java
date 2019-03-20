import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student <String, Integer> obj = 
//	            new Student<String, Integer>("pritam", 101);
		ArrayList<Student> arrstu = new ArrayList<Student>();
		
		Student st1 = new Student();
		Student st2 = new Student();
		st1.obj1 = "Pritam Datta";
		st1.obj2 = "East West University";
		st2.obj1 = "Rubel";
		st2.obj2 = "EWU";
		
		arrstu.add(st1);
		arrstu.add(st2);
		
		//foreach
		for(Student asl: arrstu) {
			System.out.println("Name: "+asl.obj1+"\nUniversity: "+asl.obj2);
		}
	}

}
