/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import MainPac.Read_Sort;
import MainPac.Sort;
import Utils.utils;
import entity.Student;

/**
 * @author ASUS-PC
 *
 */
public class test_01 {
	
//	public void test_read_sort(){
//		Read_Sort read_sort = new Read_Sort();
//		ArrayList list = new ArrayList();
//		list.add(8);
//		list.add(7);
//		list.add(9);
//		read_sort.setSi(new Sort());
//		assertArrayEquals(new int[] {9,8,7},read_sort.Read_Sort(list));
//		
//	}
	
//	public void test_sort(){
//		Read_Sort read_sort = new Read_Sort();
//		ArrayList list = new ArrayList();
//		list.add(8);
//		list.add(7);
//		list.add(9);
//		read_sort.setSi(new Sort());
//		assertArrayEquals(new int[] {9,8,7},read_sort.Read_Sort(list));
//		
//	}
	double b[]  = new double[4];
	@Test
	public void test_Avg(){
		Read_Sort R = new Read_Sort();
		utils u = new utils();
		List<Student> stus= new ArrayList<Student>(); 
		stus = u.readData();
		ArrayList l = new ArrayList<Student>();
		R.setSi(new Sort());
		l = R.Read_Sort(stus);
		System.out.printf("学号\t\t姓名\t\t性别\t\t数学\t\t英语\t\t语文\t\t专业课\t\t总分\n");
		for(Student s:(ArrayList<Student>)l) {
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
		
		double a[] = {178.0,178.0,184.0,257.0};
		Student s1 = new Student();
		for(int i = 0;i<l.size();i++) {
			s1 = (Student) l.get(i);
			 b[i]= s1.getSumScore();
		}
		Assert.assertArrayEquals(a, b,0);

	}
	
	public void test_All(){
		utils u = new utils();
		List<Student> l= new ArrayList<Student>();
		l = u.readData();
		Read_Sort read_sort = new Read_Sort();
		l = read_sort.Read_Sort(l);
		double a[] = {178.0,178.0,184.0,257.0};
		double b[] = null;
		for(int i = 0;i<l.size();i++) {
			Student s = l.get(i);
			b[i] = s.getSumScore();
		}
		
		for(int i = 0;i<l.size();i++) {
			//assertArrayEquals(a[i],b[i]);
		}
	}	
}
