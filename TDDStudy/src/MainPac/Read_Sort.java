
package MainPac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.Student;

public class Read_Sort implements Read_Sort_Interface{

	Sort_Interface si;
	
	public void setSi(Sort_Interface si) {
		this.si = si;
	}
	@Override
	public ArrayList<Student> Read_Sort(List<Student> stus) {
		// TODO Auto-generated method stub
		//int[] array
		ArrayList<Student> list01 = new ArrayList<Student>();
		for(Student s:(ArrayList<Student>)stus) {
			//String s1=String.format("%4d",s.getEnglishScore());
			list01.add(s);
			System.out.println();
		}
		return sort(list01);
		
	}
//	public int[] read(ArrayList array) {
//		int[] array1 = new int[array.size()];
//		for(int i = 0;i<array.size();i++) {
//			array1[i]= (int)array.get(i);
//		}
//		return array1;
//		
//	}
	public ArrayList<Student> sort(ArrayList<Student> array) {
			return si.Sort(array);
	}

}
