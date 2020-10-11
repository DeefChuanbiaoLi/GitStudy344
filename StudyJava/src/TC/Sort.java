/**
 * 
 */
package TC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Student.Student;

/**
 * @author ASUS-PC
 *
 */
public class Sort {
	
	public static void sort(List studs) {
//		Arrays.sort(arr);
		Collections.sort(studs,new Comparator<Student>() {

			@Override
			public int compare(final Student o1,final Student o2) {
				// TODO Auto-generated method stub
				int flag;
				flag = o1.getScore()-o2.getScore();
				return flag;
			}
			
		});
		System.out.printf("姓名\t\t分数\n");
		for(Student s:(ArrayList<Student>)studs) {
			String s1=String.format("%4d",s.getScore());
			System.out.printf("%s\t\t",s.getName());
			System.out.printf("%s\n",s1);
		}
		
		
	}
}
