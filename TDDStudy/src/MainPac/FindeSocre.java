package MainPac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Student;

public class FindeSocre implements FindeScore_Interface{
	
	Student s = new Student();
	
	public void findScoreByNam(List<Student> list) {
		int i;
		s = null;
		//System.out.printf("%s", list.get(1).getEnglishScore());
		
		Scanner in=new Scanner(System.in);
		System.out.println("请输入姓名: ");
		String a=in.nextLine();//这是输入5261a
		
		if(a.equals("")) {
			System.out.println("！");
			return;
		}
		String name = list.get(0).getName();
		for(i=0;i<=list.size();i++) {
			name = list.get(i).getName();
			if(name.equals(a)) {
				s = list.get(i);
				break;
			}
			
		}
		
		System.out.printf("学号\t\t姓名\t\t性别\t\t数学\t\t英语\t\t语文\t\t专业课\t\t总分\n");
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
}
