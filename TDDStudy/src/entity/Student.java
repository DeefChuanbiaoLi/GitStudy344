/**
 * 
 */
package entity;

/**
 * @author ASUS-PC
 *
 */
public class Student {
	Integer Sid;
	String name;
	String gender;
	double englishScore;
	double mathScore;
	double politicsScore;
	double professionalScore;
	double sumScore;
	public double getSumScore() {
		return sumScore;
	}
	public void setSumScore(double sumScore) {
		this.sumScore = sumScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}
	public double getMathScore() {
		return mathScore;
	}
	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}
	public Integer getSid() {
		return Sid;
	}
	public void setSid(Integer sid) {
		Sid = sid;
	}
	public double getPoliticsScore() {
		return politicsScore;
	}
	public void setPoliticsScore(double politicsScore) {
		this.politicsScore = politicsScore;
	}
	public double getProfessionalScore() {
		return professionalScore;
	}
	public void setProfessionalScore(double professionalScore) {
		this.professionalScore = professionalScore;
	}
	public Student(Integer Sid,
			String name,
			String gender,
	double englishScore,
	double mathScore,
	double politicsScore,
	double professionalScore
	
			) {
		this.Sid = Sid;
		this.name = name;
		if(gender.equals("1")) {
			this.gender = "男";
		}else if(gender.equals("2")) {
			this.gender = "女";
		}else {
			this.gender = "不详";
		}
		
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.politicsScore = politicsScore;
		this.professionalScore = professionalScore;
		this.sumScore = englishScore+mathScore+politicsScore+professionalScore;
		//System.out.printf("当前学生总成绩是:%s\n",this.sumScore);
	}
	public Student() {
		
	}
	
}
