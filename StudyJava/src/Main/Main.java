package Main;
import java.util.ArrayList;
import java.util.List;

import Student.Student;
import TC.Biggest;
import TC.Sort;


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
		List<Student> studs = new ArrayList<Student>();
		Student stu1 = new Student("zhangsan",30);
        Student stu2 = new Student("lisi",80);
        Student stu3 = new Student("wangwu",90);
        studs.add(stu1);
        studs.add(stu2);
        studs.add(stu3);
        Sort.sort(studs);
       Biggest.biggest(studs);
		
			
	}
	
	

}
