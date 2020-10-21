package MainPac;

import java.util.List;

import entity.Student;

public class AvgScore_HigScore {

	double mathSum;
	double englishSum;
	double proSum;
	double ploSum;
	int num;
	public void getScore(List<Student> list) {
		num=list.size()-1;
		for(int i=0;i<list.size();++i) {
			
			englishSum += list.get(i).getEnglishScore();
		}
		System.out.println("英语平均成绩："+" "+englishSum/num);
		for(int i=0;i<list.size();++i) {
			mathSum += list.get(i).getMathScore();
		}
		System.out.println("数学平均成绩："+" "+mathSum/num);
		for(int i=0;i<list.size();++i) {
			ploSum += list.get(i).getPoliticsScore();
		}
		System.out.println("政治平均成绩："+" "+ploSum/num);
		for(int i=0;i<list.size();++i) {
			proSum += list.get(i).getProfessionalScore();
		}
		System.out.println("专业平均成绩："+" "+proSum/num);
	}
}
