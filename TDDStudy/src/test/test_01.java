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
