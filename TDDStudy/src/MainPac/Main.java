
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
		
		try {
			Read_Sort R = new Read_Sort();
			List<Student> stus= new ArrayList<Student>(); 
			
			String pathname = ".\\data.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
	        File filename = new File(pathname); // 要读取以上路径的data.txt文件
	        InputStreamReader reader = new InputStreamReader(
	                new FileInputStream(filename)); // 建立一个输入流对象reader
	        BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
	        String line = "";
	        double sumScore = 0;
	        line = br.readLine();
	        //for(int i = 0;i<2;i++) {
	        	while (line != null) {
	        		String[] sourceArray =  line.split(" ");
	        		//sumScore = Double.parseDouble(sourceArray[2])+Double.parseDouble(sourceArray[3])+Double.parseDouble(sourceArray[4])+Double.parseDouble(sourceArray[5]);
	        		stus.add(new Student(Integer.parseInt(sourceArray[0]),
	        				sourceArray[1],
	        				sourceArray[2],
	        				Double.parseDouble(sourceArray[3]),
	        				Double.parseDouble(sourceArray[4]),
	        				Double.parseDouble(sourceArray[5]),
	        				Double.parseDouble(sourceArray[6])));
		            line = br.readLine(); // 一次读入一行数据
		        }
	        //}
	        System.out.printf("学号\t\t姓名\t\t性别\t\t数学\t\t英语\t\t语文\t\t专业课\n");
			for(Student s:(ArrayList<Student>)stus) {
				//String s1=String.format("%4d",s.getEnglishScore());
				System.out.printf("%d\t\t",s.getSid());
				System.out.printf("%s\t\t",s.getName());
				System.out.printf("%s\t\t",s.getGender());
				System.out.printf("%s\t\t",s.getMathScore());
				System.out.printf("%s\t\t",s.getEnglishScore());
				System.out.printf("%s\t\t",s.getPoliticsScore());
				System.out.printf("%s\t\t",s.getProfessionalScore());
				System.out.println();
			}
			ArrayList l = new ArrayList<Student>();
			R.setSi(new Sort());
			l = R.Read_Sort(stus);
			//从这里添加代码
	        br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
