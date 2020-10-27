
package test;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import MainPac.AvgScore_Interface;
import MainPac.FindeScore_Interface;
import MainPac.Main;
import MainPac.MaxScore_Interface;
import MainPac.Sort;
import MainPac.Sort_Interface;
import Utils.util_Interface;
import Utils.utils;
import entity.Student;

public class test_01 {
	util_Interface util;
	Sort_Interface sort;
	AvgScore_Interface avg;
	FindeScore_Interface fin;
	MaxScore_Interface max;
	List<Student> stus;
	public FindeScore_Interface getFin() {
		return fin;
	}
	public void setFin(FindeScore_Interface fin) {
		this.fin = fin;
	}
	public AvgScore_Interface getAvg() {
		return avg;
	}
	public void setAvg(AvgScore_Interface avg) {
		this.avg = avg;
	}
	public Sort_Interface getSort() {
		return sort;
	}
	public void setSort(Sort_Interface sort) {
		this.sort = sort;
	}
	public util_Interface getUtil() {
		return util;
	}
	public void setUtil(util_Interface util) {
		this.util = util;
	}
	
	double b[]  = new double[4];
	@Test
	public void test_Sort(){
		//test_01 ma = new test_01();
		//ma.setUtil(new utils());
		//ma.setSort(new Sort());
		Main ma = new Main();
		ma.setUtil(new utils());
		stus = ma.getUtil().readData();
		ma.setSort(new Sort());
		stus = ma.getSort().Sort((ArrayList<Student>) stus);
		ArrayList l = new ArrayList<Student>();
		double a[] = {178.0,178.0,184.0,257.0};
		Student s1 = new Student();
		for(int i = 0;i<stus.size();i++) {
			s1 = (Student) stus.get(i);
			 b[i]= s1.getSumScore();
		}
		Assert.assertArrayEquals(a, b,0);
	}
	
	public void test_All(){
		utils u = new utils();
		List<Student> l= new ArrayList<Student>();
		l = u.readData();
		//Read_Sort read_sort = new Read_Sort();
		//l = read_sort.Read_Sort(l);
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
