
package MainPac;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import Utils.utils;
import entity.Student;

/**
 * @author ASUS-PC
 *
 */
public class Main {
	Read_Sort_Interface si;
	public Read_Sort_Interface getSi() {
		return si;
	}
	public void setSi(Read_Sort_Interface si) {
		this.si = si;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Read_Sort R = new Read_Sort();
		utils u = new utils();
		List<Student> stus= new ArrayList<Student>(); 
		stus = u.readData();
	        System.out.printf("学号\t\t姓名\t\t性别\t\t数学\t\t英语\t\t语文\t\t专业课\t\t总分\n");
			for(Student s:(ArrayList<Student>)stus) {
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
			ArrayList l = new ArrayList<Student>();
			R.setSi(new Sort());
			l = R.Read_Sort(stus);
			
			//从这里添加代码
			
		
	}

}
