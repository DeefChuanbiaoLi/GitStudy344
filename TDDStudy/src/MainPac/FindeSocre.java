package MainPac;

import java.util.List;

import entity.Student;

public class FindeSocre {


	int i;
	public void findScoreByNam(List<Student> list,String name) {
		for(i=0;i<list.size();++i) {
			if(list.get(i).getName().equals(name)) {
				break;
			};
		}
		System.out.println(list.get(i).toString());
	}
}
