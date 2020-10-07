package Main;
import java.util.ArrayList;
import java.util.List;

import SortClass.Sort;
import Student.Student;


/**
 * @author ASUS-PC
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> Student = new ArrayList<Student>();
		Student stu1 = new Student("zhangsan",30);
        Student stu2 = new Student("lisi",80);
        Student stu3 = new Student("wangwu",90);
        Student.add(stu1);
        Student.add(stu2);
        Student.add(stu3);
        Sort.sort(Student);
		
			
	}
	
	

}
