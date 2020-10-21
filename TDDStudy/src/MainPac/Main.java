
package MainPac;
import java.util.ArrayList;
import Utils.util_Interface;
import Utils.utils;
import entity.Student;

public class Main{
	util_Interface util;
	Sort_Interface sort;
	AvgScore_Interface avg;
	ArrayList<Student> stus;
	FindeScore_Interface fin;
	MaxScore_Interface max;
	public FindeScore_Interface getFin() {
		return fin;
	}
	public void setFin(FindeScore_Interface fin) {
		this.fin = fin;
	}
	public AvgScore_Interface getAvg() {
		return avg;
	}
	public void setAvg(AvgScore_Interface avg) {
		this.avg = avg;
	}
	public Sort_Interface getSort() {
		return sort;
	}
	public void setSort(Sort_Interface sort) {
		this.sort = sort;
	}
	public util_Interface getUtil() {
		return util;
	}
	public void setUtil(util_Interface util) {
		this.util = util;
	}
	
	//运行过程
	public void execute() {
		//读取文件信息data.txt
		stus = (ArrayList<Student>) util.readData();
		//对学生信息排序
		stus = sort.Sort(stus);
		//求各科平均成绩
		avg.getScore(stus);
		//查找某个人的成绩
		fin.findScoreByNam(stus);
		//求各科最高分
		max.MaxScore(stus);
	}
	
	public MaxScore_Interface getMax() {
		return max;
	}
	public void setMax(MaxScore_Interface max) {
		this.max = max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma = new Main();
		ma.setUtil(new utils());
		ma.setSort(new Sort());
		ma.setAvg(new AvgScore());
		ma.setFin(new FindeSocre());
		ma.setMax(new MaxScore());
		ma.execute();
			
	}
	
}
