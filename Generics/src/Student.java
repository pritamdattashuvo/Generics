
public class Student<T,U> {
	
	T obj1;
	U obj2;
//	Student(T obj1, U obj2) 
//    { 
//        this.obj1 = obj1; 
//        this.obj2 = obj2; 
//    } 
	
	public T getObj1() {
		return obj1;
	}


	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}


	public U getObj2() {
		return obj2;
	}


	public void setObj2(U obj2) {
		this.obj2 = obj2;
	}
	
	public void addstudent(T obj1,U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

}
