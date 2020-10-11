package TC;

import java.util.List;

import Student.Student;

public class Biggest {
	List studs;
	
	static int i=0;
	
	public static void biggest(List<Student> studs){
		while((i+1)<studs.size()){
			i++;
		}
		System.out.print("最高分是：");
		System.out.println(studs.get(i).getName()+"   "+studs.get(i).getScore());
			
		}
	}
