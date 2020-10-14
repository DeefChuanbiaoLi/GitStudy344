/**
 * 
 */
package MainPac;

import java.util.ArrayList;

/**
 * @author ASUS-PC
 *
 */
public class Read_Sort implements Read_Sort_Interface{

	/* (non-Javadoc)ASUS-PC上午10:08:51
	 * @see main.Read_Sort_Interface#Read_Sort(java.util.ArrayList)
	 */
	Sort_Interface si;
	
	public void setSi(Sort_Interface si) {
		this.si = si;
	}
	@Override
	public int[] Read_Sort(ArrayList list) {
		// TODO Auto-generated method stub
		//int[] array
		int[] array = read(list);
		return sort(array);
		
	}
	public int[] read(ArrayList array) {
		int[] array1 = new int[array.size()];
		for(int i = 0;i<array.size();i++) {
			array1[i]= (int)array.get(i);
		}
		return array1;
		
	}
	public int[] sort(int[] array) {
			return si.Sort(array);
	}

}
