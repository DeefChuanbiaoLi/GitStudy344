/**
 * 
 */
package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import MainPac.Read_Sort;
import entity.Student;

/**
 * @author ASUS-PC
 *
 */
public class utils {
	
		public List<Student> readData(){
			List<Student> stus= new ArrayList<Student>(); 
			try {
				
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
			
		        	return stus;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return stus;
		}
	}
