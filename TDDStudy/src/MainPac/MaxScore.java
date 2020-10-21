/**
 * 
 */
package MainPac;

import java.util.ArrayList;

import entity.Student;

/**
 * @author ASUS-PC
 *
 */
public class MaxScore implements MaxScore_Interface{

	/* (non-Javadoc)ASUS-PC下午3:10:35
	 * @see MainPac.MaxScore_Interface#MaxScore(java.util.ArrayList)
	 */
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	double englishMax;
	double mathMax;
	double professionalMax;
	
	@Override
	public void MaxScore(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		s1 = list.get(0);
		englishMax= s1.getEnglishScore();
		mathMax= s1.getMathScore();
		professionalMax = s1.getProfessionalScore();
		for(int i = 1;i<list.size();i++) {
			if(list.get(i).getEnglishScore()>=englishMax) {
				englishMax = list.get(i).getEnglishScore();
				s1 = list.get(i);
			}
			if(list.get(i).getMathScore()>=mathMax) {
				mathMax = list.get(i).getMathScore();
				s2 = list.get(i);
			}
			if(list.get(i).getProfessionalScore()>=professionalMax) {
				professionalMax = list.get(i).getProfessionalScore();
				s3 = list.get(i);
			}
			
		}
		System.out.printf("英语最高分：%s",englishMax);
		System.out.printf("他是%s同学，大家鼓掌！\t\t\n",s1.getName());
		System.out.printf("数学最高分：%s",mathMax);
		System.out.printf("他是%s同学，大家鼓掌！\t\t\n",s2.getName());
		System.out.printf("专业课最高分：%s",professionalMax);
		System.out.printf("他是%s同学，大家鼓掌！\t\t\n",s3.getName());
		
	}

}
