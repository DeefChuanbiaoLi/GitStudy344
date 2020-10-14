/**
 * 
 */
package MainPac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Student;

/**
 * @author ASUS-PC
 *
 */
public class Sort implements Sort_Interface{

	/* (non-Javadoc)ASUS-PC上午10:27:48
	 * @see main.Sort_Interface#Sort()
	 */
	@Override
	public List Sort(List array) {
		// TODO Auto-generated method stub
//		Arrays.sort(array);
//		int[] array_ret = new int[array.length];
//		for(int i = 0;i<array.length;i++) {
//			array_ret[i] =array[array.length-i-1];
//		}
		ArrayList<Student> arrays = new ArrayList<Student>();
		for(Student s:(ArrayList<Student>)array) {
			//String s1=String.format("%4d",s.getEnglishScore());
//			System.out.printf("%s\t\t",s.getName());
//			System.out.printf("%d\t\t",s.getGender());
//			System.out.printf("%s\t\t",s.getMathScore());
//			System.out.printf("%s\t\t",s.getEnglishScore());
//			System.out.printf("%s\t\t",s.getPoliticsScore());
//			System.out.printf("%s\t\t",s.getProfessionalScore());
			
			
			System.out.println();
		}
//		Map<String, Long> counting = array.stream().collect(
//                Collectors.groupingBy(array::getName, Collectors.counting()));
//        System.out.println(counting); 
//        Map<String, Double> sum = array.stream().collect(
//                Collectors.groupingBy(array::getName, Collectors.summingDouble(array::getMathScore)));//根据名字进行groupby操作
//        System.out.println(sum);

		return null;
	}

}
