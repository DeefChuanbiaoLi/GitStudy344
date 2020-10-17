/**
 * 
 */
package entity;

/**
 * @author ASUS-PC
 *
 */
public class Student {
	String name;
	int gender;
	double englishScore;
	double mathScore;
	double politicsScore;
	double professionalScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
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
	public Student(String name,
	int gender,
	double englishScore,
	double mathScore,
	double politicsScore,
	double professionalScore) {
		this.name = name;
		this.gender = gender;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.politicsScore = politicsScore;
		this.professionalScore = professionalScore;
		System.out.printf("当前学生总成绩是:%s\n",this.englishScore+this.mathScore+this.politicsScore+this.professionalScore);
	}
	public Student() {
		
	}
	
}
