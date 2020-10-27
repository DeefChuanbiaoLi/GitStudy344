/**
 * 
 */
package MainPac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Student;

/**
 * @author ASUS-PC
 *
 */
public class Sort extends Sort_Interface{

	/* (non-Javadoc)ASUS-PC上午10:27:48
	 * @see main.Sort_Interface#Sort()
	 */
	@Override
	public ArrayList<Student> Sort(ArrayList array) {
		// TODO Auto-generated method stub
		System.out.printf("排序前：\n");
        System.out.printf("学号\t\t姓名\t\t性别\t\t数学\t\t英语\t\t语文\t\t专业课\t\t总分\n");
		for(Student s:(ArrayList<Student>)array) {
			//String s1=String.format("%4d",s.getEnglishScore());
			System.out.printf("%d\t\t",s.getSid());
			System.out.printf("%s\t\t",s.getName());
			System.out.printf("%s\t\t",s.getGender());
			System.out.printf("%s\t\t",s.getMathScore());
			System.out.printf("%s\t\t",s.getEnglishScore());
			System.out.printf("%s\t\t",s.getPoliticsScore());
			System.out.printf("%s\t\t",s.getProfessionalScore());
			System.out.printf("%s\t\t",s.getSumScore());
			System.out.println();
		}
		Collections.sort(array,new Comparator<Student>() {

			@Override
			public int compare(final Student o1,final Student o2) {
				// TODO Auto-generated method stub
				int flag;
				flag = (int) (o1.getSumScore()-o2.getSumScore());
				return flag;
			}
			
		});
		System.out.printf("总分排序：\n");
		System.out.printf("学号\t\t姓名\t\t性别\t\t数学\t\t英语\t\t语文\t\t专业课\t\t总分\n");
		for(Student s1:(ArrayList<Student>) array) {
			//String s1=String.format("%4d",s.getEnglishScore());
			System.out.printf("%d\t\t",s1.getSid());
			System.out.printf("%s\t\t",s1.getName());
			System.out.printf("%s\t\t",s1.getGender());
			System.out.printf("%s\t\t",s1.getMathScore());
			System.out.printf("%s\t\t",s1.getEnglishScore());
			System.out.printf("%s\t\t",s1.getPoliticsScore());
			System.out.printf("%s\t\t",s1.getProfessionalScore());
			System.out.printf("%s\t\t", s1.getSumScore());
			System.out.println();
		}
		return array;
	}

}
