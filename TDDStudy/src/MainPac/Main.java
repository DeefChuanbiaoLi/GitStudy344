/**
 * 
 */
package MainPac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

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
		try {
			
			List<Student> stus= new ArrayList<Student>(); 
			
			String pathname = ".\\data.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
	        File filename = new File(pathname); // 要读取以上路径的input。txt文件
	        InputStreamReader reader = new InputStreamReader(
	                new FileInputStream(filename)); // 建立一个输入流对象reader
	        BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
	        String line = "";
	        line = br.readLine();
	        for(int i = 0;i<2;i++) {
	        	while (line != null) {
	        		String[] sourceArray =  line.split(" ");
	        		stus.add(new Student(sourceArray[0],
	        				Integer.parseInt(sourceArray[1]),
	        				Double.parseDouble(sourceArray[2]),
	        				Double.parseDouble(sourceArray[3]),
	        				Double.parseDouble(sourceArray[4]),
	        				Double.parseDouble(sourceArray[5])));
		            line = br.readLine(); // 一次读入一行数据
		        }
	        }
	        System.out.printf("姓名\t\t性别\t\t数学\t\t英语\t\t政治\t\t专业课\n");
			for(Student s:(ArrayList<Student>)stus) {
				//String s1=String.format("%4d",s.getEnglishScore());
				System.out.printf("%s\t\t",s.getName());
				System.out.printf("%d\t\t",s.getGender());
				System.out.printf("%s\t\t",s.getMathScore());
				System.out.printf("%s\t\t",s.getEnglishScore());
				System.out.printf("%s\t\t",s.getPoliticsScore());
				System.out.printf("%s\t\t",s.getProfessionalScore());
				System.out.println();
			}
	        br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
